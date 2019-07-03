/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.ComparisonValue;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperattributesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.ComparisonValueImpl#getIntegralValue <em>Integral Value</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.ComparisonValueImpl#getFloatingValue <em>Floating Value</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.ComparisonValueImpl#isIsFloating <em>Is Floating</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparisonValueImpl extends EntityImpl implements ComparisonValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HelperattributesPackage.Literals.COMPARISON_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getIntegralValue() {
		return (Long) eGet(HelperattributesPackage.Literals.COMPARISON_VALUE__INTEGRAL_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntegralValue(long newIntegralValue) {
		eSet(HelperattributesPackage.Literals.COMPARISON_VALUE__INTEGRAL_VALUE, newIntegralValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFloatingValue() {
		return (Double) eGet(HelperattributesPackage.Literals.COMPARISON_VALUE__FLOATING_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFloatingValue(double newFloatingValue) {
		eSet(HelperattributesPackage.Literals.COMPARISON_VALUE__FLOATING_VALUE, newFloatingValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsFloating() {
		return (Boolean) eGet(HelperattributesPackage.Literals.COMPARISON_VALUE__IS_FLOATING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsFloating(boolean newIsFloating) {
		eSet(HelperattributesPackage.Literals.COMPARISON_VALUE__IS_FLOATING, newIsFloating);
	}

} //ComparisonValueImpl
