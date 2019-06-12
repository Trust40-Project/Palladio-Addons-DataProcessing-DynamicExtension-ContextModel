/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.DynamicextensionPackage
 * @generated
 */
public interface DynamicextensionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DynamicextensionFactory eINSTANCE = org.palladiosimulator.pcm.dataprocessing.dynamicextension.impl.DynamicextensionFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Dynamic Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic Specification</em>'.
	 * @generated
	 */
	DynamicSpecification createDynamicSpecification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DynamicextensionPackage getDynamicextensionPackage();

} //DynamicextensionFactory
