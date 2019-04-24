/**
 * Copyright (c) 2010 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v1.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v10.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar30.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigPropertyType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ApplicationExceptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.AroundInvokeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpFieldType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpVersionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ContainerTransactionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.DisplayNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.DocumentRoot;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLinkType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLocalRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EmptyType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EnterpriseBeansType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryTypeValuesType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ExcludeListType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.FullyQualifiedClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.GenericBooleanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.HomeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.IconType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.InitMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.InjectionTargetType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorOrderType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.JavaIdentifierType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.JavaTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.JndiNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.LifecycleCallbackType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ListenerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.LocalHomeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.LocalType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationLinkType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationUsageType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodIntfType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodParamsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodPermissionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MultiplicityType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.NamedMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ParamValueType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.PathType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceUnitRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.PortComponentRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.PropertyType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.RelationshipRoleSourceType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.RelationshipsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.RemoteType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.RemoveMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ResAuthType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ResSharingScopeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceEnvRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ResultTypeMappingType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.RoleNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.RunAsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityIdentityType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.TransAttributeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.TransactionTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.TrueFalseType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.UrlPatternType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdAnyURIType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdBooleanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdIntegerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdNMTOKENType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdNonNegativeIntegerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdPositiveIntegerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdQNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdStringType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package
 * @generated
 */
