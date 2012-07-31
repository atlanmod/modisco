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
import org.eclipse.gmt.modisco.infra.browser.uicore.extensions.naming.AbstractNameProvider;
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

/**
 * @generated
 */
public class NameProvider extends AbstractNameProvider {
	// Start of user code for additional methods and attributes

	// End of user code

	// Start of user code name attribute for RelationalTable
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getRelationalTableName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for RelationalView
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getRelationalViewName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for RecordFile
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getRecordFileName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for DataSegment
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getDataSegmentName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for UniqueKey
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getUniqueKeyName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for Index
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getIndexName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ReferenceKey
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getReferenceKeyName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for Catalog
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getCatalogName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for RelationalSchema
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getRelationalSchemaName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ColumnSet
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getColumnSetName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for AllContent
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getAllContentName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for SeqContent
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getSeqContentName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ChoiceContent
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getChoiceContentName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for GroupContent
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getGroupContentName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for SimpleContentType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getSimpleContentTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for MixedContent
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getMixedContentName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ContentReference
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getContentReferenceName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ContentAttribute
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getContentAttributeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ContentElement
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getContentElementName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for IndexElement
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getIndexElementName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for DataContainer
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getDataContainerName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for DataEvent
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getDataEventName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ComplexContentType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getComplexContentTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ContentItem
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getContentItemName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ContentRestriction
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getContentRestrictionName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for DataModel
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getDataModelName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for DataResource
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getDataResourceName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for KeyRelation
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getKeyRelationName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for XMLSchema
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getXMLSchemaName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for AbstractContentElement
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getAbstractContentElementName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ExtendedDataElement
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getExtendedDataElementName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for DataRelationship
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getDataRelationshipName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for DataAction
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getDataActionName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ReadsColumnSet
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getReadsColumnSetName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for TypedBy
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getTypedByName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ReferenceTo
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getReferenceToName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for RestrictionOf
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getRestrictionOfName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ExtensionTo
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getExtensionToName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for DatatypeOf
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getDatatypeOfName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for HasContent
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getHasContentName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for WritesColumnSet
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getWritesColumnSetName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ProducesDataEvent
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getProducesDataEventName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ManagesData
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getManagesDataName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for AbstractDataElement
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getAbstractDataElementName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for AbstractDataRelationship
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getAbstractDataRelationshipName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code

	/**
	 * @generated
	 */
	public NameProvider() {
		//
	}

	/**
	 * @return the name that must be displayed for the given {@link EObject}, or
	 *         <code>null</code> to keep the default name (or let another
	 *         {@link NameProvider} provide the name)
	 * 
	 * @generated
	 */
	public String getName(final EObject eObject) {
		String result = getDefaultName(eObject);
		if (eObject instanceof RelationalTable) {
			result = getRelationalTableName(eObject);
		} else if (eObject instanceof RelationalView) {
			result = getRelationalViewName(eObject);
		} else if (eObject instanceof RecordFile) {
			result = getRecordFileName(eObject);
		} else if (eObject instanceof DataSegment) {
			result = getDataSegmentName(eObject);
		} else if (eObject instanceof UniqueKey) {
			result = getUniqueKeyName(eObject);
		} else if (eObject instanceof Index) {
			result = getIndexName(eObject);
		} else if (eObject instanceof ReferenceKey) {
			result = getReferenceKeyName(eObject);
		} else if (eObject instanceof Catalog) {
			result = getCatalogName(eObject);
		} else if (eObject instanceof RelationalSchema) {
			result = getRelationalSchemaName(eObject);
		} else if (eObject instanceof ColumnSet) {
			result = getColumnSetName(eObject);
		} else if (eObject instanceof AllContent) {
			result = getAllContentName(eObject);
		} else if (eObject instanceof SeqContent) {
			result = getSeqContentName(eObject);
		} else if (eObject instanceof ChoiceContent) {
			result = getChoiceContentName(eObject);
		} else if (eObject instanceof GroupContent) {
			result = getGroupContentName(eObject);
		} else if (eObject instanceof SimpleContentType) {
			result = getSimpleContentTypeName(eObject);
		} else if (eObject instanceof MixedContent) {
			result = getMixedContentName(eObject);
		} else if (eObject instanceof ContentReference) {
			result = getContentReferenceName(eObject);
		} else if (eObject instanceof ContentAttribute) {
			result = getContentAttributeName(eObject);
		} else if (eObject instanceof ContentElement) {
			result = getContentElementName(eObject);
		} else if (eObject instanceof IndexElement) {
			result = getIndexElementName(eObject);
		} else if (eObject instanceof DataContainer) {
			result = getDataContainerName(eObject);
		} else if (eObject instanceof DataEvent) {
			result = getDataEventName(eObject);
		} else if (eObject instanceof ComplexContentType) {
			result = getComplexContentTypeName(eObject);
		} else if (eObject instanceof ContentItem) {
			result = getContentItemName(eObject);
		} else if (eObject instanceof ContentRestriction) {
			result = getContentRestrictionName(eObject);
		} else if (eObject instanceof DataModel) {
			result = getDataModelName(eObject);
		} else if (eObject instanceof DataResource) {
			result = getDataResourceName(eObject);
		} else if (eObject instanceof KeyRelation) {
			result = getKeyRelationName(eObject);
		} else if (eObject instanceof XMLSchema) {
			result = getXMLSchemaName(eObject);
		} else if (eObject instanceof AbstractContentElement) {
			result = getAbstractContentElementName(eObject);
		} else if (eObject instanceof ExtendedDataElement) {
			result = getExtendedDataElementName(eObject);
		} else if (eObject instanceof DataRelationship) {
			result = getDataRelationshipName(eObject);
		} else if (eObject instanceof DataAction) {
			result = getDataActionName(eObject);
		} else if (eObject instanceof ReadsColumnSet) {
			result = getReadsColumnSetName(eObject);
		} else if (eObject instanceof TypedBy) {
			result = getTypedByName(eObject);
		} else if (eObject instanceof ReferenceTo) {
			result = getReferenceToName(eObject);
		} else if (eObject instanceof RestrictionOf) {
			result = getRestrictionOfName(eObject);
		} else if (eObject instanceof ExtensionTo) {
			result = getExtensionToName(eObject);
		} else if (eObject instanceof DatatypeOf) {
			result = getDatatypeOfName(eObject);
		} else if (eObject instanceof HasContent) {
			result = getHasContentName(eObject);
		} else if (eObject instanceof WritesColumnSet) {
			result = getWritesColumnSetName(eObject);
		} else if (eObject instanceof ProducesDataEvent) {
			result = getProducesDataEventName(eObject);
		} else if (eObject instanceof ManagesData) {
			result = getManagesDataName(eObject);
		} else if (eObject instanceof AbstractDataElement) {
			result = getAbstractDataElementName(eObject);
		} else if (eObject instanceof AbstractDataRelationship) {
			result = getAbstractDataRelationshipName(eObject);
		}
		return result;
	}

}
