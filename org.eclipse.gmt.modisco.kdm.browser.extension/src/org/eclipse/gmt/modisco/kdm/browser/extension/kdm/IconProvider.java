/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.kdm.browser.extension.kdm;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.kdm.browser.extension.Activator;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Annotation;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Attribute;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Audit;
import org.eclipse.gmt.modisco.omg.kdm.kdm.ExtendedValue;
import org.eclipse.gmt.modisco.omg.kdm.kdm.ExtensionFamily;
import org.eclipse.gmt.modisco.omg.kdm.kdm.KDMFramework;
import org.eclipse.gmt.modisco.omg.kdm.kdm.KDMModel;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Segment;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Stereotype;
import org.eclipse.gmt.modisco.omg.kdm.kdm.TagDefinition;
import org.eclipse.gmt.modisco.omg.kdm.kdm.TaggedRef;
import org.eclipse.gmt.modisco.omg.kdm.kdm.TaggedValue;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class IconProvider implements
		org.eclipse.gmt.modisco.infra.browser.uicore.extensions.icons.IconProvider {
	// Start of user code Image attribute for KDMModel
	private final Image KDMModelImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Segment
	private final Image SegmentImage = createImage("kdmsdk_16.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for KDMFramework
	private final Image KDMFrameworkImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for TaggedValue
	private final Image TaggedValueImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for TaggedRef
	private final Image TaggedRefImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Audit
	private final Image AuditImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Stereotype
	private final Image StereotypeImage = createImage("Stereotype.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for TagDefinition
	private final Image TagDefinitionImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ExtensionFamily
	private final Image ExtensionFamilyImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ExtendedValue
	private final Image ExtendedValueImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Attribute
	private final Image AttributeImage = createImage("attribute_obj.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Annotation
	private final Image AnnotationImage = createImage("annotation_obj.gif"); //$NON-NLS-1$

	// End of user code

	/**
	 * @generated
	 */
	public IconProvider() {
		//
	}

	/**
	 * @return the icon that must be displayed for the given {@link EObject}, or
	 *         <code>null</code> to keep the default icon, which can be empty,
	 *         or let another {@link IconProvider} provide the icon
	 * @generated
	 */
	public Image getIcon(final EObject eObject) {
		Image result = null;
		if (eObject instanceof KDMModel) {
			result = this.KDMModelImage;
		} else if (eObject instanceof Segment) {
			result = this.SegmentImage;
		} else if (eObject instanceof KDMFramework) {
			result = this.KDMFrameworkImage;
		} else if (eObject instanceof TaggedValue) {
			result = this.TaggedValueImage;
		} else if (eObject instanceof TaggedRef) {
			result = this.TaggedRefImage;
		} else if (eObject instanceof Audit) {
			result = this.AuditImage;
		} else if (eObject instanceof Stereotype) {
			result = this.StereotypeImage;
		} else if (eObject instanceof TagDefinition) {
			result = this.TagDefinitionImage;
		} else if (eObject instanceof ExtensionFamily) {
			result = this.ExtensionFamilyImage;
		} else if (eObject instanceof ExtendedValue) {
			result = this.ExtendedValueImage;
		} else if (eObject instanceof Attribute) {
			result = this.AttributeImage;
		} else if (eObject instanceof Annotation) {
			result = this.AnnotationImage;
		}

		return result;

	}

	/**
	 * Create an image from a resource in the bundle (plugin)
	 * 
	 * @param resourcePath
	 *            the path of the resource (in the bundle)
	 * @return the image
	 * @generated
	 */
	private Image createImage(final String resourcePath) {
		Image result = null;
		if ((resourcePath != null) && (resourcePath.length() > 0)) {
			ImageDescriptor descriptor = Activator.getImageDescriptor("icons/kdm/kdm/" //$NON-NLS-1$
					+ resourcePath);
			if (descriptor != null) {
				result = descriptor.createImage();
			}
		}
		return result;
	}

}
