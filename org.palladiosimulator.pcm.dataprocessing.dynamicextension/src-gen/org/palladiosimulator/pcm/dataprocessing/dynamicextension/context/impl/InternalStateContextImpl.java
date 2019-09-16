/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicLiteral;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.InternalStateContext;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.StatefulSubjects;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal State Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.InternalStateContextImpl#getState <em>State</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.InternalStateContextImpl#getSubject <em>Subject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalStateContextImpl extends UserDeclaredContextImpl implements InternalStateContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalStateContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.INTERNAL_STATE_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumCharacteristicLiteral getState() {
		return (EnumCharacteristicLiteral) eGet(ContextPackage.Literals.INTERNAL_STATE_CONTEXT__STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(EnumCharacteristicLiteral newState) {
		eSet(ContextPackage.Literals.INTERNAL_STATE_CONTEXT__STATE, newState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatefulSubjects getSubject() {
		return (StatefulSubjects) eGet(ContextPackage.Literals.INTERNAL_STATE_CONTEXT__SUBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(StatefulSubjects newSubject) {
		eSet(ContextPackage.Literals.INTERNAL_STATE_CONTEXT__SUBJECT, newSubject);
	}

} //InternalStateContextImpl
