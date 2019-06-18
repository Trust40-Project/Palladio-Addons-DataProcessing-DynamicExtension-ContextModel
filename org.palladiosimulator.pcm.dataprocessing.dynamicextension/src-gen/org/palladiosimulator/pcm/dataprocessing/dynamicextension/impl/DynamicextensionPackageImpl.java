/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.impl;

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
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.DynamicSpecification;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.DynamicextensionFactory;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.DynamicextensionPackage;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperattributesPackage;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.HelperattributesPackageImpl;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.SubjectPackage;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.SubjectPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DynamicextensionPackageImpl extends EPackageImpl implements DynamicextensionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicSpecificationEClass = null;

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
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.DynamicextensionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DynamicextensionPackageImpl() {
		super(eNS_URI, DynamicextensionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DynamicextensionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DynamicextensionPackage init() {
		if (isInited)
			return (DynamicextensionPackage) EPackage.Registry.INSTANCE.getEPackage(DynamicextensionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDynamicextensionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DynamicextensionPackageImpl theDynamicextensionPackage = registeredDynamicextensionPackage instanceof DynamicextensionPackageImpl
				? (DynamicextensionPackageImpl) registeredDynamicextensionPackage
				: new DynamicextensionPackageImpl();

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
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
		ContextPackageImpl theContextPackage = (ContextPackageImpl) (registeredPackage instanceof ContextPackageImpl
				? registeredPackage
				: ContextPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubjectPackage.eNS_URI);
		SubjectPackageImpl theSubjectPackage = (SubjectPackageImpl) (registeredPackage instanceof SubjectPackageImpl
				? registeredPackage
				: SubjectPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HelperattributesPackage.eNS_URI);
		HelperattributesPackageImpl theHelperattributesPackage = (HelperattributesPackageImpl) (registeredPackage instanceof HelperattributesPackageImpl
				? registeredPackage
				: HelperattributesPackage.eINSTANCE);

		// Create package meta-data objects
		theDynamicextensionPackage.createPackageContents();
		theContextPackage.createPackageContents();
		theSubjectPackage.createPackageContents();
		theHelperattributesPackage.createPackageContents();

		// Initialize created meta-data
		theDynamicextensionPackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theSubjectPackage.initializePackageContents();
		theHelperattributesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDynamicextensionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DynamicextensionPackage.eNS_URI, theDynamicextensionPackage);
		return theDynamicextensionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDynamicSpecification() {
		return dynamicSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDynamicSpecification_SubjectContainer() {
		return (EReference) dynamicSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDynamicSpecification_HelperContainer() {
		return (EReference) dynamicSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicextensionFactory getDynamicextensionFactory() {
		return (DynamicextensionFactory) getEFactoryInstance();
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
		dynamicSpecificationEClass = createEClass(DYNAMIC_SPECIFICATION);
		createEReference(dynamicSpecificationEClass, DYNAMIC_SPECIFICATION__SUBJECT_CONTAINER);
		createEReference(dynamicSpecificationEClass, DYNAMIC_SPECIFICATION__HELPER_CONTAINER);
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
		ContextPackage theContextPackage = (ContextPackage) EPackage.Registry.INSTANCE
				.getEPackage(ContextPackage.eNS_URI);
		SubjectPackage theSubjectPackage = (SubjectPackage) EPackage.Registry.INSTANCE
				.getEPackage(SubjectPackage.eNS_URI);
		HelperattributesPackage theHelperattributesPackage = (HelperattributesPackage) EPackage.Registry.INSTANCE
				.getEPackage(HelperattributesPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theContextPackage);
		getESubpackages().add(theSubjectPackage);
		getESubpackages().add(theHelperattributesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(dynamicSpecificationEClass, DynamicSpecification.class, "DynamicSpecification", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDynamicSpecification_SubjectContainer(), theSubjectPackage.getSubjects(), null,
				"subjectContainer", null, 1, 1, DynamicSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicSpecification_HelperContainer(), theHelperattributesPackage.getHelperContainer(), null,
				"helperContainer", null, 1, 1, DynamicSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DynamicextensionPackageImpl
