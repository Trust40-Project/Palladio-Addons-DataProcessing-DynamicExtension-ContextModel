/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.IntegralComparisonContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integral Comparison Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.IntegralComparisonContextImpl#getThreshold <em>Threshold</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegralComparisonContextImpl extends ComparisonContextImpl implements IntegralComparisonContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegralComparisonContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.INTEGRAL_COMPARISON_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getThreshold() {
		return (Integer) eGet(ContextPackage.Literals.INTEGRAL_COMPARISON_CONTEXT__THRESHOLD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreshold(int newThreshold) {
		eSet(ContextPackage.Literals.INTEGRAL_COMPARISON_CONTEXT__THRESHOLD, newThreshold);
	}

} //IntegralComparisonContextImpl
