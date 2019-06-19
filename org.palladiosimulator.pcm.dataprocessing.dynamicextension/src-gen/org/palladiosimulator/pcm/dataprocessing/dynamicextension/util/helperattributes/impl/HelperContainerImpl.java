/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperContainer;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperattributesPackage;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.LocationContainer;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.PrerequisiteContainer;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.RoleContainer;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.ShiftContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Helper Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.HelperContainerImpl#getShiftcontainer <em>Shiftcontainer</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.HelperContainerImpl#getRolecontainer <em>Rolecontainer</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.HelperContainerImpl#getLocationcontainer <em>Locationcontainer</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.HelperContainerImpl#getPrerequisitecontainer <em>Prerequisitecontainer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HelperContainerImpl extends CDOObjectImpl implements HelperContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HelperContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HelperattributesPackage.Literals.HELPER_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ShiftContainer> getShiftcontainer() {
		return (EList<ShiftContainer>) eGet(HelperattributesPackage.Literals.HELPER_CONTAINER__SHIFTCONTAINER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<RoleContainer> getRolecontainer() {
		return (EList<RoleContainer>) eGet(HelperattributesPackage.Literals.HELPER_CONTAINER__ROLECONTAINER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<LocationContainer> getLocationcontainer() {
		return (EList<LocationContainer>) eGet(HelperattributesPackage.Literals.HELPER_CONTAINER__LOCATIONCONTAINER,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PrerequisiteContainer> getPrerequisitecontainer() {
		return (EList<PrerequisiteContainer>) eGet(
				HelperattributesPackage.Literals.HELPER_CONTAINER__PREREQUISITECONTAINER, true);
	}

} //HelperContainerImpl
