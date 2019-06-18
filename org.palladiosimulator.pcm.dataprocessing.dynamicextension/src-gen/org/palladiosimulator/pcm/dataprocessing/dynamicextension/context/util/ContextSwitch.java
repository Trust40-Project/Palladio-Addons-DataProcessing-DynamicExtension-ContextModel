/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.util;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.Characteristic;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicType;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage
 * @generated
 */
public class ContextSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContextPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextSwitch() {
		if (modelPackage == null) {
			modelPackage = ContextPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ContextPackage.CONTEXT: {
			Context context = (Context) theEObject;
			T result = caseContext(context);
			if (result == null)
				result = caseEntity(context);
			if (result == null)
				result = caseIdentifier(context);
			if (result == null)
				result = caseNamedElement(context);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextPackage.ENVIRONMENTAL_CONTEXT: {
			EnvironmentalContext environmentalContext = (EnvironmentalContext) theEObject;
			T result = caseEnvironmentalContext(environmentalContext);
			if (result == null)
				result = caseContext(environmentalContext);
			if (result == null)
				result = caseEntity(environmentalContext);
			if (result == null)
				result = caseIdentifier(environmentalContext);
			if (result == null)
				result = caseNamedElement(environmentalContext);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextPackage.USER_DECLARED_CONTEXT: {
			UserDeclaredContext userDeclaredContext = (UserDeclaredContext) theEObject;
			T result = caseUserDeclaredContext(userDeclaredContext);
			if (result == null)
				result = caseContext(userDeclaredContext);
			if (result == null)
				result = caseEntity(userDeclaredContext);
			if (result == null)
				result = caseIdentifier(userDeclaredContext);
			if (result == null)
				result = caseNamedElement(userDeclaredContext);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextPackage.LOCATION_CONTEXT: {
			LocationContext locationContext = (LocationContext) theEObject;
			T result = caseLocationContext(locationContext);
			if (result == null)
				result = caseEnvironmentalContext(locationContext);
			if (result == null)
				result = caseContext(locationContext);
			if (result == null)
				result = caseEntity(locationContext);
			if (result == null)
				result = caseIdentifier(locationContext);
			if (result == null)
				result = caseNamedElement(locationContext);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextPackage.ORGANISATION_CONTEXT: {
			OrganisationContext organisationContext = (OrganisationContext) theEObject;
			T result = caseOrganisationContext(organisationContext);
			if (result == null)
				result = caseEnvironmentalContext(organisationContext);
			if (result == null)
				result = caseContext(organisationContext);
			if (result == null)
				result = caseEntity(organisationContext);
			if (result == null)
				result = caseIdentifier(organisationContext);
			if (result == null)
				result = caseNamedElement(organisationContext);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextPackage.SHIFT_CONTEXT: {
			ShiftContext shiftContext = (ShiftContext) theEObject;
			T result = caseShiftContext(shiftContext);
			if (result == null)
				result = caseUserDeclaredContext(shiftContext);
			if (result == null)
				result = caseContext(shiftContext);
			if (result == null)
				result = caseEntity(shiftContext);
			if (result == null)
				result = caseIdentifier(shiftContext);
			if (result == null)
				result = caseNamedElement(shiftContext);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextPackage.ROLE_CONTEXT: {
			RoleContext roleContext = (RoleContext) theEObject;
			T result = caseRoleContext(roleContext);
			if (result == null)
				result = caseUserDeclaredContext(roleContext);
			if (result == null)
				result = caseContext(roleContext);
			if (result == null)
				result = caseEntity(roleContext);
			if (result == null)
				result = caseIdentifier(roleContext);
			if (result == null)
				result = caseNamedElement(roleContext);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextPackage.INTERNAL_STATE_CONTEXT: {
			InternalStateContext internalStateContext = (InternalStateContext) theEObject;
			T result = caseInternalStateContext(internalStateContext);
			if (result == null)
				result = caseUserDeclaredContext(internalStateContext);
			if (result == null)
				result = caseContext(internalStateContext);
			if (result == null)
				result = caseEntity(internalStateContext);
			if (result == null)
				result = caseIdentifier(internalStateContext);
			if (result == null)
				result = caseNamedElement(internalStateContext);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextPackage.CONTEXT_CHARACTERISTIC: {
			ContextCharacteristic contextCharacteristic = (ContextCharacteristic) theEObject;
			T result = caseContextCharacteristic(contextCharacteristic);
			if (result == null)
				result = caseCharacteristic(contextCharacteristic);
			if (result == null)
				result = caseIdentifier(contextCharacteristic);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextPackage.CONTEXT_CHARACTERISTIC_TYPE: {
			ContextCharacteristicType contextCharacteristicType = (ContextCharacteristicType) theEObject;
			T result = caseContextCharacteristicType(contextCharacteristicType);
			if (result == null)
				result = caseCharacteristicType(contextCharacteristicType);
			if (result == null)
				result = caseEntity(contextCharacteristicType);
			if (result == null)
				result = caseIdentifier(contextCharacteristicType);
			if (result == null)
				result = caseNamedElement(contextCharacteristicType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextPackage.INTEGER_THRESHOLD_CONTEXT: {
			IntegerThresholdContext integerThresholdContext = (IntegerThresholdContext) theEObject;
			T result = caseIntegerThresholdContext(integerThresholdContext);
			if (result == null)
				result = caseEnvironmentalContext(integerThresholdContext);
			if (result == null)
				result = caseContext(integerThresholdContext);
			if (result == null)
				result = caseEntity(integerThresholdContext);
			if (result == null)
				result = caseIdentifier(integerThresholdContext);
			if (result == null)
				result = caseNamedElement(integerThresholdContext);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextPackage.PRIVACY_LEVEL_CONTEXT: {
			PrivacyLevelContext privacyLevelContext = (PrivacyLevelContext) theEObject;
			T result = casePrivacyLevelContext(privacyLevelContext);
			if (result == null)
				result = caseUserDeclaredContext(privacyLevelContext);
			if (result == null)
				result = caseContext(privacyLevelContext);
			if (result == null)
				result = caseEntity(privacyLevelContext);
			if (result == null)
				result = caseIdentifier(privacyLevelContext);
			if (result == null)
				result = caseNamedElement(privacyLevelContext);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextPackage.SHIFT_CHECK_CONTEXT: {
			ShiftCheckContext shiftCheckContext = (ShiftCheckContext) theEObject;
			T result = caseShiftCheckContext(shiftCheckContext);
			if (result == null)
				result = caseUserDeclaredContext(shiftCheckContext);
			if (result == null)
				result = caseContext(shiftCheckContext);
			if (result == null)
				result = caseEntity(shiftCheckContext);
			if (result == null)
				result = caseIdentifier(shiftCheckContext);
			if (result == null)
				result = caseNamedElement(shiftCheckContext);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ContextPackage.COMPARISON_CONTEXT: {
			ComparisonContext comparisonContext = (ComparisonContext) theEObject;
			T result = caseComparisonContext(comparisonContext);
			if (result == null)
				result = caseEnvironmentalContext(comparisonContext);
			if (result == null)
				result = caseContext(comparisonContext);
			if (result == null)
				result = caseEntity(comparisonContext);
			if (result == null)
				result = caseIdentifier(comparisonContext);
			if (result == null)
				result = caseNamedElement(comparisonContext);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContext(Context object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environmental Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environmental Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentalContext(EnvironmentalContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Declared Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Declared Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDeclaredContext(UserDeclaredContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationContext(LocationContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organisation Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organisation Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganisationContext(OrganisationContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shift Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shift Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShiftContext(ShiftContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleContext(RoleContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal State Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal State Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalStateContext(InternalStateContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characteristic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextCharacteristic(ContextCharacteristic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characteristic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characteristic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextCharacteristicType(ContextCharacteristicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Threshold Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Threshold Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerThresholdContext(IntegerThresholdContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Privacy Level Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Privacy Level Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivacyLevelContext(PrivacyLevelContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shift Check Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shift Check Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShiftCheckContext(ShiftCheckContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparisonContext(ComparisonContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characteristic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacteristic(Characteristic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characteristic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characteristic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacteristicType(CharacteristicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ContextSwitch
