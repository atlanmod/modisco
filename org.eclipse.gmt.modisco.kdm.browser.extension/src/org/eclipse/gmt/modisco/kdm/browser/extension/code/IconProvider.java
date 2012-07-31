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
import org.eclipse.gmt.modisco.kdm.browser.extension.Activator;
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
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class IconProvider implements
		org.eclipse.gmt.modisco.infra.browser.uicore.extensions.icons.IconProvider {
	// Start of user code Image attribute for Value
	private final Image ValueImage = createImage("RealValue.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ValueList
	private final Image ValueListImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for SharedUnit
	private final Image SharedUnitImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for CallableUnit
	private final Image CallableUnitImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for MethodUnit
	private final Image MethodUnitImage = createImage("JMethodPublic.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for StorableUnit
	private final Image StorableUnitImage = createImage("members.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ItemUnit
	private final Image ItemUnitImage = createImage("InformationItem.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for IndexUnit
	private final Image IndexUnitImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for MemberUnit
	private final Image MemberUnitImage = createImage("members.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ParameterUnit
	private final Image ParameterUnitImage = createImage("Parameter.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ValueElement
	private final Image ValueElementImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for BooleanType
	private final Image BooleanTypeImage = createImage("BooleanValue.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for CharType
	private final Image CharTypeImage = createImage("TextValue.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for OrdinalType
	private final Image OrdinalTypeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for DateType
	private final Image DateTypeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for TimeType
	private final Image TimeTypeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for IntegerType
	private final Image IntegerTypeImage = createImage("IntegralValue.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for DecimalType
	private final Image DecimalTypeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ScaledType
	private final Image ScaledTypeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for FloatType
	private final Image FloatTypeImage = createImage("RealValue.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for VoidType
	private final Image VoidTypeImage = createImage("newfile_wiz.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for StringType
	private final Image StringTypeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for BitType
	private final Image BitTypeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for BitstringType
	private final Image BitstringTypeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for OctetType
	private final Image OctetTypeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for OctetstringType
	private final Image OctetstringTypeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ChoiceType
	private final Image ChoiceTypeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for RecordType
	private final Image RecordTypeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ArrayType
	private final Image ArrayTypeImage = createImage("settings_obj.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for PointerType
	private final Image PointerTypeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for RangeType
	private final Image RangeTypeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for BagType
	private final Image BagTypeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for SetType
	private final Image SetTypeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for SequenceType
	private final Image SequenceTypeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for TypeUnit
	private final Image TypeUnitImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for SynonymUnit
	private final Image SynonymUnitImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for CompilationUnit
	private final Image CompilationUnitImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for LanguageUnit
	private final Image LanguageUnitImage = createImage("PrimitiveType.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for CodeAssembly
	private final Image CodeAssemblyImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Package
	private final Image PackageImage = createImage("package_obj.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ControlElement
	private final Image ControlElementImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for DataElement
	private final Image DataElementImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for PrimitiveType
	private final Image PrimitiveTypeImage = createImage("PrimitiveType.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for EnumeratedType
	private final Image EnumeratedTypeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for CompositeType
	private final Image CompositeTypeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for DerivedType
	private final Image DerivedTypeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Signature
	private final Image SignatureImage = createImage("TemplateSignature.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for DefinedType
	private final Image DefinedTypeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ClassUnit
	private final Image ClassUnitImage = createImage("class_obj.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for InterfaceUnit
	private final Image InterfaceUnitImage = createImage("generate_interface.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for TemplateUnit
	private final Image TemplateUnitImage = createImage("RedefinableTemplateSignature.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for TemplateParameter
	private final Image TemplateParameterImage = createImage("TemplateParameter.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for TemplateType
	private final Image TemplateTypeImage = createImage("ClassifierTemplateParameter.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ComputationalObject
	private final Image ComputationalObjectImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Datatype
	private final Image DatatypeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Module
	private final Image ModuleImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for MacroUnit
	private final Image MacroUnitImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for MacroDirective
	private final Image MacroDirectiveImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for IncludeDirective
	private final Image IncludeDirectiveImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ConditionalDirective
	private final Image ConditionalDirectiveImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Namespace
	private final Image NamespaceImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for CodeElement
	private final Image CodeElementImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for CodeModel
	private final Image CodeModelImage = createImage("packagefolder_obj.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for CodeItem
	private final Image CodeItemImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for InstanceOf
	private final Image InstanceOfImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ParameterTo
	private final Image ParameterToImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Implements
	private final Image ImplementsImage = createImage("super_co.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for ImplementationOf
	private final Image ImplementationOfImage = createImage("sub_co.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for HasType
	private final Image HasTypeImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for HasValue
	private final Image HasValueImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Extends
	private final Image ExtendsImage = createImage("super_co.gif"); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for PreprocessorDirective
	private final Image PreprocessorDirectiveImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Expands
	private final Image ExpandsImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for GeneratedFrom
	private final Image GeneratedFromImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Includes
	private final Image IncludesImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for VariantTo
	private final Image VariantToImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Redefines
	private final Image RedefinesImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for VisibleIn
	private final Image VisibleInImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for Imports
	private final Image ImportsImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for CodeRelationship
	private final Image CodeRelationshipImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for AbstractCodeElement
	private final Image AbstractCodeElementImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for AbstractCodeRelationship
	private final Image AbstractCodeRelationshipImage = createImage(""); //$NON-NLS-1$
	// End of user code
	// Start of user code Image attribute for CommentUnit
	private final Image CommentUnitImage = createImage(""); //$NON-NLS-1$

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
		if (eObject instanceof Value) {
			result = this.ValueImage;
		} else if (eObject instanceof ValueList) {
			result = this.ValueListImage;
		} else if (eObject instanceof SharedUnit) {
			result = this.SharedUnitImage;
		} else if (eObject instanceof CallableUnit) {
			result = this.CallableUnitImage;
		} else if (eObject instanceof MethodUnit) {
			result = this.MethodUnitImage;
		} else if (eObject instanceof StorableUnit) {
			result = this.StorableUnitImage;
		} else if (eObject instanceof ItemUnit) {
			result = this.ItemUnitImage;
		} else if (eObject instanceof IndexUnit) {
			result = this.IndexUnitImage;
		} else if (eObject instanceof MemberUnit) {
			result = this.MemberUnitImage;
		} else if (eObject instanceof ParameterUnit) {
			result = this.ParameterUnitImage;
		} else if (eObject instanceof ValueElement) {
			result = this.ValueElementImage;
		} else if (eObject instanceof BooleanType) {
			result = this.BooleanTypeImage;
		} else if (eObject instanceof CharType) {
			result = this.CharTypeImage;
		} else if (eObject instanceof OrdinalType) {
			result = this.OrdinalTypeImage;
		} else if (eObject instanceof DateType) {
			result = this.DateTypeImage;
		} else if (eObject instanceof TimeType) {
			result = this.TimeTypeImage;
		} else if (eObject instanceof IntegerType) {
			result = this.IntegerTypeImage;
		} else if (eObject instanceof DecimalType) {
			result = this.DecimalTypeImage;
		} else if (eObject instanceof ScaledType) {
			result = this.ScaledTypeImage;
		} else if (eObject instanceof FloatType) {
			result = this.FloatTypeImage;
		} else if (eObject instanceof VoidType) {
			result = this.VoidTypeImage;
		} else if (eObject instanceof StringType) {
			result = this.StringTypeImage;
		} else if (eObject instanceof BitType) {
			result = this.BitTypeImage;
		} else if (eObject instanceof BitstringType) {
			result = this.BitstringTypeImage;
		} else if (eObject instanceof OctetType) {
			result = this.OctetTypeImage;
		} else if (eObject instanceof OctetstringType) {
			result = this.OctetstringTypeImage;
		} else if (eObject instanceof ChoiceType) {
			result = this.ChoiceTypeImage;
		} else if (eObject instanceof RecordType) {
			result = this.RecordTypeImage;
		} else if (eObject instanceof ArrayType) {
			result = this.ArrayTypeImage;
		} else if (eObject instanceof PointerType) {
			result = this.PointerTypeImage;
		} else if (eObject instanceof RangeType) {
			result = this.RangeTypeImage;
		} else if (eObject instanceof BagType) {
			result = this.BagTypeImage;
		} else if (eObject instanceof SetType) {
			result = this.SetTypeImage;
		} else if (eObject instanceof SequenceType) {
			result = this.SequenceTypeImage;
		} else if (eObject instanceof TypeUnit) {
			result = this.TypeUnitImage;
		} else if (eObject instanceof SynonymUnit) {
			result = this.SynonymUnitImage;
		} else if (eObject instanceof CompilationUnit) {
			result = this.CompilationUnitImage;
		} else if (eObject instanceof LanguageUnit) {
			result = this.LanguageUnitImage;
		} else if (eObject instanceof CodeAssembly) {
			result = this.CodeAssemblyImage;
		} else if (eObject instanceof Package) {
			result = this.PackageImage;
		} else if (eObject instanceof ControlElement) {
			result = this.ControlElementImage;
		} else if (eObject instanceof DataElement) {
			result = this.DataElementImage;
		} else if (eObject instanceof PrimitiveType) {
			result = this.PrimitiveTypeImage;
		} else if (eObject instanceof EnumeratedType) {
			result = this.EnumeratedTypeImage;
		} else if (eObject instanceof CompositeType) {
			result = this.CompositeTypeImage;
		} else if (eObject instanceof DerivedType) {
			result = this.DerivedTypeImage;
		} else if (eObject instanceof Signature) {
			result = this.SignatureImage;
		} else if (eObject instanceof DefinedType) {
			result = this.DefinedTypeImage;
		} else if (eObject instanceof ClassUnit) {
			result = this.ClassUnitImage;
		} else if (eObject instanceof InterfaceUnit) {
			result = this.InterfaceUnitImage;
		} else if (eObject instanceof TemplateUnit) {
			result = this.TemplateUnitImage;
		} else if (eObject instanceof TemplateParameter) {
			result = this.TemplateParameterImage;
		} else if (eObject instanceof TemplateType) {
			result = this.TemplateTypeImage;
		} else if (eObject instanceof ComputationalObject) {
			result = this.ComputationalObjectImage;
		} else if (eObject instanceof Datatype) {
			result = this.DatatypeImage;
		} else if (eObject instanceof Module) {
			result = this.ModuleImage;
		} else if (eObject instanceof MacroUnit) {
			result = this.MacroUnitImage;
		} else if (eObject instanceof MacroDirective) {
			result = this.MacroDirectiveImage;
		} else if (eObject instanceof IncludeDirective) {
			result = this.IncludeDirectiveImage;
		} else if (eObject instanceof ConditionalDirective) {
			result = this.ConditionalDirectiveImage;
		} else if (eObject instanceof Namespace) {
			result = this.NamespaceImage;
		} else if (eObject instanceof CodeElement) {
			result = this.CodeElementImage;
		} else if (eObject instanceof CodeModel) {
			result = this.CodeModelImage;
		} else if (eObject instanceof CodeItem) {
			result = this.CodeItemImage;
		} else if (eObject instanceof InstanceOf) {
			result = this.InstanceOfImage;
		} else if (eObject instanceof ParameterTo) {
			result = this.ParameterToImage;
		} else if (eObject instanceof Implements) {
			result = this.ImplementsImage;
		} else if (eObject instanceof ImplementationOf) {
			result = this.ImplementationOfImage;
		} else if (eObject instanceof HasType) {
			result = this.HasTypeImage;
		} else if (eObject instanceof HasValue) {
			result = this.HasValueImage;
		} else if (eObject instanceof Extends) {
			result = this.ExtendsImage;
		} else if (eObject instanceof PreprocessorDirective) {
			result = this.PreprocessorDirectiveImage;
		} else if (eObject instanceof Expands) {
			result = this.ExpandsImage;
		} else if (eObject instanceof GeneratedFrom) {
			result = this.GeneratedFromImage;
		} else if (eObject instanceof Includes) {
			result = this.IncludesImage;
		} else if (eObject instanceof VariantTo) {
			result = this.VariantToImage;
		} else if (eObject instanceof Redefines) {
			result = this.RedefinesImage;
		} else if (eObject instanceof VisibleIn) {
			result = this.VisibleInImage;
		} else if (eObject instanceof Imports) {
			result = this.ImportsImage;
		} else if (eObject instanceof CodeRelationship) {
			result = this.CodeRelationshipImage;
		} else if (eObject instanceof AbstractCodeElement) {
			result = this.AbstractCodeElementImage;
		} else if (eObject instanceof AbstractCodeRelationship) {
			result = this.AbstractCodeRelationshipImage;
		} else if (eObject instanceof CommentUnit) {
			result = this.CommentUnitImage;
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
			ImageDescriptor descriptor = Activator.getImageDescriptor("icons/kdm/code/" //$NON-NLS-1$ 
					+ resourcePath);
			if (descriptor != null) {
				result = descriptor.createImage();
			}
		}
		return result;
	}

}
