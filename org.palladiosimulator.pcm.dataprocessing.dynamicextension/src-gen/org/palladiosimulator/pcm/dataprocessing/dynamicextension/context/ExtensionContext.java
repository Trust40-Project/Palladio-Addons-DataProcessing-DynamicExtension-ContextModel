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
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ExtensionContext#getCustomAccessPolicy <em>Custom Access Policy</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ExtensionContext#isAddAtEnd <em>Add At End</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage#getExtensionContext()
 * @model
 * @generated
 */
public interface ExtensionContext extends UserDeclaredContext {
	/**
	 * Returns the value of the '<em><b>Custom Access Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Access Policy</em>' attribute.
	 * @see #setCustomAccessPolicy(String)
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage#getExtensionContext_CustomAccessPolicy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getCustomAccessPolicy();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ExtensionContext#getCustomAccessPolicy <em>Custom Access Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Access Policy</em>' attribute.
	 * @see #getCustomAccessPolicy()
	 * @generated
	 */
	void setCustomAccessPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Add At End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add At End</em>' attribute.
	 * @see #setAddAtEnd(boolean)
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage#getExtensionContext_AddAtEnd()
	 * @model
	 * @generated
	 */
	boolean isAddAtEnd();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ExtensionContext#isAddAtEnd <em>Add At End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add At End</em>' attribute.
	 * @see #isAddAtEnd()
	 * @generated
	 */
	void setAddAtEnd(boolean value);

} // ExtensionContext
