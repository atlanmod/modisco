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
package org.eclipse.gmt.modisco.kdm.browser.extension.code;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.infra.browser.uicore.extensions.naming.AbstractNameProvider;
import org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeElement;
import org.eclipse.gmt.modisco.omg.kdm.code.AbstractCodeRelationship;
import org.eclipse.gmt.modisco.omg.kdm.code.ArrayType;
import org.eclipse.gmt.modisco.omg.kdm.code.BagType;
import org.eclipse.gmt.modisco.omg.kdm.code.BitType;
import org.eclipse.gmt.modisco.omg.kdm.code.BitstringType;
import org.eclipse.gmt.modisco.omg.kdm.code.BooleanType;
import org.eclipse.gmt.modisco.omg.kdm.code.CallableUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.CharType;
import org.eclipse.gmt.modisco.omg.kdm.code.ChoiceType;
import org.eclipse.gmt.modisco.omg.kdm.code.ClassUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeAssembly;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeElement;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeItem;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeModel;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeRelationship;
import org.eclipse.gmt.modisco.omg.kdm.code.CommentUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.CompilationUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.CompositeType;
import org.eclipse.gmt.modisco.omg.kdm.code.ComputationalObject;
import org.eclipse.gmt.modisco.omg.kdm.code.ConditionalDirective;
import org.eclipse.gmt.modisco.omg.kdm.code.ControlElement;
import org.eclipse.gmt.modisco.omg.kdm.code.DataElement;
import org.eclipse.gmt.modisco.omg.kdm.code.Datatype;
import org.eclipse.gmt.modisco.omg.kdm.code.DateType;
import org.eclipse.gmt.modisco.omg.kdm.code.DecimalType;
import org.eclipse.gmt.modisco.omg.kdm.code.DefinedType;
import org.eclipse.gmt.modisco.omg.kdm.code.DerivedType;
import org.eclipse.gmt.modisco.omg.kdm.code.EnumeratedType;
import org.eclipse.gmt.modisco.omg.kdm.code.Expands;
import org.eclipse.gmt.modisco.omg.kdm.code.Extends;
import org.eclipse.gmt.modisco.omg.kdm.code.FloatType;
import org.eclipse.gmt.modisco.omg.kdm.code.GeneratedFrom;
import org.eclipse.gmt.modisco.omg.kdm.code.HasType;
import org.eclipse.gmt.modisco.omg.kdm.code.HasValue;
import org.eclipse.gmt.modisco.omg.kdm.code.ImplementationOf;
import org.eclipse.gmt.modisco.omg.kdm.code.Implements;
import org.eclipse.gmt.modisco.omg.kdm.code.Imports;
import org.eclipse.gmt.modisco.omg.kdm.code.IncludeDirective;
import org.eclipse.gmt.modisco.omg.kdm.code.Includes;
import org.eclipse.gmt.modisco.omg.kdm.code.IndexUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.InstanceOf;
import org.eclipse.gmt.modisco.omg.kdm.code.IntegerType;
import org.eclipse.gmt.modisco.omg.kdm.code.InterfaceUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.ItemUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.LanguageUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.MacroDirective;
import org.eclipse.gmt.modisco.omg.kdm.code.MacroUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.MemberUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.MethodUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.Module;
import org.eclipse.gmt.modisco.omg.kdm.code.Namespace;
import org.eclipse.gmt.modisco.omg.kdm.code.OctetType;
import org.eclipse.gmt.modisco.omg.kdm.code.OctetstringType;
import org.eclipse.gmt.modisco.omg.kdm.code.OrdinalType;
import org.eclipse.gmt.modisco.omg.kdm.code.Package;
import org.eclipse.gmt.modisco.omg.kdm.code.ParameterTo;
import org.eclipse.gmt.modisco.omg.kdm.code.ParameterUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.PointerType;
import org.eclipse.gmt.modisco.omg.kdm.code.PreprocessorDirective;
import org.eclipse.gmt.modisco.omg.kdm.code.PrimitiveType;
import org.eclipse.gmt.modisco.omg.kdm.code.RangeType;
import org.eclipse.gmt.modisco.omg.kdm.code.RecordType;
import org.eclipse.gmt.modisco.omg.kdm.code.Redefines;
import org.eclipse.gmt.modisco.omg.kdm.code.ScaledType;
import org.eclipse.gmt.modisco.omg.kdm.code.SequenceType;
import org.eclipse.gmt.modisco.omg.kdm.code.SetType;
import org.eclipse.gmt.modisco.omg.kdm.code.SharedUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.Signature;
import org.eclipse.gmt.modisco.omg.kdm.code.StorableUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.StringType;
import org.eclipse.gmt.modisco.omg.kdm.code.SynonymUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.TemplateParameter;
import org.eclipse.gmt.modisco.omg.kdm.code.TemplateType;
import org.eclipse.gmt.modisco.omg.kdm.code.TemplateUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.TimeType;
import org.eclipse.gmt.modisco.omg.kdm.code.TypeUnit;
import org.eclipse.gmt.modisco.omg.kdm.code.Value;
import org.eclipse.gmt.modisco.omg.kdm.code.ValueElement;
import org.eclipse.gmt.modisco.omg.kdm.code.ValueList;
import org.eclipse.gmt.modisco.omg.kdm.code.VariantTo;
import org.eclipse.gmt.modisco.omg.kdm.code.VisibleIn;
import org.eclipse.gmt.modisco.omg.kdm.code.VoidType;

