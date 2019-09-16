/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension;

import org.eclipse.emf.cdo.CDOObject;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperContainer;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Subjects;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.DynamicSpecification#getSubjectContainer <em>Subject Container</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.DynamicSpecification#getHelperContainer <em>Helper Container</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.DynamicextensionPackage#getDynamicSpecification()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface DynamicSpecification extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Subject Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject Container</em>' containment reference.
	 * @see #setSubjectContainer(Subjects)
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.DynamicextensionPackage#getDynamicSpecification_SubjectContainer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Subjects getSubjectContainer();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.DynamicSpecification#getSubjectContainer <em>Subject Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Container</em>' containment reference.
	 * @see #getSubjectContainer()
	 * @generated
	 */
	void setSubjectContainer(Subjects value);

	/**
	 * Returns the value of the '<em><b>Helper Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Helper Container</em>' containment reference.
	 * @see #setHelperContainer(HelperContainer)
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.DynamicextensionPackage#getDynamicSpecification_HelperContainer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HelperContainer getHelperContainer();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.DynamicSpecification#getHelperContainer <em>Helper Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Helper Container</em>' containment reference.
	 * @see #getHelperContainer()
	 * @generated
	 */
	void setHelperContainer(HelperContainer value);

} // DynamicSpecification
