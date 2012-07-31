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
package org.eclipse.gmt.modisco.kdm.browser.extension.data;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.kdm.browser.extension.Activator;
import org.eclipse.gmt.modisco.omg.kdm.data.AbstractContentElement;
import org.eclipse.gmt.modisco.omg.kdm.data.AbstractDataElement;
import org.eclipse.gmt.modisco.omg.kdm.data.AbstractDataRelationship;
import org.eclipse.gmt.modisco.omg.kdm.data.AllContent;
import org.eclipse.gmt.modisco.omg.kdm.data.Catalog;
import org.eclipse.gmt.modisco.omg.kdm.data.ChoiceContent;
import org.eclipse.gmt.modisco.omg.kdm.data.ColumnSet;
import org.eclipse.gmt.modisco.omg.kdm.data.ComplexContentType;
import org.eclipse.gmt.modisco.omg.kdm.data.ContentAttribute;
import org.eclipse.gmt.modisco.omg.kdm.data.ContentElement;
import org.eclipse.gmt.modisco.omg.kdm.data.ContentItem;
import org.eclipse.gmt.modisco.omg.kdm.data.ContentReference;
import org.eclipse.gmt.modisco.omg.kdm.data.ContentRestriction;
import org.eclipse.gmt.modisco.omg.kdm.data.DataAction;
import org.eclipse.gmt.modisco.omg.kdm.data.DataContainer;
import org.eclipse.gmt.modisco.omg.kdm.data.DataEvent;
import org.eclipse.gmt.modisco.omg.kdm.data.DataModel;
import org.eclipse.gmt.modisco.omg.kdm.data.DataRelationship;
import org.eclipse.gmt.modisco.omg.kdm.data.DataResource;
import org.eclipse.gmt.modisco.omg.kdm.data.DataSegment;
import org.eclipse.gmt.modisco.omg.kdm.data.DatatypeOf;
import org.eclipse.gmt.modisco.omg.kdm.data.ExtendedDataElement;
import org.eclipse.gmt.modisco.omg.kdm.data.ExtensionTo;
import org.eclipse.gmt.modisco.omg.kdm.data.GroupContent;
import org.eclipse.gmt.modisco.omg.kdm.data.HasContent;
import org.eclipse.gmt.modisco.omg.kdm.data.Index;
import org.eclipse.gmt.modisco.omg.kdm.data.IndexElement;
import org.eclipse.gmt.modisco.omg.kdm.data.KeyRelation;
import org.eclipse.gmt.modisco.omg.kdm.data.ManagesData;
import org.eclipse.gmt.modisco.omg.kdm.data.MixedContent;
import org.eclipse.gmt.modisco.omg.kdm.data.ProducesDataEvent;
import org.eclipse.gmt.modisco.omg.kdm.data.ReadsColumnSet;
import org.eclipse.gmt.modisco.omg.kdm.data.RecordFile;
import org.eclipse.gmt.modisco.omg.kdm.data.ReferenceKey;
import org.eclipse.gmt.modisco.omg.kdm.data.ReferenceTo;
import org.eclipse.gmt.modisco.omg.kdm.data.RelationalSchema;
import org.eclipse.gmt.modisco.omg.kdm.data.RelationalTable;
import org.eclipse.gmt.modisco.omg.kdm.data.RelationalView;
import org.eclipse.gmt.modisco.omg.kdm.data.RestrictionOf;
import org.eclipse.gmt.modisco.omg.kdm.data.SeqContent;
import org.eclipse.gmt.modisco.omg.kdm.data.SimpleContentType;
import org.eclipse.gmt.modisco.omg.kdm.data.TypedBy;
import org.eclipse.gmt.modisco.omg.kdm.data.UniqueKey;
import org.eclipse.gmt.modisco.omg.kdm.data.WritesColumnSet;
import org.eclipse.gmt.modisco.omg.kdm.data.XMLSchema;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class IconProvider implements
		org.eclipse.gmt.modisco.infra.browser.uicore.extensions.icons.IconProvider {
	// Start of user code Image attribute for RelationalTable
	private final Image RelationalTableImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for RelationalView
	private final Image RelationalViewImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for RecordFile
	private final Image RecordFileImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for DataSegment
	private final Image DataSegmentImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for UniqueKey
	private final Image UniqueKeyImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Index
	private final Image IndexImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ReferenceKey
	private final Image ReferenceKeyImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Catalog
	private final Image CatalogImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for RelationalSchema
	private final Image RelationalSchemaImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ColumnSet
	private final Image ColumnSetImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for AllContent
	private final Image AllContentImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for SeqContent
	private final Image SeqContentImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ChoiceContent
	private final Image ChoiceContentImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for GroupContent
	private final Image GroupContentImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for SimpleContentType
	private final Image SimpleContentTypeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for MixedContent
	private final Image MixedContentImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ContentReference
	private final Image ContentReferenceImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ContentAttribute
	private final Image ContentAttributeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ContentElement
	private final Image ContentElementImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for IndexElement
	private final Image IndexElementImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for DataContainer
	private final Image DataContainerImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for DataEvent
	private final Image DataEventImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ComplexContentType
	private final Image ComplexContentTypeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ContentItem
	private final Image ContentItemImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ContentRestriction
	private final Image ContentRestrictionImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for DataModel
	private final Image DataModelImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for DataResource
	private final Image DataResourceImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for KeyRelation
	private final Image KeyRelationImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for XMLSchema
	private final Image XMLSchemaImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for AbstractContentElement
	private final Image AbstractContentElementImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ExtendedDataElement
	private final Image ExtendedDataElementImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for DataRelationship
	private final Image DataRelationshipImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for DataAction
	private final Image DataActionImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ReadsColumnSet
	private final Image ReadsColumnSetImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for TypedBy
	private final Image TypedByImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ReferenceTo
	private final Image ReferenceToImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for RestrictionOf
	private final Image RestrictionOfImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ExtensionTo
	private final Image ExtensionToImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for DatatypeOf
	private final Image DatatypeOfImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for HasContent
	private final Image HasContentImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for WritesColumnSet
	private final Image WritesColumnSetImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ProducesDataEvent
	private final Image ProducesDataEventImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ManagesData
	private final Image ManagesDataImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for AbstractDataElement
	private final Image AbstractDataElementImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for AbstractDataRelationship
	private final Image AbstractDataRelationshipImage = createImage(""); //$NON-NLS-1$

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
		if (eObject instanceof RelationalTable) {
			result = this.RelationalTableImage;
		} else if (eObject instanceof RelationalView) {
			result = this.RelationalViewImage;
		} else if (eObject instanceof RecordFile) {
			result = this.RecordFileImage;
		} else if (eObject instanceof DataSegment) {
			result = this.DataSegmentImage;
		} else if (eObject instanceof UniqueKey) {
			result = this.UniqueKeyImage;
		} else if (eObject instanceof Index) {
			result = this.IndexImage;
		} else if (eObject instanceof ReferenceKey) {
			result = this.ReferenceKeyImage;
		} else if (eObject instanceof Catalog) {
			result = this.CatalogImage;
		} else if (eObject instanceof RelationalSchema) {
			result = this.RelationalSchemaImage;
		} else if (eObject instanceof ColumnSet) {
			result = this.ColumnSetImage;
		} else if (eObject instanceof AllContent) {
			result = this.AllContentImage;
		} else if (eObject instanceof SeqContent) {
			result = this.SeqContentImage;
		} else if (eObject instanceof ChoiceContent) {
			result = this.ChoiceContentImage;
		} else if (eObject instanceof GroupContent) {
			result = this.GroupContentImage;
		} else if (eObject instanceof SimpleContentType) {
			result = this.SimpleContentTypeImage;
		} else if (eObject instanceof MixedContent) {
			result = this.MixedContentImage;
		} else if (eObject instanceof ContentReference) {
			result = this.ContentReferenceImage;
		} else if (eObject instanceof ContentAttribute) {
			result = this.ContentAttributeImage;
		} else if (eObject instanceof ContentElement) {
			result = this.ContentElementImage;
		} else if (eObject instanceof IndexElement) {
			result = this.IndexElementImage;
		} else if (eObject instanceof DataContainer) {
			result = this.DataContainerImage;
		} else if (eObject instanceof DataEvent) {
			result = this.DataEventImage;
		} else if (eObject instanceof ComplexContentType) {
			result = this.ComplexContentTypeImage;
		} else if (eObject instanceof ContentItem) {
			result = this.ContentItemImage;
		} else if (eObject instanceof ContentRestriction) {
			result = this.ContentRestrictionImage;
		} else if (eObject instanceof DataModel) {
			result = this.DataModelImage;
		} else if (eObject instanceof DataResource) {
			result = this.DataResourceImage;
		} else if (eObject instanceof KeyRelation) {
			result = this.KeyRelationImage;
		} else if (eObject instanceof XMLSchema) {
			result = this.XMLSchemaImage;
		} else if (eObject instanceof AbstractContentElement) {
			result = this.AbstractContentElementImage;
		} else if (eObject instanceof ExtendedDataElement) {
			result = this.ExtendedDataElementImage;
		} else if (eObject instanceof DataRelationship) {
			result = this.DataRelationshipImage;
		} else if (eObject instanceof DataAction) {
			result = this.DataActionImage;
		} else if (eObject instanceof ReadsColumnSet) {
			result = this.ReadsColumnSetImage;
		} else if (eObject instanceof TypedBy) {
			result = this.TypedByImage;
		} else if (eObject instanceof ReferenceTo) {
			result = this.ReferenceToImage;
		} else if (eObject instanceof RestrictionOf) {
			result = this.RestrictionOfImage;
		} else if (eObject instanceof ExtensionTo) {
			result = this.ExtensionToImage;
		} else if (eObject instanceof DatatypeOf) {
			result = this.DatatypeOfImage;
		} else if (eObject instanceof HasContent) {
			result = this.HasContentImage;
		} else if (eObject instanceof WritesColumnSet) {
			result = this.WritesColumnSetImage;
		} else if (eObject instanceof ProducesDataEvent) {
			result = this.ProducesDataEventImage;
		} else if (eObject instanceof ManagesData) {
			result = this.ManagesDataImage;
		} else if (eObject instanceof AbstractDataElement) {
			result = this.AbstractDataElementImage;
		} else if (eObject instanceof AbstractDataRelationship) {
			result = this.AbstractDataRelationshipImage;
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
			ImageDescriptor descriptor = Activator.getImageDescriptor("icons/kdm/data/" //$NON-NLS-1$
					+ resourcePath);
			if (descriptor != null) {
				result = descriptor.createImage();
			}
		}
		return result;
	}

}
