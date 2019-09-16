/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.context;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Privacy Level Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.PrivacyLevelContext#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage#getPrivacyLevelContext()
 * @model
 * @generated
 */
public interface PrivacyLevelContext extends UserDeclaredContext {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' reference.
	 * @see #setLevel(EnumCharacteristicLiteral)
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage#getPrivacyLevelContext_Level()
	 * @model
	 * @generated
	 */
	EnumCharacteristicLiteral getLevel();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.PrivacyLevelContext#getLevel <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' reference.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(EnumCharacteristicLiteral value);

} // PrivacyLevelContext
