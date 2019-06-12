/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.Comparison;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.IntegerThresholdContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Threshold Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.IntegerThresholdContextImpl#getComparision <em>Comparision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegerThresholdContextImpl extends EnvironmentalContextImpl implements IntegerThresholdContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerThresholdContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.INTEGER_THRESHOLD_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comparison getComparision() {
		return (Comparison) eGet(ContextPackage.Literals.INTEGER_THRESHOLD_CONTEXT__COMPARISION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComparision(Comparison newComparision) {
		eSet(ContextPackage.Literals.INTEGER_THRESHOLD_CONTEXT__COMPARISION, newComparision);
	}

} //IntegerThresholdContextImpl
