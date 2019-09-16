/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Organisation;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Subject;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.SubjectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.OrganisationImpl#getOwnedSubjects <em>Owned Subjects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganisationImpl extends StatefulSubjectsImpl implements Organisation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SubjectPackage.Literals.ORGANISATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Subject> getOwnedSubjects() {
		return (EList<Subject>) eGet(SubjectPackage.Literals.ORGANISATION__OWNED_SUBJECTS, true);
	}

} //OrganisationImpl
