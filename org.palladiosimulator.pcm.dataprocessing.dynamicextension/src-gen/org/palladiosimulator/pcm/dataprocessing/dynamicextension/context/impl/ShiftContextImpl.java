/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ShiftContext;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Shift;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shift Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ShiftContextImpl#getShift <em>Shift</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShiftContextImpl extends UserDeclaredContextImpl implements ShiftContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShiftContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.SHIFT_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shift getShift() {
		return (Shift) eGet(ContextPackage.Literals.SHIFT_CONTEXT__SHIFT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShift(Shift newShift) {
		eSet(ContextPackage.Literals.SHIFT_CONTEXT__SHIFT, newShift);
	}

} //ShiftContextImpl