/**
 * @generated
 */
public class NameProvider extends AbstractNameProvider {
	// Start of user code for additional methods and attributes

	// End of user code

	// Start of user code name attribute for Value
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getValueName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ValueList
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getValueListName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for SharedUnit
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getSharedUnitName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for CallableUnit
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getCallableUnitName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for MethodUnit
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getMethodUnitName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for StorableUnit
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getStorableUnitName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ItemUnit
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getItemUnitName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for IndexUnit
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getIndexUnitName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for MemberUnit
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getMemberUnitName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ParameterUnit
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getParameterUnitName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ValueElement
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getValueElementName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for BooleanType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getBooleanTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for CharType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getCharTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for OrdinalType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getOrdinalTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for DateType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getDateTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for TimeType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getTimeTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for IntegerType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getIntegerTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for DecimalType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getDecimalTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ScaledType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getScaledTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for FloatType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getFloatTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for VoidType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getVoidTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for StringType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getStringTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for BitType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getBitTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for BitstringType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getBitstringTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for OctetType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getOctetTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for OctetstringType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getOctetstringTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ChoiceType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getChoiceTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for RecordType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getRecordTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ArrayType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getArrayTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for PointerType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getPointerTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for RangeType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getRangeTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for BagType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getBagTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for SetType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getSetTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for SequenceType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getSequenceTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for TypeUnit
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getTypeUnitName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for SynonymUnit
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getSynonymUnitName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for CompilationUnit
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getCompilationUnitName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for LanguageUnit
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getLanguageUnitName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for CodeAssembly
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getCodeAssemblyName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for Package
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getPackageName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ControlElement
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getControlElementName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for DataElement
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getDataElementName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for PrimitiveType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getPrimitiveTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for EnumeratedType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getEnumeratedTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for CompositeType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getCompositeTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for DerivedType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getDerivedTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for Signature
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getSignatureName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for DefinedType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getDefinedTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ClassUnit
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getClassUnitName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for InterfaceUnit
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getInterfaceUnitName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for TemplateUnit
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getTemplateUnitName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for TemplateParameter
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getTemplateParameterName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for TemplateType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getTemplateTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ComputationalObject
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getComputationalObjectName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for Datatype
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getDatatypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for Module
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getModuleName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for MacroUnit
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getMacroUnitName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for MacroDirective
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getMacroDirectiveName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for IncludeDirective
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getIncludeDirectiveName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ConditionalDirective
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getConditionalDirectiveName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for Namespace
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getNamespaceName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for CodeElement
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getCodeElementName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for CodeModel
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getCodeModelName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for CodeItem
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getCodeItemName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for InstanceOf
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getInstanceOfName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ParameterTo
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getParameterToName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for Implements
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getImplementsName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for ImplementationOf
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getImplementationOfName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for HasType
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getHasTypeName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for HasValue
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getHasValueName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for Extends
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getExtendsName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for PreprocessorDirective
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getPreprocessorDirectiveName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for Expands
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getExpandsName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for GeneratedFrom
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getGeneratedFromName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for Includes
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getIncludesName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for VariantTo
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getVariantToName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for Redefines
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getRedefinesName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for VisibleIn
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getVisibleInName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for Imports
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getImportsName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for CodeRelationship
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getCodeRelationshipName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for AbstractCodeElement
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getAbstractCodeElementName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for AbstractCodeRelationship
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getAbstractCodeRelationshipName(final EObject eObject) {
		String name = getDefaultName(eObject);
		return name;
	}

