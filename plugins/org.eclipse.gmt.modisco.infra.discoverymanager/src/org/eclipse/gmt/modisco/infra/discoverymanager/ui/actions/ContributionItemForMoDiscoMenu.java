/**
 * Copyright (c) 2009, 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *    Nicolas Bros (Mia-Software) - Bug 344117 - NPE during context menu generation prevents 'Progress' view from coming up
 *******************************************************************************/

package org.eclipse.gmt.modisco.infra.discoverymanager.ui.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryManager;
import org.eclipse.gmt.modisco.infra.discoverymanager.Messages;
import org.eclipse.gmt.modisco.infra.discoverymanager.handlers.DiscovererHandler;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MenuEvent;
import org.eclipse.swt.events.MenuListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.menus.IWorkbenchContribution;
import org.eclipse.ui.services.IServiceLocator;

/**
 * @author Gabriel Barbier
 * 
 * 
 * @deprecated use org.eclipse.modisco.infra.discovery.core framework
 */
@Deprecated
public class ContributionItemForMoDiscoMenu extends ContributionItem implements
		IWorkbenchContribution {

	private ISelectionService selectionService;

	public void initialize(final IServiceLocator serviceLocator) {
		this.selectionService = (ISelectionService) serviceLocator
				.getService(ISelectionService.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.action.ContributionItem#fill(org.eclipse.swt.widgets
	 * .Menu, int)
	 */
	@Override
	public void fill(final Menu menu, final int index) {
		super.fill(menu, index);

		ISelection selection = this.selectionService.getSelection();
		// ClassCastException in Eclipse 3.5 : TextSelection /
		// IStructuredSelection ...
		if (selection instanceof IStructuredSelection && !selection.isEmpty()) {
			final IStructuredSelection structuredSelection = (IStructuredSelection) selection;

			MenuItem modiscoItem = new MenuItem(menu, SWT.CASCADE, index);
			modiscoItem.setText(Messages.ContributionItemForMoDiscoMenu_0);

			modiscoItem.setImage(getMoDiscoImage());

			// Add MoDisco menu
			final Menu modiscoMenu = new Menu(modiscoItem);
			modiscoItem.setMenu(modiscoMenu);

			modiscoMenu.addMenuListener(new MenuListener() {
				public void menuShown(final MenuEvent event) {
					for (MenuItem menuItem : modiscoMenu.getItems()) {
						menuItem.dispose();
					}
					/*
					 * Items and sub-menus will only be available if they match
					 * selected resources.
					 * 
					 * First, retrieve selected resource
					 * 
					 * Second, check if available discoverers handle it
					 * 
					 * Third, if discoverers list is not empty, we will create a
					 * menu item for each. For each menu item, we have to link
					 * menu action to menu event like usual menu.
					 */
					final List<DiscovererHandler> discoverers = new ArrayList<DiscovererHandler>();
					// retrieve selected item
					try {
						/*
						 * for multiple selection, we have to check each
						 * selected object separately.
						 */
						Object[] selectedObjects = structuredSelection.toArray();
						for (DiscovererHandler discoverer : DiscoveryManager.getDefault()
								.getDiscovererHandlers()) {
							boolean applyTo = true;
							for (int i = 0; applyTo && (i < selectedObjects.length); i++) {
								Object selectedObject = selectedObjects[i];
								// check discoverer compatibility
								applyTo = discoverer.isApplicableTo(selectedObject);
							}
							if (applyTo) {
								discoverers.add(discoverer);
							}
						}

						if (discoverers.size() > 0) {
							for (DiscovererHandler discoverer : discoverers) {
								// management of intermediate menu
								createMenuForDiscoverer(discoverer, modiscoMenu, selectedObjects);
							}
						} else {
							MenuItem discovererMenu = new MenuItem(modiscoMenu, SWT.PUSH);
							discovererMenu
									.setText(Messages.ContributionItemForMoDiscoMenu_noApplicableDiscoverer);
							discovererMenu.setEnabled(false);
						}
					} catch (Exception e) {
						MoDiscoLogger.logError(e, DiscoveryManager.getDefault());
					}
				}

				public void menuHidden(final MenuEvent e) {
					//
				}
			});
		}
	}

	private final void createMenuForDiscoverer(final DiscovererHandler discoverer,
			final Menu modiscoMenu, final Object[] selectedObjects) {
		Menu parentMenu = modiscoMenu;
		if ((discoverer.getPaths() != null) && (discoverer.getPaths().length > 0)) {
			for (String pathEntry : discoverer.getPaths()) {
				MenuItem intermediateMenu = null;
				for (MenuItem item : parentMenu.getItems()) {
					if (item.getText().equalsIgnoreCase(pathEntry)) {
						intermediateMenu = item;
					}
				}
				if (intermediateMenu == null) {
					intermediateMenu = new MenuItem(parentMenu, SWT.CASCADE,
							parentMenu.getItemCount());
					intermediateMenu.setText(pathEntry);
					parentMenu = new Menu(intermediateMenu);
					intermediateMenu.setMenu(parentMenu);
				} else {
					parentMenu = intermediateMenu.getMenu();
				}
			}
		}
		// final menu
		MenuItem discovererMenu = new MenuItem(parentMenu, SWT.PUSH, 0);
		discovererMenu.setText(discoverer.getName());
		if (discoverer.getImageIcon() != null) {
			discovererMenu.setImage(discoverer.getImageIcon());
		}
		MenuListenerHandler handler = new MenuListenerHandler(discoverer, selectedObjects, null);
		discovererMenu.addSelectionListener(handler);
	}

	private Image image;

	private final Image getMoDiscoImage() {
		if (this.image == null) {
			ImageDescriptor descriptor = DiscoveryManager.getImageDescriptor("logoMoDiscoMini.gif"); //$NON-NLS-1$
			if (descriptor != null) {
				this.image = descriptor.createImage();
			}
		}
		return this.image;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.action.ContributionItem#isDynamic()
	 */
	@Override
	public boolean isDynamic() {
		return true;
	}

}
