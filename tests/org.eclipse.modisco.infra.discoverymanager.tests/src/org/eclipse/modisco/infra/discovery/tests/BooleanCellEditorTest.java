/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.tests;

import static org.junit.Assert.assertEquals;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.junit.Test;

public class BooleanCellEditorTest {

	private static SWTWorkbenchBot bot = new SWTWorkbenchBot();

	@Test
	public void testBooleanCellEditor() {
		SWTWorkbenchBot bot = BooleanCellEditorTest.bot;
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				BooleanCellEditorTestDialog dialog = new BooleanCellEditorTestDialog(null);
				dialog.setBlockOnOpen(false);
				dialog.open();
			}
		});
		bot.tree().getTreeItem("abc").click(1);
		bot.ccomboBox().setSelection("true");
		assertEquals("true", bot.ccomboBox().getText());
		bot.ccomboBox().setSelection("false");
		assertEquals("false", bot.ccomboBox().getText());
		
		bot.tree().getTreeItem("def").click(1);
		bot.ccomboBox().setSelection("false");
		assertEquals("false", bot.ccomboBox().getText());
		bot.ccomboBox().setSelection("true");
		assertEquals("true", bot.ccomboBox().getText());
	}
}
