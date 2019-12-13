/**
 */
package org.palladiosimulator.pcm.confidentiality.context.misusage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.context.misusage.MisusagePackage
 * @generated
 */
public interface MisusageFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    MisusageFactory eINSTANCE = org.palladiosimulator.pcm.confidentiality.context.misusage.impl.MisusageFactoryImpl
            .init();

    /**
     * Returns a new object of class '<em>Scenario</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Scenario</em>'.
     * @generated
     */
    MisusageScenario createMisusageScenario();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    MisusagePackage getMisusagePackage();

} //MisusageFactory
