/**
 */
package org.palladiosimulator.pcm.confidentiality.context.misusage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.confidentiality.context.misusage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MisusageFactoryImpl extends EFactoryImpl implements MisusageFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MisusageFactory init() {
        try {
            MisusageFactory theMisusageFactory = (MisusageFactory) EPackage.Registry.INSTANCE
                    .getEFactory(MisusagePackage.eNS_URI);
            if (theMisusageFactory != null) {
                return theMisusageFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new MisusageFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MisusageFactoryImpl() {
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
        case MisusagePackage.MISUSAGE_SCENARIO:
            return (EObject) createMisusageScenario();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MisusageScenario createMisusageScenario() {
        MisusageScenarioImpl misusageScenario = new MisusageScenarioImpl();
        return misusageScenario;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MisusagePackage getMisusagePackage() {
        return (MisusagePackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static MisusagePackage getPackage() {
        return MisusagePackage.eINSTANCE;
    }

} //MisusageFactoryImpl
