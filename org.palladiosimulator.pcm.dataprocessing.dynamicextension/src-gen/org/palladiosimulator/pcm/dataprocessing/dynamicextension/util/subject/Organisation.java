/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Organisation#getOwnedSubjects <em>Owned Subjects</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.SubjectPackage#getOrganisation()
 * @model
 * @generated
 */
public interface Organisation extends StatefulSubjects {
	/**
	 * Returns the value of the '<em><b>Owned Subjects</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Subject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Subjects</em>' reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.SubjectPackage#getOrganisation_OwnedSubjects()
	 * @model
	 * @generated
	 */
	EList<Subject> getOwnedSubjects();

} // Organisation
