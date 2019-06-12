/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HelperattributesFactoryImpl extends EFactoryImpl implements HelperattributesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HelperattributesFactory init() {
		try {
			HelperattributesFactory theHelperattributesFactory = (HelperattributesFactory) EPackage.Registry.INSTANCE
					.getEFactory(HelperattributesPackage.eNS_URI);
			if (theHelperattributesFactory != null) {
				return theHelperattributesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HelperattributesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelperattributesFactoryImpl() {
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
		case HelperattributesPackage.HELPER_CONTAINER:
			return (EObject) createHelperContainer();
		case HelperattributesPackage.LOCATION_CONTAINER:
			return (EObject) createLocationContainer();
		case HelperattributesPackage.SHIFT_CONTAINER:
			return (EObject) createShiftContainer();
		case HelperattributesPackage.ROLE_CONTAINER:
			return (EObject) createRoleContainer();
		case HelperattributesPackage.LOCATION:
			return (EObject) createLocation();
		case HelperattributesPackage.SHIFT:
			return (EObject) createShift();
		case HelperattributesPackage.ROLE:
			return (EObject) createRole();
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
	public HelperContainer createHelperContainer() {
		HelperContainerImpl helperContainer = new HelperContainerImpl();
		return helperContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocationContainer createLocationContainer() {
		LocationContainerImpl locationContainer = new LocationContainerImpl();
		return locationContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShiftContainer createShiftContainer() {
		ShiftContainerImpl shiftContainer = new ShiftContainerImpl();
		return shiftContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleContainer createRoleContainer() {
		RoleContainerImpl roleContainer = new RoleContainerImpl();
		return roleContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shift createShift() {
		ShiftImpl shift = new ShiftImpl();
		return shift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HelperattributesPackage getHelperattributesPackage() {
		return (HelperattributesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HelperattributesPackage getPackage() {
		return HelperattributesPackage.eINSTANCE;
	}

} //HelperattributesFactoryImpl
