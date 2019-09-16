/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subjects</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Subjects#getSubject <em>Subject</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.SubjectPackage#getSubjects()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Subjects extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Subject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.SubjectPackage#getSubjects_Subject()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subject> getSubject();

} // Subjects
