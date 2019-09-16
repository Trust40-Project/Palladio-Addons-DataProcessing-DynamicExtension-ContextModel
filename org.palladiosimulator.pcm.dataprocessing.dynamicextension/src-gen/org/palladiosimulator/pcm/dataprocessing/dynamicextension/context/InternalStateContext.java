/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.context;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicLiteral;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.StatefulSubjects;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal State Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.InternalStateContext#getState <em>State</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.InternalStateContext#getSubject <em>Subject</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage#getInternalStateContext()
 * @model
 * @generated
 */
public interface InternalStateContext extends UserDeclaredContext {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(EnumCharacteristicLiteral)
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage#getInternalStateContext_State()
	 * @model
	 * @generated
	 */
	EnumCharacteristicLiteral getState();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.InternalStateContext#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(EnumCharacteristicLiteral value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' reference.
	 * @see #setSubject(StatefulSubjects)
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage#getInternalStateContext_Subject()
	 * @model required="true"
	 * @generated
	 */
	StatefulSubjects getSubject();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.InternalStateContext#getSubject <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(StatefulSubjects value);

} // InternalStateContext
