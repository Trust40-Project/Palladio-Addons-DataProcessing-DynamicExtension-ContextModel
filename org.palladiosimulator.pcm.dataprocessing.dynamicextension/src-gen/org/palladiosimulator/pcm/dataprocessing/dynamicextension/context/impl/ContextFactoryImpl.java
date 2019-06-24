/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContextFactoryImpl extends EFactoryImpl implements ContextFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContextFactory init() {
		try {
			ContextFactory theContextFactory = (ContextFactory) EPackage.Registry.INSTANCE
					.getEFactory(ContextPackage.eNS_URI);
			if (theContextFactory != null) {
				return theContextFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContextFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ContextPackage.LOCATION_CONTEXT:
			return (EObject) createLocationContext();
		case ContextPackage.ORGANISATION_CONTEXT:
			return (EObject) createOrganisationContext();
		case ContextPackage.SHIFT_CONTEXT:
			return (EObject) createShiftContext();
		case ContextPackage.ROLE_CONTEXT:
			return (EObject) createRoleContext();
		case ContextPackage.INTERNAL_STATE_CONTEXT:
			return (EObject) createInternalStateContext();
		case ContextPackage.CONTEXT_CHARACTERISTIC:
			return (EObject) createContextCharacteristic();
		case ContextPackage.CONTEXT_CHARACTERISTIC_TYPE:
			return (EObject) createContextCharacteristicType();
		case ContextPackage.INTEGER_THRESHOLD_CONTEXT:
			return (EObject) createIntegerThresholdContext();
		case ContextPackage.PRIVACY_LEVEL_CONTEXT:
			return (EObject) createPrivacyLevelContext();
		case ContextPackage.COMPARISON_CONTEXT:
			return (EObject) createComparisonContext();
		case ContextPackage.PREREQUISITE_CONTEXT:
			return (EObject) createPrerequisiteContext();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ContextPackage.COMPARISON:
			return createComparisonFromString(eDataType, initialValue);
		case ContextPackage.NUMBER:
			return createNumberFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ContextPackage.COMPARISON:
			return convertComparisonToString(eDataType, instanceValue);
		case ContextPackage.NUMBER:
			return convertNumberToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocationContext createLocationContext() {
		LocationContextImpl locationContext = new LocationContextImpl();
		return locationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganisationContext createOrganisationContext() {
		OrganisationContextImpl organisationContext = new OrganisationContextImpl();
		return organisationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShiftContext createShiftContext() {
		ShiftContextImpl shiftContext = new ShiftContextImpl();
		return shiftContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleContext createRoleContext() {
		RoleContextImpl roleContext = new RoleContextImpl();
		return roleContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalStateContext createInternalStateContext() {
		InternalStateContextImpl internalStateContext = new InternalStateContextImpl();
		return internalStateContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextCharacteristic createContextCharacteristic() {
		ContextCharacteristicImpl contextCharacteristic = new ContextCharacteristicImpl();
		return contextCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextCharacteristicType createContextCharacteristicType() {
		ContextCharacteristicTypeImpl contextCharacteristicType = new ContextCharacteristicTypeImpl();
		return contextCharacteristicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerThresholdContext createIntegerThresholdContext() {
		IntegerThresholdContextImpl integerThresholdContext = new IntegerThresholdContextImpl();
		return integerThresholdContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivacyLevelContext createPrivacyLevelContext() {
		PrivacyLevelContextImpl privacyLevelContext = new PrivacyLevelContextImpl();
		return privacyLevelContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparisonContext createComparisonContext() {
		ComparisonContextImpl comparisonContext = new ComparisonContextImpl();
		return comparisonContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrerequisiteContext createPrerequisiteContext() {
		PrerequisiteContextImpl prerequisiteContext = new PrerequisiteContextImpl();
		return prerequisiteContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparison createComparisonFromString(EDataType eDataType, String initialValue) {
		Comparison result = Comparison.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number createNumberFromString(EDataType eDataType, String initialValue) {
		return (Number) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextPackage getContextPackage() {
		return (ContextPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContextPackage getPackage() {
		return ContextPackage.eINSTANCE;
	}

} //ContextFactoryImpl
