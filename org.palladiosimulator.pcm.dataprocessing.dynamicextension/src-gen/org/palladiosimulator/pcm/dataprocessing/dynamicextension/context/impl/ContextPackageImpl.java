/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.DynamicextensionPackage;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.Comparison;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ComparisonContext;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.Context;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextCharacteristic;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextCharacteristicType;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextFactory;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.EnvironmentalContext;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ExtensionContext;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.InternalStateContext;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.LocationContext;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.OrganisationContext;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.PrerequisiteContext;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.PrivacyLevelContext;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.RoleContext;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ShiftContext;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.UserDeclaredContext;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.impl.DynamicextensionPackageImpl;

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
public class ContextPackageImpl extends EPackageImpl implements ContextPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentalContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDeclaredContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organisationContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shiftContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalStateContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextCharacteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextCharacteristicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privacyLevelContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prerequisiteContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numberEDataType = null;

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
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContextPackageImpl() {
		super(eNS_URI, ContextFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ContextPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContextPackage init() {
		if (isInited)
			return (ContextPackage) EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredContextPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ContextPackageImpl theContextPackage = registeredContextPackage instanceof ContextPackageImpl
				? (ContextPackageImpl) registeredContextPackage
				: new ContextPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubjectPackage.eNS_URI);
		SubjectPackageImpl theSubjectPackage = (SubjectPackageImpl) (registeredPackage instanceof SubjectPackageImpl
				? registeredPackage
				: SubjectPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HelperattributesPackage.eNS_URI);
		HelperattributesPackageImpl theHelperattributesPackage = (HelperattributesPackageImpl) (registeredPackage instanceof HelperattributesPackageImpl
				? registeredPackage
				: HelperattributesPackage.eINSTANCE);

		// Create package meta-data objects
		theContextPackage.createPackageContents();
		theDynamicextensionPackage.createPackageContents();
		theSubjectPackage.createPackageContents();
		theHelperattributesPackage.createPackageContents();

		// Initialize created meta-data
		theContextPackage.initializePackageContents();
		theDynamicextensionPackage.initializePackageContents();
		theSubjectPackage.initializePackageContents();
		theHelperattributesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContextPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContextPackage.eNS_URI, theContextPackage);
		return theContextPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironmentalContext() {
		return environmentalContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserDeclaredContext() {
		return userDeclaredContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocationContext() {
		return locationContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocationContext_CurrentLocation() {
		return (EReference) locationContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrganisationContext() {
		return organisationContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganisationContext_Organisation() {
		return (EReference) organisationContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShiftContext() {
		return shiftContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShiftContext_Shift() {
		return (EReference) shiftContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoleContext() {
		return roleContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoleContext_Role() {
		return (EReference) roleContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalStateContext() {
		return internalStateContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInternalStateContext_State() {
		return (EReference) internalStateContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInternalStateContext_Subject() {
		return (EReference) internalStateContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContextCharacteristic() {
		return contextCharacteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContextCharacteristic_Context() {
		return (EReference) contextCharacteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContextCharacteristicType() {
		return contextCharacteristicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContextCharacteristicType_Context() {
		return (EReference) contextCharacteristicTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrivacyLevelContext() {
		return privacyLevelContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrivacyLevelContext_Level() {
		return (EReference) privacyLevelContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComparisonContext() {
		return comparisonContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComparisonContext_Comparison() {
		return (EAttribute) comparisonContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComparisonContext_Threshold() {
		return (EAttribute) comparisonContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComparisonContext_IsFloating() {
		return (EAttribute) comparisonContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrerequisiteContext() {
		return prerequisiteContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrerequisiteContext_Prerequisite() {
		return (EReference) prerequisiteContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtensionContext() {
		return extensionContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtensionContext_ExtensionCode() {
		return (EAttribute) extensionContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getComparison() {
		return comparisonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNumber() {
		return numberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextFactory getContextFactory() {
		return (ContextFactory) getEFactoryInstance();
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
		contextEClass = createEClass(CONTEXT);

		environmentalContextEClass = createEClass(ENVIRONMENTAL_CONTEXT);

		userDeclaredContextEClass = createEClass(USER_DECLARED_CONTEXT);

		locationContextEClass = createEClass(LOCATION_CONTEXT);
		createEReference(locationContextEClass, LOCATION_CONTEXT__CURRENT_LOCATION);

		organisationContextEClass = createEClass(ORGANISATION_CONTEXT);
		createEReference(organisationContextEClass, ORGANISATION_CONTEXT__ORGANISATION);

		shiftContextEClass = createEClass(SHIFT_CONTEXT);
		createEReference(shiftContextEClass, SHIFT_CONTEXT__SHIFT);

		roleContextEClass = createEClass(ROLE_CONTEXT);
		createEReference(roleContextEClass, ROLE_CONTEXT__ROLE);

		internalStateContextEClass = createEClass(INTERNAL_STATE_CONTEXT);
		createEReference(internalStateContextEClass, INTERNAL_STATE_CONTEXT__STATE);
		createEReference(internalStateContextEClass, INTERNAL_STATE_CONTEXT__SUBJECT);

		contextCharacteristicEClass = createEClass(CONTEXT_CHARACTERISTIC);
		createEReference(contextCharacteristicEClass, CONTEXT_CHARACTERISTIC__CONTEXT);

		contextCharacteristicTypeEClass = createEClass(CONTEXT_CHARACTERISTIC_TYPE);
		createEReference(contextCharacteristicTypeEClass, CONTEXT_CHARACTERISTIC_TYPE__CONTEXT);

		privacyLevelContextEClass = createEClass(PRIVACY_LEVEL_CONTEXT);
		createEReference(privacyLevelContextEClass, PRIVACY_LEVEL_CONTEXT__LEVEL);

		comparisonContextEClass = createEClass(COMPARISON_CONTEXT);
		createEAttribute(comparisonContextEClass, COMPARISON_CONTEXT__COMPARISON);
		createEAttribute(comparisonContextEClass, COMPARISON_CONTEXT__THRESHOLD);
		createEAttribute(comparisonContextEClass, COMPARISON_CONTEXT__IS_FLOATING);

		prerequisiteContextEClass = createEClass(PREREQUISITE_CONTEXT);
		createEReference(prerequisiteContextEClass, PREREQUISITE_CONTEXT__PREREQUISITE);

		extensionContextEClass = createEClass(EXTENSION_CONTEXT);
		createEAttribute(extensionContextEClass, EXTENSION_CONTEXT__EXTENSION_CODE);

		// Create enums
		comparisonEEnum = createEEnum(COMPARISON);

		// Create data types
		numberEDataType = createEDataType(NUMBER);
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
		HelperattributesPackage theHelperattributesPackage = (HelperattributesPackage) EPackage.Registry.INSTANCE
				.getEPackage(HelperattributesPackage.eNS_URI);
		SubjectPackage theSubjectPackage = (SubjectPackage) EPackage.Registry.INSTANCE
				.getEPackage(SubjectPackage.eNS_URI);
		CharacteristicsPackage theCharacteristicsPackage = (CharacteristicsPackage) EPackage.Registry.INSTANCE
				.getEPackage(CharacteristicsPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		contextEClass.getESuperTypes().add(theEntityPackage.getEntity());
		environmentalContextEClass.getESuperTypes().add(this.getContext());
		userDeclaredContextEClass.getESuperTypes().add(this.getContext());
		locationContextEClass.getESuperTypes().add(this.getEnvironmentalContext());
		organisationContextEClass.getESuperTypes().add(this.getEnvironmentalContext());
		shiftContextEClass.getESuperTypes().add(this.getUserDeclaredContext());
		roleContextEClass.getESuperTypes().add(this.getUserDeclaredContext());
		internalStateContextEClass.getESuperTypes().add(this.getUserDeclaredContext());
		contextCharacteristicEClass.getESuperTypes().add(theCharacteristicsPackage.getCharacteristic());
		contextCharacteristicTypeEClass.getESuperTypes().add(theCharacteristicsPackage.getCharacteristicType());
		privacyLevelContextEClass.getESuperTypes().add(this.getUserDeclaredContext());
		comparisonContextEClass.getESuperTypes().add(this.getEnvironmentalContext());
		prerequisiteContextEClass.getESuperTypes().add(this.getUserDeclaredContext());
		extensionContextEClass.getESuperTypes().add(this.getUserDeclaredContext());

		// Initialize classes and features; add operations and parameters
		initEClass(contextEClass, Context.class, "Context", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(environmentalContextEClass, EnvironmentalContext.class, "EnvironmentalContext", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userDeclaredContextEClass, UserDeclaredContext.class, "UserDeclaredContext", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locationContextEClass, LocationContext.class, "LocationContext", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocationContext_CurrentLocation(), theHelperattributesPackage.getLocation(), null,
				"currentLocation", null, 1, 1, LocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organisationContextEClass, OrganisationContext.class, "OrganisationContext", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganisationContext_Organisation(), theSubjectPackage.getOrganisation(), null, "organisation",
				null, 1, 1, OrganisationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shiftContextEClass, ShiftContext.class, "ShiftContext", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShiftContext_Shift(), theHelperattributesPackage.getShift(), null, "shift", null, 1, 1,
				ShiftContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleContextEClass, RoleContext.class, "RoleContext", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleContext_Role(), theHelperattributesPackage.getRole(), null, "role", null, 1, 1,
				RoleContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalStateContextEClass, InternalStateContext.class, "InternalStateContext", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalStateContext_State(), theCharacteristicsPackage.getEnumCharacteristicLiteral(), null,
				"state", null, 0, 1, InternalStateContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalStateContext_Subject(), theSubjectPackage.getStatefulSubjects(), null, "subject",
				null, 1, 1, InternalStateContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextCharacteristicEClass, ContextCharacteristic.class, "ContextCharacteristic", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextCharacteristic_Context(), this.getContext(), null, "context", null, 0, -1,
				ContextCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextCharacteristicTypeEClass, ContextCharacteristicType.class, "ContextCharacteristicType",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextCharacteristicType_Context(), this.getContext(), null, "context", null, 0, -1,
				ContextCharacteristicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(privacyLevelContextEClass, PrivacyLevelContext.class, "PrivacyLevelContext", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrivacyLevelContext_Level(), theCharacteristicsPackage.getEnumCharacteristicLiteral(), null,
				"level", null, 0, 1, PrivacyLevelContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparisonContextEClass, ComparisonContext.class, "ComparisonContext", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComparisonContext_Comparison(), this.getComparison(), "comparison", null, 0, 1,
				ComparisonContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComparisonContext_Threshold(), this.getNumber(), "threshold", null, 0, 1,
				ComparisonContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComparisonContext_IsFloating(), theEcorePackage.getEBoolean(), "isFloating", null, 0, 1,
				ComparisonContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(prerequisiteContextEClass, PrerequisiteContext.class, "PrerequisiteContext", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrerequisiteContext_Prerequisite(), theHelperattributesPackage.getPrerequisite(), null,
				"prerequisite", null, 1, 1, PrerequisiteContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionContextEClass, ExtensionContext.class, "ExtensionContext", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtensionContext_ExtensionCode(), theXMLTypePackage.getString(), "extensionCode", null, 0, 1,
				ExtensionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(comparisonEEnum, Comparison.class, "Comparison");
		addEEnumLiteral(comparisonEEnum, Comparison.GREATER);
		addEEnumLiteral(comparisonEEnum, Comparison.SMALLER);

		// Initialize data types
		initEDataType(numberEDataType, Number.class, "Number", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //ContextPackageImpl
