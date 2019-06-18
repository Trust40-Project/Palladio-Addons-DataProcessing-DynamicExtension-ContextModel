/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.DynamicextensionPackage;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.impl.DynamicextensionPackageImpl;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperattributesPackage;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.HelperattributesPackageImpl;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Organisation;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Resource;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.StatefulSubjects;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Subject;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.SubjectFactory;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.SubjectPackage;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Subjects;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubjectPackageImpl extends EPackageImpl implements SubjectPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statefulSubjectsEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.SubjectPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubjectPackageImpl() {
		super(eNS_URI, SubjectFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SubjectPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubjectPackage init() {
		if (isInited)
			return (SubjectPackage) EPackage.Registry.INSTANCE.getEPackage(SubjectPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSubjectPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SubjectPackageImpl theSubjectPackage = registeredSubjectPackage instanceof SubjectPackageImpl
				? (SubjectPackageImpl) registeredSubjectPackage
				: new SubjectPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DataprocessingPackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DynamicextensionPackage.eNS_URI);
		DynamicextensionPackageImpl theDynamicextensionPackage = (DynamicextensionPackageImpl) (registeredPackage instanceof DynamicextensionPackageImpl
				? registeredPackage
				: DynamicextensionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
		ContextPackageImpl theContextPackage = (ContextPackageImpl) (registeredPackage instanceof ContextPackageImpl
				? registeredPackage
				: ContextPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HelperattributesPackage.eNS_URI);
		HelperattributesPackageImpl theHelperattributesPackage = (HelperattributesPackageImpl) (registeredPackage instanceof HelperattributesPackageImpl
				? registeredPackage
				: HelperattributesPackage.eINSTANCE);

		// Create package meta-data objects
		theSubjectPackage.createPackageContents();
		theDynamicextensionPackage.createPackageContents();
		theContextPackage.createPackageContents();
		theHelperattributesPackage.createPackageContents();

		// Initialize created meta-data
		theSubjectPackage.initializePackageContents();
		theDynamicextensionPackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theHelperattributesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubjectPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubjectPackage.eNS_URI, theSubjectPackage);
		return theSubjectPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubjects() {
		return subjectsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubjects_Subject() {
		return (EReference) subjectsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubject() {
		return subjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrganisation() {
		return organisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganisation_OwnedSubjects() {
		return (EReference) organisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatefulSubjects() {
		return statefulSubjectsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubjectFactory getSubjectFactory() {
		return (SubjectFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		subjectsEClass = createEClass(SUBJECTS);
		createEReference(subjectsEClass, SUBJECTS__SUBJECT);

		subjectEClass = createEClass(SUBJECT);

		resourceEClass = createEClass(RESOURCE);

		userEClass = createEClass(USER);

		organisationEClass = createEClass(ORGANISATION);
		createEReference(organisationEClass, ORGANISATION__OWNED_SUBJECTS);

		statefulSubjectsEClass = createEClass(STATEFUL_SUBJECTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EntityPackage theEntityPackage = (EntityPackage) EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		subjectEClass.getESuperTypes().add(theEntityPackage.getEntity());
		resourceEClass.getESuperTypes().add(this.getStatefulSubjects());
		userEClass.getESuperTypes().add(this.getSubject());
		organisationEClass.getESuperTypes().add(this.getStatefulSubjects());
		statefulSubjectsEClass.getESuperTypes().add(this.getSubject());

		// Initialize classes and features; add operations and parameters
		initEClass(subjectsEClass, Subjects.class, "Subjects", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubjects_Subject(), this.getSubject(), null, "subject", null, 0, -1, Subjects.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subjectEClass, Subject.class, "Subject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(organisationEClass, Organisation.class, "Organisation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganisation_OwnedSubjects(), this.getSubject(), null, "ownedSubjects", null, 0, -1,
				Organisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statefulSubjectsEClass, StatefulSubjects.class, "StatefulSubjects", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
	}

} //SubjectPackageImpl