public class EjbJar30AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EjbJar30Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbJar30AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EjbJar30Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EjbJar30Switch<Adapter> modelSwitch =
		new EjbJar30Switch<Adapter>() {
			@Override
			public Adapter caseActivationConfigPropertyType(ActivationConfigPropertyType object) {
				return createActivationConfigPropertyTypeAdapter();
			}
			@Override
			public Adapter caseActivationConfigType(ActivationConfigType object) {
				return createActivationConfigTypeAdapter();
			}
			@Override
			public Adapter caseApplicationExceptionType(ApplicationExceptionType object) {
				return createApplicationExceptionTypeAdapter();
			}
			@Override
			public Adapter caseAroundInvokeType(AroundInvokeType object) {
				return createAroundInvokeTypeAdapter();
			}
			@Override
			public Adapter caseAssemblyDescriptorType(AssemblyDescriptorType object) {
				return createAssemblyDescriptorTypeAdapter();
			}
			@Override
			public Adapter caseCmpFieldType(CmpFieldType object) {
				return createCmpFieldTypeAdapter();
			}
			@Override
			public Adapter caseCmpVersionType(CmpVersionType object) {
				return createCmpVersionTypeAdapter();
			}
			@Override
			public Adapter caseCmrFieldType(CmrFieldType object) {
				return createCmrFieldTypeAdapter();
			}
			@Override
			public Adapter caseCmrFieldTypeType(CmrFieldTypeType object) {
				return createCmrFieldTypeTypeAdapter();
			}
			@Override
			public Adapter caseContainerTransactionType(ContainerTransactionType object) {
				return createContainerTransactionTypeAdapter();
			}
			@Override
			public Adapter caseDescriptionType(DescriptionType object) {
				return createDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseDisplayNameType(DisplayNameType object) {
				return createDisplayNameTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEjbClassType(EjbClassType object) {
				return createEjbClassTypeAdapter();
			}
			@Override
			public Adapter caseEjbJarType(EjbJarType object) {
				return createEjbJarTypeAdapter();
			}
			@Override
			public Adapter caseEjbLinkType(EjbLinkType object) {
				return createEjbLinkTypeAdapter();
			}
			@Override
			public Adapter caseEjbLocalRefType(EjbLocalRefType object) {
				return createEjbLocalRefTypeAdapter();
			}
			@Override
			public Adapter caseEjbNameType(EjbNameType object) {
				return createEjbNameTypeAdapter();
			}
			@Override
			public Adapter caseEjbRefNameType(EjbRefNameType object) {
				return createEjbRefNameTypeAdapter();
			}
			@Override
			public Adapter caseEjbRefType(EjbRefType object) {
				return createEjbRefTypeAdapter();
			}
			@Override
			public Adapter caseEjbRefTypeType(EjbRefTypeType object) {
				return createEjbRefTypeTypeAdapter();
			}
			@Override
			public Adapter caseEjbRelationshipRoleType(EjbRelationshipRoleType object) {
				return createEjbRelationshipRoleTypeAdapter();
			}
			@Override
			public Adapter caseEjbRelationType(EjbRelationType object) {
				return createEjbRelationTypeAdapter();
			}
			@Override
			public Adapter caseEmptyType(EmptyType object) {
				return createEmptyTypeAdapter();
			}
			@Override
			public Adapter caseEnterpriseBeansType(EnterpriseBeansType object) {
				return createEnterpriseBeansTypeAdapter();
			}
			@Override
			public Adapter caseEntityBeanType(EntityBeanType object) {
				return createEntityBeanTypeAdapter();
			}
			@Override
			public Adapter caseEnvEntryType(EnvEntryType object) {
				return createEnvEntryTypeAdapter();
			}
			@Override
			public Adapter caseEnvEntryTypeValuesType(EnvEntryTypeValuesType object) {
				return createEnvEntryTypeValuesTypeAdapter();
			}
			@Override
			public Adapter caseExcludeListType(ExcludeListType object) {
				return createExcludeListTypeAdapter();
			}
			@Override
			public Adapter caseFullyQualifiedClassType(FullyQualifiedClassType object) {
				return createFullyQualifiedClassTypeAdapter();
			}
			@Override
			public Adapter caseGenericBooleanType(GenericBooleanType object) {
				return createGenericBooleanTypeAdapter();
			}
			@Override
			public Adapter caseHomeType(HomeType object) {
				return createHomeTypeAdapter();
			}
			@Override
			public Adapter caseIconType(IconType object) {
				return createIconTypeAdapter();
			}
			@Override
			public Adapter caseInitMethodType(InitMethodType object) {
				return createInitMethodTypeAdapter();
			}
			@Override
			public Adapter caseInjectionTargetType(InjectionTargetType object) {
				return createInjectionTargetTypeAdapter();
			}
			@Override
			public Adapter caseInterceptorBindingType(InterceptorBindingType object) {
				return createInterceptorBindingTypeAdapter();
			}
			@Override
			public Adapter caseInterceptorOrderType(InterceptorOrderType object) {
				return createInterceptorOrderTypeAdapter();
			}
			@Override
			public Adapter caseInterceptorsType(InterceptorsType object) {
				return createInterceptorsTypeAdapter();
			}
			@Override
			public Adapter caseInterceptorType(InterceptorType object) {
				return createInterceptorTypeAdapter();
			}
			@Override
			public Adapter caseJavaIdentifierType(JavaIdentifierType object) {
				return createJavaIdentifierTypeAdapter();
			}
			@Override
			public Adapter caseJavaTypeType(JavaTypeType object) {
				return createJavaTypeTypeAdapter();
			}
			@Override
			public Adapter caseJndiNameType(JndiNameType object) {
				return createJndiNameTypeAdapter();
			}
			@Override
			public Adapter caseLifecycleCallbackType(LifecycleCallbackType object) {
				return createLifecycleCallbackTypeAdapter();
			}
			@Override
			public Adapter caseListenerType(ListenerType object) {
				return createListenerTypeAdapter();
			}
			@Override
			public Adapter caseLocalHomeType(LocalHomeType object) {
				return createLocalHomeTypeAdapter();
			}
			@Override
			public Adapter caseLocalType(LocalType object) {
				return createLocalTypeAdapter();
			}
			@Override
			public Adapter caseMessageDestinationLinkType(MessageDestinationLinkType object) {
				return createMessageDestinationLinkTypeAdapter();
			}
			@Override
			public Adapter caseMessageDestinationRefType(MessageDestinationRefType object) {
				return createMessageDestinationRefTypeAdapter();
			}
			@Override
			public Adapter caseMessageDestinationType(MessageDestinationType object) {
				return createMessageDestinationTypeAdapter();
			}
			@Override
			public Adapter caseMessageDestinationTypeType(MessageDestinationTypeType object) {
				return createMessageDestinationTypeTypeAdapter();
			}
			@Override
			public Adapter caseMessageDestinationUsageType(MessageDestinationUsageType object) {
				return createMessageDestinationUsageTypeAdapter();
			}
			@Override
			public Adapter caseMessageDrivenBeanType(MessageDrivenBeanType object) {
				return createMessageDrivenBeanTypeAdapter();
			}
			@Override
			public Adapter caseMethodIntfType(MethodIntfType object) {
				return createMethodIntfTypeAdapter();
			}
			@Override
			public Adapter caseMethodNameType(MethodNameType object) {
				return createMethodNameTypeAdapter();
			}
			@Override
			public Adapter caseMethodParamsType(MethodParamsType object) {
				return createMethodParamsTypeAdapter();
			}
			@Override
			public Adapter caseMethodPermissionType(MethodPermissionType object) {
				return createMethodPermissionTypeAdapter();
			}
			@Override
			public Adapter caseMethodType(MethodType object) {
				return createMethodTypeAdapter();
			}
			@Override
			public Adapter caseMultiplicityType(MultiplicityType object) {
				return createMultiplicityTypeAdapter();
			}
			@Override
			public Adapter caseNamedMethodType(NamedMethodType object) {
				return createNamedMethodTypeAdapter();
			}
			@Override
			public Adapter caseParamValueType(ParamValueType object) {
				return createParamValueTypeAdapter();
			}
			@Override
			public Adapter casePathType(PathType object) {
				return createPathTypeAdapter();
			}
			@Override
			public Adapter casePersistenceContextRefType(PersistenceContextRefType object) {
				return createPersistenceContextRefTypeAdapter();
			}
			@Override
			public Adapter casePersistenceContextTypeType(PersistenceContextTypeType object) {
				return createPersistenceContextTypeTypeAdapter();
			}
			@Override
			public Adapter casePersistenceTypeType(PersistenceTypeType object) {
				return createPersistenceTypeTypeAdapter();
			}
			@Override
			public Adapter casePersistenceUnitRefType(PersistenceUnitRefType object) {
				return createPersistenceUnitRefTypeAdapter();
			}
			@Override
			public Adapter casePortComponentRefType(PortComponentRefType object) {
				return createPortComponentRefTypeAdapter();
			}
			@Override
			public Adapter casePropertyType(PropertyType object) {
				return createPropertyTypeAdapter();
			}
			@Override
			public Adapter caseQueryMethodType(QueryMethodType object) {
				return createQueryMethodTypeAdapter();
			}
			@Override
			public Adapter caseQueryType(QueryType object) {
				return createQueryTypeAdapter();
			}
			@Override
			public Adapter caseRelationshipRoleSourceType(RelationshipRoleSourceType object) {
				return createRelationshipRoleSourceTypeAdapter();
			}
			@Override
			public Adapter caseRelationshipsType(RelationshipsType object) {
				return createRelationshipsTypeAdapter();
			}
			@Override
			public Adapter caseRemoteType(RemoteType object) {
				return createRemoteTypeAdapter();
			}
			@Override
			public Adapter caseRemoveMethodType(RemoveMethodType object) {
				return createRemoveMethodTypeAdapter();
			}
			@Override
			public Adapter caseResAuthType(ResAuthType object) {
				return createResAuthTypeAdapter();
			}
			@Override
			public Adapter caseResourceEnvRefType(ResourceEnvRefType object) {
				return createResourceEnvRefTypeAdapter();
			}
			@Override
			public Adapter caseResourceRefType(ResourceRefType object) {
				return createResourceRefTypeAdapter();
			}
			@Override
			public Adapter caseResSharingScopeType(ResSharingScopeType object) {
				return createResSharingScopeTypeAdapter();
			}
			@Override
			public Adapter caseResultTypeMappingType(ResultTypeMappingType object) {
				return createResultTypeMappingTypeAdapter();
			}
			@Override
			public Adapter caseRoleNameType(RoleNameType object) {
				return createRoleNameTypeAdapter();
			}
			@Override
			public Adapter caseRunAsType(RunAsType object) {
				return createRunAsTypeAdapter();
			}
			@Override
			public Adapter caseSecurityIdentityType(SecurityIdentityType object) {
				return createSecurityIdentityTypeAdapter();
			}
			@Override
			public Adapter caseSecurityRoleRefType(SecurityRoleRefType object) {
				return createSecurityRoleRefTypeAdapter();
			}
			@Override
			public Adapter caseSecurityRoleType(SecurityRoleType object) {
				return createSecurityRoleTypeAdapter();
			}
			@Override
			public Adapter caseServiceRefHandlerChainsType(ServiceRefHandlerChainsType object) {
				return createServiceRefHandlerChainsTypeAdapter();
			}
			@Override
			public Adapter caseServiceRefHandlerChainType(ServiceRefHandlerChainType object) {
				return createServiceRefHandlerChainTypeAdapter();
			}
			@Override
			public Adapter caseServiceRefHandlerType(ServiceRefHandlerType object) {
				return createServiceRefHandlerTypeAdapter();
			}
			@Override
			public Adapter caseServiceRefType(ServiceRefType object) {
				return createServiceRefTypeAdapter();
			}
			@Override
			public Adapter caseSessionBeanType(SessionBeanType object) {
				return createSessionBeanTypeAdapter();
			}
			@Override
			public Adapter caseSessionTypeType(SessionTypeType object) {
				return createSessionTypeTypeAdapter();
			}
			@Override
			public Adapter caseString(org.eclipse.modisco.jee.ejbjar.EjbJar30.String object) {
				return createStringAdapter();
			}
			@Override
			public Adapter caseTransactionTypeType(TransactionTypeType object) {
				return createTransactionTypeTypeAdapter();
			}
			@Override
			public Adapter caseTransAttributeType(TransAttributeType object) {
				return createTransAttributeTypeAdapter();
			}
			@Override
			public Adapter caseTrueFalseType(TrueFalseType object) {
				return createTrueFalseTypeAdapter();
			}
			@Override
			public Adapter caseUrlPatternType(UrlPatternType object) {
				return createUrlPatternTypeAdapter();
			}
			@Override
			public Adapter caseXsdAnyURIType(XsdAnyURIType object) {
				return createXsdAnyURITypeAdapter();
			}
			@Override
			public Adapter caseXsdBooleanType(XsdBooleanType object) {
				return createXsdBooleanTypeAdapter();
			}
			@Override
			public Adapter caseXsdIntegerType(XsdIntegerType object) {
				return createXsdIntegerTypeAdapter();
			}
			@Override
			public Adapter caseXsdNMTOKENType(XsdNMTOKENType object) {
				return createXsdNMTOKENTypeAdapter();
			}
			@Override
			public Adapter caseXsdNonNegativeIntegerType(XsdNonNegativeIntegerType object) {
				return createXsdNonNegativeIntegerTypeAdapter();
			}
			@Override
			public Adapter caseXsdPositiveIntegerType(XsdPositiveIntegerType object) {
				return createXsdPositiveIntegerTypeAdapter();
			}
			@Override
			public Adapter caseXsdQNameType(XsdQNameType object) {
				return createXsdQNameTypeAdapter();
			}
			@Override
			public Adapter caseXsdStringType(XsdStringType object) {
				return createXsdStringTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigPropertyType <em>Activation Config Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigPropertyType
	 * @generated
	 */
	public Adapter createActivationConfigPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigType <em>Activation Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigType
	 * @generated
	 */
	public Adapter createActivationConfigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ApplicationExceptionType <em>Application Exception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ApplicationExceptionType
	 * @generated
	 */
	public Adapter createApplicationExceptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.AroundInvokeType <em>Around Invoke Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.AroundInvokeType
	 * @generated
	 */
	public Adapter createAroundInvokeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType <em>Assembly Descriptor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType
	 * @generated
	 */
	public Adapter createAssemblyDescriptorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpFieldType <em>Cmp Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpFieldType
	 * @generated
	 */
	public Adapter createCmpFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpVersionType <em>Cmp Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.CmpVersionType
	 * @generated
	 */
	public Adapter createCmpVersionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldType <em>Cmr Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldType
	 * @generated
	 */
	public Adapter createCmrFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldTypeType <em>Cmr Field Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.CmrFieldTypeType
	 * @generated
	 */
	public Adapter createCmrFieldTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ContainerTransactionType <em>Container Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ContainerTransactionType
	 * @generated
	 */
	public Adapter createContainerTransactionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.DescriptionType
	 * @generated
	 */
	public Adapter createDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.DisplayNameType <em>Display Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.DisplayNameType
	 * @generated
	 */
	public Adapter createDisplayNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbClassType <em>Ejb Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbClassType
	 * @generated
	 */
	public Adapter createEjbClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType <em>Ejb Jar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType
	 * @generated
	 */
	public Adapter createEjbJarTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLinkType <em>Ejb Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLinkType
	 * @generated
	 */
	public Adapter createEjbLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLocalRefType <em>Ejb Local Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLocalRefType
	 * @generated
	 */
	public Adapter createEjbLocalRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbNameType <em>Ejb Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbNameType
	 * @generated
	 */
	public Adapter createEjbNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefNameType <em>Ejb Ref Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefNameType
	 * @generated
	 */
	public Adapter createEjbRefNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefType
	 * @generated
	 */
	public Adapter createEjbRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefTypeType <em>Ejb Ref Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefTypeType
	 * @generated
	 */
	public Adapter createEjbRefTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType <em>Ejb Relationship Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType
	 * @generated
	 */
	public Adapter createEjbRelationshipRoleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationType <em>Ejb Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationType
	 * @generated
	 */
	public Adapter createEjbRelationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EmptyType <em>Empty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EmptyType
	 * @generated
	 */
	public Adapter createEmptyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EnterpriseBeansType <em>Enterprise Beans Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EnterpriseBeansType
	 * @generated
	 */
	public Adapter createEnterpriseBeansTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType <em>Entity Bean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType
	 * @generated
	 */
	public Adapter createEntityBeanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryType
	 * @generated
	 */
	public Adapter createEnvEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryTypeValuesType <em>Env Entry Type Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryTypeValuesType
	 * @generated
	 */
	public Adapter createEnvEntryTypeValuesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ExcludeListType <em>Exclude List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ExcludeListType
	 * @generated
	 */
	public Adapter createExcludeListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.FullyQualifiedClassType <em>Fully Qualified Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.FullyQualifiedClassType
	 * @generated
	 */
	public Adapter createFullyQualifiedClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.GenericBooleanType <em>Generic Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.GenericBooleanType
	 * @generated
	 */
	public Adapter createGenericBooleanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.HomeType <em>Home Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.HomeType
	 * @generated
	 */
	public Adapter createHomeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.IconType <em>Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.IconType
	 * @generated
	 */
	public Adapter createIconTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InitMethodType <em>Init Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InitMethodType
	 * @generated
	 */
	public Adapter createInitMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InjectionTargetType <em>Injection Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InjectionTargetType
	 * @generated
	 */
	public Adapter createInjectionTargetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType <em>Interceptor Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType
	 * @generated
	 */
	public Adapter createInterceptorBindingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorOrderType <em>Interceptor Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorOrderType
	 * @generated
	 */
	public Adapter createInterceptorOrderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorsType <em>Interceptors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorsType
	 * @generated
	 */
	public Adapter createInterceptorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType <em>Interceptor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorType
	 * @generated
	 */
	public Adapter createInterceptorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.JavaIdentifierType <em>Java Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.JavaIdentifierType
	 * @generated
	 */
	public Adapter createJavaIdentifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.JavaTypeType <em>Java Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.JavaTypeType
	 * @generated
	 */
	public Adapter createJavaTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.JndiNameType <em>Jndi Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.JndiNameType
	 * @generated
	 */
	public Adapter createJndiNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.LifecycleCallbackType <em>Lifecycle Callback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.LifecycleCallbackType
	 * @generated
	 */
	public Adapter createLifecycleCallbackTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ListenerType <em>Listener Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ListenerType
	 * @generated
	 */
	public Adapter createListenerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.LocalHomeType <em>Local Home Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.LocalHomeType
	 * @generated
	 */
	public Adapter createLocalHomeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.LocalType <em>Local Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.LocalType
	 * @generated
	 */
	public Adapter createLocalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationLinkType <em>Message Destination Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationLinkType
	 * @generated
	 */
	public Adapter createMessageDestinationLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType <em>Message Destination Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType
	 * @generated
	 */
	public Adapter createMessageDestinationRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationType <em>Message Destination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationType
	 * @generated
	 */
	public Adapter createMessageDestinationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationTypeType <em>Message Destination Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationTypeType
	 * @generated
	 */
	public Adapter createMessageDestinationTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationUsageType <em>Message Destination Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationUsageType
	 * @generated
	 */
	public Adapter createMessageDestinationUsageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType <em>Message Driven Bean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType
	 * @generated
	 */
	public Adapter createMessageDrivenBeanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodIntfType <em>Method Intf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodIntfType
	 * @generated
	 */
	public Adapter createMethodIntfTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodNameType <em>Method Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodNameType
	 * @generated
	 */
	public Adapter createMethodNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodParamsType <em>Method Params Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodParamsType
	 * @generated
	 */
	public Adapter createMethodParamsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodPermissionType <em>Method Permission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodPermissionType
	 * @generated
	 */
	public Adapter createMethodPermissionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType
	 * @generated
	 */
	public Adapter createMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MultiplicityType <em>Multiplicity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.MultiplicityType
	 * @generated
	 */
	public Adapter createMultiplicityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.NamedMethodType <em>Named Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.NamedMethodType
	 * @generated
	 */
	public Adapter createNamedMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ParamValueType <em>Param Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ParamValueType
	 * @generated
	 */
	public Adapter createParamValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PathType <em>Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PathType
	 * @generated
	 */
	public Adapter createPathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextRefType <em>Persistence Context Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextRefType
	 * @generated
	 */
	public Adapter createPersistenceContextRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextTypeType <em>Persistence Context Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextTypeType
	 * @generated
	 */
	public Adapter createPersistenceContextTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceTypeType <em>Persistence Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceTypeType
	 * @generated
	 */
	public Adapter createPersistenceTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceUnitRefType <em>Persistence Unit Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceUnitRefType
	 * @generated
	 */
	public Adapter createPersistenceUnitRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PortComponentRefType <em>Port Component Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PortComponentRefType
	 * @generated
	 */
	public Adapter createPortComponentRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.PropertyType
	 * @generated
	 */
	public Adapter createPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryMethodType <em>Query Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryMethodType
	 * @generated
	 */
	public Adapter createQueryMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType <em>Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType
	 * @generated
	 */
	public Adapter createQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.RelationshipRoleSourceType <em>Relationship Role Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.RelationshipRoleSourceType
	 * @generated
	 */
	public Adapter createRelationshipRoleSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.RelationshipsType <em>Relationships Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.RelationshipsType
	 * @generated
	 */
	public Adapter createRelationshipsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.RemoteType <em>Remote Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.RemoteType
	 * @generated
	 */
	public Adapter createRemoteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.RemoveMethodType <em>Remove Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.RemoveMethodType
	 * @generated
	 */
	public Adapter createRemoveMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResAuthType <em>Res Auth Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResAuthType
	 * @generated
	 */
	public Adapter createResAuthTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceEnvRefType <em>Resource Env Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceEnvRefType
	 * @generated
	 */
	public Adapter createResourceEnvRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceRefType <em>Resource Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceRefType
	 * @generated
	 */
	public Adapter createResourceRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResSharingScopeType <em>Res Sharing Scope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResSharingScopeType
	 * @generated
	 */
	public Adapter createResSharingScopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResultTypeMappingType <em>Result Type Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ResultTypeMappingType
	 * @generated
	 */
	public Adapter createResultTypeMappingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.RoleNameType <em>Role Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.RoleNameType
	 * @generated
	 */
	public Adapter createRoleNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.RunAsType <em>Run As Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.RunAsType
	 * @generated
	 */
	public Adapter createRunAsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityIdentityType <em>Security Identity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityIdentityType
	 * @generated
	 */
	public Adapter createSecurityIdentityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleRefType <em>Security Role Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleRefType
	 * @generated
	 */
	public Adapter createSecurityRoleRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleType <em>Security Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleType
	 * @generated
	 */
	public Adapter createSecurityRoleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainsType <em>Service Ref Handler Chains Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainsType
	 * @generated
	 */
	public Adapter createServiceRefHandlerChainsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainType <em>Service Ref Handler Chain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainType
	 * @generated
	 */
	public Adapter createServiceRefHandlerChainTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType <em>Service Ref Handler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerType
	 * @generated
	 */
	public Adapter createServiceRefHandlerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType <em>Service Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType
	 * @generated
	 */
	public Adapter createServiceRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType <em>Session Bean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType
	 * @generated
	 */
	public Adapter createSessionBeanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionTypeType <em>Session Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionTypeType
	 * @generated
	 */
	public Adapter createSessionTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.String
	 * @generated
	 */
	public Adapter createStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.TransactionTypeType <em>Transaction Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.TransactionTypeType
	 * @generated
	 */
	public Adapter createTransactionTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.TransAttributeType <em>Trans Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.TransAttributeType
	 * @generated
	 */
	public Adapter createTransAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.TrueFalseType <em>True False Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.TrueFalseType
	 * @generated
	 */
	public Adapter createTrueFalseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.UrlPatternType <em>Url Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.UrlPatternType
	 * @generated
	 */
	public Adapter createUrlPatternTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdAnyURIType <em>Xsd Any URI Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdAnyURIType
	 * @generated
	 */
	public Adapter createXsdAnyURITypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdBooleanType <em>Xsd Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdBooleanType
	 * @generated
	 */
	public Adapter createXsdBooleanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdIntegerType <em>Xsd Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdIntegerType
	 * @generated
	 */
	public Adapter createXsdIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdNMTOKENType <em>Xsd NMTOKEN Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdNMTOKENType
	 * @generated
	 */
	public Adapter createXsdNMTOKENTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdNonNegativeIntegerType <em>Xsd Non Negative Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdNonNegativeIntegerType
	 * @generated
	 */
	public Adapter createXsdNonNegativeIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdPositiveIntegerType <em>Xsd Positive Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdPositiveIntegerType
	 * @generated
	 */
	public Adapter createXsdPositiveIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdQNameType <em>Xsd QName Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdQNameType
	 * @generated
	 */
	public Adapter createXsdQNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdStringType <em>Xsd String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdStringType
	 * @generated
	 */
	public Adapter createXsdStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EjbJar30AdapterFactory
