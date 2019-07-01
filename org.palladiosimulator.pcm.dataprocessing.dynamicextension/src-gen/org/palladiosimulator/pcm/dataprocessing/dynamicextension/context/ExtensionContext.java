/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.context;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ExtensionContext#getExtensionCode <em>Extension Code</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage#getExtensionContext()
 * @model
 * @generated
 */
public interface ExtensionContext extends UserDeclaredContext {
	/**
	 * Returns the value of the '<em><b>Extension Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Code</em>' attribute.
	 * @see #setExtensionCode(String)
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage#getExtensionContext_ExtensionCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getExtensionCode();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ExtensionContext#getExtensionCode <em>Extension Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Code</em>' attribute.
	 * @see #getExtensionCode()
	 * @generated
	 */
	void setExtensionCode(String value);

} // ExtensionContext
