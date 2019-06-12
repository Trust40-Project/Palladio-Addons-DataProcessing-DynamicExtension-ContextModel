/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperattributesPackage;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Shift;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.ShiftContainer;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Organisation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shift Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.ShiftContainerImpl#getOrganisation <em>Organisation</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.ShiftContainerImpl#getShift <em>Shift</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShiftContainerImpl extends EntityImpl implements ShiftContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShiftContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HelperattributesPackage.Literals.SHIFT_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Organisation getOrganisation() {
		return (Organisation) eGet(HelperattributesPackage.Literals.SHIFT_CONTAINER__ORGANISATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganisation(Organisation newOrganisation) {
		eSet(HelperattributesPackage.Literals.SHIFT_CONTAINER__ORGANISATION, newOrganisation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Shift> getShift() {
		return (EList<Shift>) eGet(HelperattributesPackage.Literals.SHIFT_CONTAINER__SHIFT, true);
	}

} //ShiftContainerImpl
