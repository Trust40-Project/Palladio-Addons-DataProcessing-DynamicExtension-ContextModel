/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.context;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Prerequisite;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prerequisite Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.PrerequisiteContext#getPrerequisite <em>Prerequisite</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage#getPrerequisiteContext()
 * @model
 * @generated
 */
public interface PrerequisiteContext extends UserDeclaredContext {
	/**
	 * Returns the value of the '<em><b>Prerequisite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prerequisite</em>' reference.
	 * @see #setPrerequisite(Prerequisite)
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage#getPrerequisiteContext_Prerequisite()
	 * @model required="true"
	 * @generated
	 */
	Prerequisite getPrerequisite();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.PrerequisiteContext#getPrerequisite <em>Prerequisite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prerequisite</em>' reference.
	 * @see #getPrerequisite()
	 * @generated
	 */
	void setPrerequisite(Prerequisite value);

} // PrerequisiteContext