	// End of user code
	// Start of user code name attribute for CommentUnit
	/**
	 * remove this annotation to indicate that code has been changed manually.
	 * 
	 * @generated
	 */
	private final String getCommentUnitName(final EObject eObject) {
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
		if (eObject instanceof Value) {
			result = getValueName(eObject);
		} else if (eObject instanceof ValueList) {
			result = getValueListName(eObject);
		} else if (eObject instanceof SharedUnit) {
			result = getSharedUnitName(eObject);
		} else if (eObject instanceof CallableUnit) {
			result = getCallableUnitName(eObject);
		} else if (eObject instanceof MethodUnit) {
			result = getMethodUnitName(eObject);
		} else if (eObject instanceof StorableUnit) {
			result = getStorableUnitName(eObject);
		} else if (eObject instanceof ItemUnit) {
			result = getItemUnitName(eObject);
		} else if (eObject instanceof IndexUnit) {
			result = getIndexUnitName(eObject);
		} else if (eObject instanceof MemberUnit) {
			result = getMemberUnitName(eObject);
		} else if (eObject instanceof ParameterUnit) {
			result = getParameterUnitName(eObject);
		} else if (eObject instanceof ValueElement) {
			result = getValueElementName(eObject);
		} else if (eObject instanceof BooleanType) {
			result = getBooleanTypeName(eObject);
		} else if (eObject instanceof CharType) {
			result = getCharTypeName(eObject);
		} else if (eObject instanceof OrdinalType) {
			result = getOrdinalTypeName(eObject);
		} else if (eObject instanceof DateType) {
			result = getDateTypeName(eObject);
		} else if (eObject instanceof TimeType) {
			result = getTimeTypeName(eObject);
		} else if (eObject instanceof IntegerType) {
			result = getIntegerTypeName(eObject);
		} else if (eObject instanceof DecimalType) {
			result = getDecimalTypeName(eObject);
		} else if (eObject instanceof ScaledType) {
			result = getScaledTypeName(eObject);
		} else if (eObject instanceof FloatType) {
			result = getFloatTypeName(eObject);
		} else if (eObject instanceof VoidType) {
			result = getVoidTypeName(eObject);
		} else if (eObject instanceof StringType) {
			result = getStringTypeName(eObject);
		} else if (eObject instanceof BitType) {
			result = getBitTypeName(eObject);
		} else if (eObject instanceof BitstringType) {
			result = getBitstringTypeName(eObject);
		} else if (eObject instanceof OctetType) {
			result = getOctetTypeName(eObject);
		} else if (eObject instanceof OctetstringType) {
			result = getOctetstringTypeName(eObject);
		} else if (eObject instanceof ChoiceType) {
			result = getChoiceTypeName(eObject);
		} else if (eObject instanceof RecordType) {
			result = getRecordTypeName(eObject);
		} else if (eObject instanceof ArrayType) {
			result = getArrayTypeName(eObject);
		} else if (eObject instanceof PointerType) {
			result = getPointerTypeName(eObject);
		} else if (eObject instanceof RangeType) {
			result = getRangeTypeName(eObject);
		} else if (eObject instanceof BagType) {
			result = getBagTypeName(eObject);
		} else if (eObject instanceof SetType) {
			result = getSetTypeName(eObject);
		} else if (eObject instanceof SequenceType) {
			result = getSequenceTypeName(eObject);
		} else if (eObject instanceof TypeUnit) {
			result = getTypeUnitName(eObject);
		} else if (eObject instanceof SynonymUnit) {
			result = getSynonymUnitName(eObject);
		} else if (eObject instanceof CompilationUnit) {
			result = getCompilationUnitName(eObject);
		} else if (eObject instanceof LanguageUnit) {
			result = getLanguageUnitName(eObject);
		} else if (eObject instanceof CodeAssembly) {
			result = getCodeAssemblyName(eObject);
		} else if (eObject instanceof Package) {
			result = getPackageName(eObject);
		} else if (eObject instanceof ControlElement) {
			result = getControlElementName(eObject);
		} else if (eObject instanceof DataElement) {
			result = getDataElementName(eObject);
		} else if (eObject instanceof PrimitiveType) {
			result = getPrimitiveTypeName(eObject);
		} else if (eObject instanceof EnumeratedType) {
			result = getEnumeratedTypeName(eObject);
		} else if (eObject instanceof CompositeType) {
			result = getCompositeTypeName(eObject);
		} else if (eObject instanceof DerivedType) {
			result = getDerivedTypeName(eObject);
		} else if (eObject instanceof Signature) {
			result = getSignatureName(eObject);
		} else if (eObject instanceof DefinedType) {
			result = getDefinedTypeName(eObject);
		} else if (eObject instanceof ClassUnit) {
			result = getClassUnitName(eObject);
		} else if (eObject instanceof InterfaceUnit) {
			result = getInterfaceUnitName(eObject);
		} else if (eObject instanceof TemplateUnit) {
			result = getTemplateUnitName(eObject);
		} else if (eObject instanceof TemplateParameter) {
			result = getTemplateParameterName(eObject);
		} else if (eObject instanceof TemplateType) {
			result = getTemplateTypeName(eObject);
		} else if (eObject instanceof ComputationalObject) {
			result = getComputationalObjectName(eObject);
		} else if (eObject instanceof Datatype) {
			result = getDatatypeName(eObject);
		} else if (eObject instanceof Module) {
			result = getModuleName(eObject);
		} else if (eObject instanceof MacroUnit) {
			result = getMacroUnitName(eObject);
		} else if (eObject instanceof MacroDirective) {
			result = getMacroDirectiveName(eObject);
		} else if (eObject instanceof IncludeDirective) {
			result = getIncludeDirectiveName(eObject);
		} else if (eObject instanceof ConditionalDirective) {
			result = getConditionalDirectiveName(eObject);
		} else if (eObject instanceof Namespace) {
			result = getNamespaceName(eObject);
		} else if (eObject instanceof CodeElement) {
			result = getCodeElementName(eObject);
		} else if (eObject instanceof CodeModel) {
			result = getCodeModelName(eObject);
		} else if (eObject instanceof CodeItem) {
			result = getCodeItemName(eObject);
		} else if (eObject instanceof InstanceOf) {
			result = getInstanceOfName(eObject);
		} else if (eObject instanceof ParameterTo) {
			result = getParameterToName(eObject);
		} else if (eObject instanceof Implements) {
			result = getImplementsName(eObject);
		} else if (eObject instanceof ImplementationOf) {
			result = getImplementationOfName(eObject);
		} else if (eObject instanceof HasType) {
			result = getHasTypeName(eObject);
		} else if (eObject instanceof HasValue) {
			result = getHasValueName(eObject);
		} else if (eObject instanceof Extends) {
			result = getExtendsName(eObject);
		} else if (eObject instanceof PreprocessorDirective) {
			result = getPreprocessorDirectiveName(eObject);
		} else if (eObject instanceof Expands) {
			result = getExpandsName(eObject);
		} else if (eObject instanceof GeneratedFrom) {
			result = getGeneratedFromName(eObject);
		} else if (eObject instanceof Includes) {
			result = getIncludesName(eObject);
		} else if (eObject instanceof VariantTo) {
			result = getVariantToName(eObject);
		} else if (eObject instanceof Redefines) {
			result = getRedefinesName(eObject);
		} else if (eObject instanceof VisibleIn) {
			result = getVisibleInName(eObject);
		} else if (eObject instanceof Imports) {
			result = getImportsName(eObject);
		} else if (eObject instanceof CodeRelationship) {
			result = getCodeRelationshipName(eObject);
		} else if (eObject instanceof AbstractCodeElement) {
			result = getAbstractCodeElementName(eObject);
		} else if (eObject instanceof AbstractCodeRelationship) {
			result = getAbstractCodeRelationshipName(eObject);
		} else if (eObject instanceof CommentUnit) {
			result = getCommentUnitName(eObject);
		}
		return result;
	}

}
