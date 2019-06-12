/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Subject;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.SubjectPackage;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Subjects;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subjects</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.SubjectsImpl#getSubject <em>Subject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubjectsImpl extends CDOObjectImpl implements Subjects {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SubjectPackage.Literals.SUBJECTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Subject> getSubject() {
		return (EList<Subject>) eGet(SubjectPackage.Literals.SUBJECTS__SUBJECT, true);
	}

} //SubjectsImpl
