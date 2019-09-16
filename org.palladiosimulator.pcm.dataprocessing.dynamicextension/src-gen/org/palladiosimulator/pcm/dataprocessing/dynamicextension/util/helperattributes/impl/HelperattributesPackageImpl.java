/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.DynamicextensionPackage;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.impl.DynamicextensionPackageImpl;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperContainer;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperattributesFactory;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperattributesPackage;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Location;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.LocationContainer;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Prerequisite;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.PrerequisiteContainer;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Role;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.RoleContainer;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Shift;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.ShiftContainer;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.SubjectPackage;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.impl.SubjectPackageImpl;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HelperattributesPackageImpl extends EPackageImpl implements HelperattributesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass helperContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shiftContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shiftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prerequisiteContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prerequisiteEClass = null;

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
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperattributesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HelperattributesPackageImpl() {
		super(eNS_URI, HelperattributesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HelperattributesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HelperattributesPackage init() {
		if (isInited)
			return (HelperattributesPackage) EPackage.Registry.INSTANCE.getEPackage(HelperattributesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHelperattributesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		HelperattributesPackageImpl theHelperattributesPackage = registeredHelperattributesPackage instanceof HelperattributesPackageImpl
				? (HelperattributesPackageImpl) registeredHelperattributesPackage
				: new HelperattributesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DataprocessingPackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DynamicextensionPackage.eNS_URI);
		DynamicextensionPackageImpl theDynamicextensionPackage = (DynamicextensionPackageImpl) (registeredPackage instanceof DynamicextensionPackageImpl
				? registeredPackage
				: DynamicextensionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
		ContextPackageImpl theContextPackage = (ContextPackageImpl) (registeredPackage instanceof ContextPackageImpl
				? registeredPackage
				: ContextPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubjectPackage.eNS_URI);
		SubjectPackageImpl theSubjectPackage = (SubjectPackageImpl) (registeredPackage instanceof SubjectPackageImpl
				? registeredPackage
				: SubjectPackage.eINSTANCE);

		// Create package meta-data objects
		theHelperattributesPackage.createPackageContents();
		theDynamicextensionPackage.createPackageContents();
		theContextPackage.createPackageContents();
		theSubjectPackage.createPackageContents();

		// Initialize created meta-data
		theHelperattributesPackage.initializePackageContents();
		theDynamicextensionPackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theSubjectPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHelperattributesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HelperattributesPackage.eNS_URI, theHelperattributesPackage);
		return theHelperattributesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHelperContainer() {
		return helperContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHelperContainer_Shiftcontainer() {
		return (EReference) helperContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHelperContainer_Rolecontainer() {
		return (EReference) helperContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHelperContainer_Locationcontainer() {
		return (EReference) helperContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHelperContainer_Prerequisitecontainer() {
		return (EReference) helperContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocationContainer() {
		return locationContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocationContainer_Organisation() {
		return (EReference) locationContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocationContainer_Location() {
		return (EReference) locationContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShiftContainer() {
		return shiftContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShiftContainer_Organisation() {
		return (EReference) shiftContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShiftContainer_Shift() {
		return (EReference) shiftContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoleContainer() {
		return roleContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoleContainer_Organisation() {
		return (EReference) roleContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoleContainer_Role() {
		return (EReference) roleContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocation_Includes() {
		return (EReference) locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShift() {
		return shiftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShift_StartTime() {
		return (EAttribute) shiftEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShift_EndTime() {
		return (EAttribute) shiftEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Subordinateroles() {
		return (EReference) roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrerequisiteContainer() {
		return prerequisiteContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrerequisiteContainer_Prerequisite() {
		return (EReference) prerequisiteContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrerequisite() {
		return prerequisiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrerequisite_Prerequisite() {
		return (EReference) prerequisiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HelperattributesFactory getHelperattributesFactory() {
		return (HelperattributesFactory) getEFactoryInstance();
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
		helperContainerEClass = createEClass(HELPER_CONTAINER);
		createEReference(helperContainerEClass, HELPER_CONTAINER__SHIFTCONTAINER);
		createEReference(helperContainerEClass, HELPER_CONTAINER__ROLECONTAINER);
		createEReference(helperContainerEClass, HELPER_CONTAINER__LOCATIONCONTAINER);
		createEReference(helperContainerEClass, HELPER_CONTAINER__PREREQUISITECONTAINER);

		locationContainerEClass = createEClass(LOCATION_CONTAINER);
		createEReference(locationContainerEClass, LOCATION_CONTAINER__ORGANISATION);
		createEReference(locationContainerEClass, LOCATION_CONTAINER__LOCATION);

		shiftContainerEClass = createEClass(SHIFT_CONTAINER);
		createEReference(shiftContainerEClass, SHIFT_CONTAINER__ORGANISATION);
		createEReference(shiftContainerEClass, SHIFT_CONTAINER__SHIFT);

		roleContainerEClass = createEClass(ROLE_CONTAINER);
		createEReference(roleContainerEClass, ROLE_CONTAINER__ORGANISATION);
		createEReference(roleContainerEClass, ROLE_CONTAINER__ROLE);

		locationEClass = createEClass(LOCATION);
		createEReference(locationEClass, LOCATION__INCLUDES);

		shiftEClass = createEClass(SHIFT);
		createEAttribute(shiftEClass, SHIFT__START_TIME);
		createEAttribute(shiftEClass, SHIFT__END_TIME);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__SUBORDINATEROLES);

		prerequisiteContainerEClass = createEClass(PREREQUISITE_CONTAINER);
		createEReference(prerequisiteContainerEClass, PREREQUISITE_CONTAINER__PREREQUISITE);

		prerequisiteEClass = createEClass(PREREQUISITE);
		createEReference(prerequisiteEClass, PREREQUISITE__PREREQUISITE);
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
		SubjectPackage theSubjectPackage = (SubjectPackage) EPackage.Registry.INSTANCE
				.getEPackage(SubjectPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage) EPackage.Registry.INSTANCE
				.getEPackage(RepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		locationContainerEClass.getESuperTypes().add(theEntityPackage.getEntity());
		shiftContainerEClass.getESuperTypes().add(theEntityPackage.getEntity());
		roleContainerEClass.getESuperTypes().add(theEntityPackage.getEntity());
		locationEClass.getESuperTypes().add(theEntityPackage.getEntity());
		shiftEClass.getESuperTypes().add(theEntityPackage.getEntity());
		roleEClass.getESuperTypes().add(theEntityPackage.getEntity());
		prerequisiteContainerEClass.getESuperTypes().add(theEntityPackage.getEntity());
		prerequisiteEClass.getESuperTypes().add(theEntityPackage.getEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(helperContainerEClass, HelperContainer.class, "HelperContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHelperContainer_Shiftcontainer(), this.getShiftContainer(), null, "shiftcontainer", null, 0,
				-1, HelperContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHelperContainer_Rolecontainer(), this.getRoleContainer(), null, "rolecontainer", null, 0, -1,
				HelperContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHelperContainer_Locationcontainer(), this.getLocationContainer(), null, "locationcontainer",
				null, 0, -1, HelperContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHelperContainer_Prerequisitecontainer(), this.getPrerequisiteContainer(), null,
				"prerequisitecontainer", null, 0, -1, HelperContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationContainerEClass, LocationContainer.class, "LocationContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocationContainer_Organisation(), theSubjectPackage.getOrganisation(), null, "organisation",
				null, 1, 1, LocationContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocationContainer_Location(), this.getLocation(), null, "location", null, 0, -1,
				LocationContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shiftContainerEClass, ShiftContainer.class, "ShiftContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShiftContainer_Organisation(), theSubjectPackage.getOrganisation(), null, "organisation",
				null, 1, 1, ShiftContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShiftContainer_Shift(), this.getShift(), null, "shift", null, 0, -1, ShiftContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleContainerEClass, RoleContainer.class, "RoleContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleContainer_Organisation(), theSubjectPackage.getOrganisation(), null, "organisation", null,
				1, 1, RoleContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleContainer_Role(), this.getRole(), null, "role", null, 0, -1, RoleContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocation_Includes(), this.getLocation(), null, "includes", null, 0, -1, Location.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shiftEClass, Shift.class, "Shift", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShift_StartTime(), theXMLTypePackage.getDateTime(), "startTime", null, 0, 1, Shift.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShift_EndTime(), theXMLTypePackage.getDateTime(), "endTime", null, 0, 1, Shift.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Subordinateroles(), this.getRole(), null, "subordinateroles", null, 0, -1, Role.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prerequisiteContainerEClass, PrerequisiteContainer.class, "PrerequisiteContainer", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrerequisiteContainer_Prerequisite(), this.getPrerequisite(), null, "prerequisite", null, 0,
				-1, PrerequisiteContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prerequisiteEClass, Prerequisite.class, "Prerequisite", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrerequisite_Prerequisite(), theRepositoryPackage.getOperationSignature(), null,
				"prerequisite", null, 1, 1, Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //HelperattributesPackageImpl
