/**
 *   Copyright (c) 2010 Mia-Software.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *   
 *   Contributors:
 *   
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.webapp.webapp25;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jsp Property Group Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The jsp-property-groupType is used to group a number of
 * 	files so they can be given global property information.
 * 	All files so described are deemed to be JSP files.  The
 * 	following additional properties can be described:
 * 
 * 	    - Control whether EL is ignored.
 * 	    - Control whether scripting elements are invalid.
 * 	    - Indicate pageEncoding information.
 * 	    - Indicate that a resource is a JSP document (XML).
 * 	    - Prelude and Coda automatic includes.
 *             - Control whether the character sequence #{ is allowed
 *               when used as a String literal.
 *             - Control whether template text containing only
 *               whitespaces must be removed from the response output.
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.JspPropertyGroupType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.JspPropertyGroupType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.JspPropertyGroupType#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.JspPropertyGroupType#getUrlPattern <em>Url Pattern</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.JspPropertyGroupType#getElIgnored <em>El Ignored</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.JspPropertyGroupType#getPageEncoding <em>Page Encoding</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.JspPropertyGroupType#getScriptingInvalid <em>Scripting Invalid</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.JspPropertyGroupType#getIsXml <em>Is Xml</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.JspPropertyGroupType#getIncludePrelude <em>Include Prelude</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.JspPropertyGroupType#getIncludeCoda <em>Include Coda</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.JspPropertyGroupType#getDeferredSyntaxAllowedAsLiteral <em>Deferred Syntax Allowed As Literal</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.JspPropertyGroupType#getTrimDirectiveWhitespaces <em>Trim Directive Whitespaces</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.JspPropertyGroupType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getJspPropertyGroupType()
 * @model extendedMetaData="name='jsp-property-groupType' kind='elementOnly'"
 * @generated
 */
public interface JspPropertyGroupType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp25.DescriptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getJspPropertyGroupType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<DescriptionType> getDescription();

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp25.DisplayNameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getJspPropertyGroupType_DisplayName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='display-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<DisplayNameType> getDisplayName();

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp25.IconType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getJspPropertyGroupType_Icon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='icon' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<IconType> getIcon();

	/**
	 * Returns the value of the '<em><b>Url Pattern</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp25.UrlPatternType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url Pattern</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Pattern</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getJspPropertyGroupType_UrlPattern()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='url-pattern' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<UrlPatternType> getUrlPattern();

	/**
	 * Returns the value of the '<em><b>El Ignored</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    Can be used to easily set the isELIgnored
	 * 	    property of a group of JSP pages.  By default, the
	 * 	    EL evaluation is enabled for Web Applications using
	 * 	    a Servlet 2.4 or greater web.xml, and disabled
	 * 	    otherwise.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>El Ignored</em>' containment reference.
	 * @see #setElIgnored(TrueFalseType)
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getJspPropertyGroupType_ElIgnored()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='el-ignored' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	TrueFalseType getElIgnored();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.JspPropertyGroupType#getElIgnored <em>El Ignored</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>El Ignored</em>' containment reference.
	 * @see #getElIgnored()
	 * @generated
	 */
	void setElIgnored(TrueFalseType value);

	/**
	 * Returns the value of the '<em><b>Page Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The valid values of page-encoding are those of the
	 * 	    pageEncoding page directive.  It is a
	 * 	    translation-time error to name different encodings
	 * 	    in the pageEncoding attribute of the page directive
	 * 	    of a JSP page and in a JSP configuration element
	 * 	    matching the page.  It is also a translation-time
	 * 	    error to name different encodings in the prolog
	 * 	    or text declaration of a document in XML syntax and
	 * 	    in a JSP configuration element matching the document.
	 * 	    It is legal to name the same encoding through
	 * 	    mulitple mechanisms.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Page Encoding</em>' containment reference.
	 * @see #setPageEncoding(org.eclipse.modisco.jee.webapp.webapp25.String)
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getJspPropertyGroupType_PageEncoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='page-encoding' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	org.eclipse.modisco.jee.webapp.webapp25.String getPageEncoding();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.JspPropertyGroupType#getPageEncoding <em>Page Encoding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Encoding</em>' containment reference.
	 * @see #getPageEncoding()
	 * @generated
	 */
	void setPageEncoding(org.eclipse.modisco.jee.webapp.webapp25.String value);

	/**
	 * Returns the value of the '<em><b>Scripting Invalid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    Can be used to easily disable scripting in a
	 * 	    group of JSP pages.  By default, scripting is
	 * 	    enabled.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scripting Invalid</em>' containment reference.
	 * @see #setScriptingInvalid(TrueFalseType)
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getJspPropertyGroupType_ScriptingInvalid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scripting-invalid' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	TrueFalseType getScriptingInvalid();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.JspPropertyGroupType#getScriptingInvalid <em>Scripting Invalid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scripting Invalid</em>' containment reference.
	 * @see #getScriptingInvalid()
	 * @generated
	 */
	void setScriptingInvalid(TrueFalseType value);

	/**
	 * Returns the value of the '<em><b>Is Xml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    If true, denotes that the group of resources
	 * 	    that match the URL pattern are JSP documents,
	 * 	    and thus must be interpreted as XML documents.
	 * 	    If false, the resources are assumed to not
	 * 	    be JSP documents, unless there is another
	 * 	    property group that indicates otherwise.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Xml</em>' containment reference.
	 * @see #setIsXml(TrueFalseType)
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getJspPropertyGroupType_IsXml()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='is-xml' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	TrueFalseType getIsXml();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.JspPropertyGroupType#getIsXml <em>Is Xml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Xml</em>' containment reference.
	 * @see #getIsXml()
	 * @generated
	 */
	void setIsXml(TrueFalseType value);

	/**
	 * Returns the value of the '<em><b>Include Prelude</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp25.PathType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The include-prelude element is a context-relative
	 * 	    path that must correspond to an element in the
	 * 	    Web Application.  When the element is present,
	 * 	    the given path will be automatically included (as
	 * 	    in an include directive) at the beginning of each
	 * 	    JSP page in this jsp-property-group.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Prelude</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getJspPropertyGroupType_IncludePrelude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='include-prelude' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<PathType> getIncludePrelude();

	/**
	 * Returns the value of the '<em><b>Include Coda</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp25.PathType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The include-coda element is a context-relative
	 * 	    path that must correspond to an element in the
	 * 	    Web Application.  When the element is present,
	 * 	    the given path will be automatically included (as
	 * 	    in an include directive) at the end of each
	 * 	    JSP page in this jsp-property-group.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Coda</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getJspPropertyGroupType_IncludeCoda()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='include-coda' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<PathType> getIncludeCoda();

	/**
	 * Returns the value of the '<em><b>Deferred Syntax Allowed As Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *              The character sequence #{ is reserved for EL expressions.
	 *              Consequently, a translation error occurs if the #{
	 *              character sequence is used as a String literal, unless
	 *              this element is enabled (true). Disabled (false) by
	 *              default.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deferred Syntax Allowed As Literal</em>' containment reference.
	 * @see #setDeferredSyntaxAllowedAsLiteral(TrueFalseType)
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getJspPropertyGroupType_DeferredSyntaxAllowedAsLiteral()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deferred-syntax-allowed-as-literal' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	TrueFalseType getDeferredSyntaxAllowedAsLiteral();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.JspPropertyGroupType#getDeferredSyntaxAllowedAsLiteral <em>Deferred Syntax Allowed As Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deferred Syntax Allowed As Literal</em>' containment reference.
	 * @see #getDeferredSyntaxAllowedAsLiteral()
	 * @generated
	 */
	void setDeferredSyntaxAllowedAsLiteral(TrueFalseType value);

	/**
	 * Returns the value of the '<em><b>Trim Directive Whitespaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *              Indicates that template text containing only whitespaces
	 *              must be removed from the response output. It has no
	 *              effect on JSP documents (XML syntax). Disabled (false)
	 *              by default.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trim Directive Whitespaces</em>' containment reference.
	 * @see #setTrimDirectiveWhitespaces(TrueFalseType)
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getJspPropertyGroupType_TrimDirectiveWhitespaces()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trim-directive-whitespaces' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	TrueFalseType getTrimDirectiveWhitespaces();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.JspPropertyGroupType#getTrimDirectiveWhitespaces <em>Trim Directive Whitespaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trim Directive Whitespaces</em>' containment reference.
	 * @see #getTrimDirectiveWhitespaces()
	 * @generated
	 */
	void setTrimDirectiveWhitespaces(TrueFalseType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getJspPropertyGroupType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.JspPropertyGroupType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // JspPropertyGroupType
