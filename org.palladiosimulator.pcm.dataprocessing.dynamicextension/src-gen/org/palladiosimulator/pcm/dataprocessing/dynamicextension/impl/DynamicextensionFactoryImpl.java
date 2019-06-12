/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DynamicextensionFactoryImpl extends EFactoryImpl implements DynamicextensionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DynamicextensionFactory init() {
		try {
			DynamicextensionFactory theDynamicextensionFactory = (DynamicextensionFactory) EPackage.Registry.INSTANCE
					.getEFactory(DynamicextensionPackage.eNS_URI);
			if (theDynamicextensionFactory != null) {
				return theDynamicextensionFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DynamicextensionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicextensionFactoryImpl() {
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
		case DynamicextensionPackage.DYNAMIC_SPECIFICATION:
			return (EObject) createDynamicSpecification();
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
	public DynamicSpecification createDynamicSpecification() {
		DynamicSpecificationImpl dynamicSpecification = new DynamicSpecificationImpl();
		return dynamicSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicextensionPackage getDynamicextensionPackage() {
		return (DynamicextensionPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DynamicextensionPackage getPackage() {
		return DynamicextensionPackage.eINSTANCE;
	}

} //DynamicextensionFactoryImpl
