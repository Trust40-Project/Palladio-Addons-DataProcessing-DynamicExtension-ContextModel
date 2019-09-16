/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.context;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage
 * @generated
 */
public interface ContextFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContextFactory eINSTANCE = org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Location Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Context</em>'.
	 * @generated
	 */
	LocationContext createLocationContext();

	/**
	 * Returns a new object of class '<em>Organisation Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organisation Context</em>'.
	 * @generated
	 */
	OrganisationContext createOrganisationContext();

	/**
	 * Returns a new object of class '<em>Shift Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shift Context</em>'.
	 * @generated
	 */
	ShiftContext createShiftContext();

	/**
	 * Returns a new object of class '<em>Role Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Context</em>'.
	 * @generated
	 */
	RoleContext createRoleContext();

	/**
	 * Returns a new object of class '<em>Internal State Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal State Context</em>'.
	 * @generated
	 */
	InternalStateContext createInternalStateContext();

	/**
	 * Returns a new object of class '<em>Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Characteristic</em>'.
	 * @generated
	 */
	ContextCharacteristic createContextCharacteristic();

	/**
	 * Returns a new object of class '<em>Characteristic Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Characteristic Type</em>'.
	 * @generated
	 */
	ContextCharacteristicType createContextCharacteristicType();

	/**
	 * Returns a new object of class '<em>Privacy Level Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Privacy Level Context</em>'.
	 * @generated
	 */
	PrivacyLevelContext createPrivacyLevelContext();

	/**
	 * Returns a new object of class '<em>Prerequisite Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prerequisite Context</em>'.
	 * @generated
	 */
	PrerequisiteContext createPrerequisiteContext();

	/**
	 * Returns a new object of class '<em>Extension Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension Context</em>'.
	 * @generated
	 */
	ExtensionContext createExtensionContext();

	/**
	 * Returns a new object of class '<em>Integral Comparison Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integral Comparison Context</em>'.
	 * @generated
	 */
	IntegralComparisonContext createIntegralComparisonContext();

	/**
	 * Returns a new object of class '<em>Floating Comparison Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Floating Comparison Context</em>'.
	 * @generated
	 */
	FloatingComparisonContext createFloatingComparisonContext();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContextPackage getContextPackage();

} //ContextFactory
