/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.SubjectFactory
 * @model kind="package"
 * @generated
 */
public interface SubjectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "subject";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.palladiosimulator.org/pcm/dataprocessing/dynamic/util/subject/0.1/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "subject";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubjectPackage eINSTANCE = org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.SubjectPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.SubjectsImpl <em>Subjects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.SubjectsImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.SubjectPackageImpl#getSubjects()
	 * @generated
	 */
	int SUBJECTS = 0;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECTS__SUBJECT = 0;

	/**
	 * The number of structural features of the '<em>Subjects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECTS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.SubjectImpl <em>Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.SubjectImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.SubjectPackageImpl#getSubject()
	 * @generated
	 */
	int SUBJECT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The number of structural features of the '<em>Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.StatefulSubjectsImpl <em>Stateful Subjects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.StatefulSubjectsImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.SubjectPackageImpl#getStatefulSubjects()
	 * @generated
	 */
	int STATEFUL_SUBJECTS = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SUBJECTS__ID = SUBJECT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SUBJECTS__ENTITY_NAME = SUBJECT__ENTITY_NAME;

	/**
	 * The number of structural features of the '<em>Stateful Subjects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SUBJECTS_FEATURE_COUNT = SUBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.ResourceImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.SubjectPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ID = STATEFUL_SUBJECTS__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ENTITY_NAME = STATEFUL_SUBJECTS__ENTITY_NAME;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = STATEFUL_SUBJECTS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.UserImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.SubjectPackageImpl#getUser()
	 * @generated
	 */
	int USER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = SUBJECT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ENTITY_NAME = SUBJECT__ENTITY_NAME;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = SUBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.OrganisationImpl <em>Organisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.OrganisationImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.SubjectPackageImpl#getOrganisation()
	 * @generated
	 */
	int ORGANISATION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__ID = STATEFUL_SUBJECTS__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__ENTITY_NAME = STATEFUL_SUBJECTS__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Owned Subjects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__OWNED_SUBJECTS = STATEFUL_SUBJECTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FEATURE_COUNT = STATEFUL_SUBJECTS_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Subjects <em>Subjects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subjects</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Subjects
	 * @generated
	 */
	EClass getSubjects();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Subjects#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subject</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Subjects#getSubject()
	 * @see #getSubjects()
	 * @generated
	 */
	EReference getSubjects_Subject();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Subject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Subject
	 * @generated
	 */
	EClass getSubject();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Organisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisation</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Organisation
	 * @generated
	 */
	EClass getOrganisation();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Organisation#getOwnedSubjects <em>Owned Subjects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Subjects</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Organisation#getOwnedSubjects()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_OwnedSubjects();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.StatefulSubjects <em>Stateful Subjects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stateful Subjects</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.StatefulSubjects
	 * @generated
	 */
	EClass getStatefulSubjects();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SubjectFactory getSubjectFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.SubjectsImpl <em>Subjects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.SubjectsImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.SubjectPackageImpl#getSubjects()
		 * @generated
		 */
		EClass SUBJECTS = eINSTANCE.getSubjects();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBJECTS__SUBJECT = eINSTANCE.getSubjects_Subject();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.SubjectImpl <em>Subject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.SubjectImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.SubjectPackageImpl#getSubject()
		 * @generated
		 */
		EClass SUBJECT = eINSTANCE.getSubject();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.ResourceImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.SubjectPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.UserImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.SubjectPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.OrganisationImpl <em>Organisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.OrganisationImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.SubjectPackageImpl#getOrganisation()
		 * @generated
		 */
		EClass ORGANISATION = eINSTANCE.getOrganisation();

		/**
		 * The meta object literal for the '<em><b>Owned Subjects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__OWNED_SUBJECTS = eINSTANCE.getOrganisation_OwnedSubjects();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.StatefulSubjectsImpl <em>Stateful Subjects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.StatefulSubjectsImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.SubjectPackageImpl#getStatefulSubjects()
		 * @generated
		 */
		EClass STATEFUL_SUBJECTS = eINSTANCE.getStatefulSubjects();

	}

} //SubjectPackage
