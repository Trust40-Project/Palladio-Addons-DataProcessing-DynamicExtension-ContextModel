/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes;

import org.palladiosimulator.pcm.core.entity.Entity;

import org.palladiosimulator.pcm.repository.OperationSignature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prerequisite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Prerequisite#getPrerequisite <em>Prerequisite</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperattributesPackage#getPrerequisite()
 * @model
 * @generated
 */
public interface Prerequisite extends Entity {
	/**
	 * Returns the value of the '<em><b>Prerequisite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prerequisite</em>' reference.
	 * @see #setPrerequisite(OperationSignature)
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperattributesPackage#getPrerequisite_Prerequisite()
	 * @model required="true"
	 * @generated
	 */
	OperationSignature getPrerequisite();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Prerequisite#getPrerequisite <em>Prerequisite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prerequisite</em>' reference.
	 * @see #getPrerequisite()
	 * @generated
	 */
	void setPrerequisite(OperationSignature value);

} // Prerequisite
