/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.Comparison;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ComparisonContext;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ComparisonContextImpl#getComparison <em>Comparison</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ComparisonContextImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ComparisonContextImpl#isIsFloating <em>Is Floating</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparisonContextImpl extends EnvironmentalContextImpl implements ComparisonContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.COMPARISON_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comparison getComparison() {
		return (Comparison) eGet(ContextPackage.Literals.COMPARISON_CONTEXT__COMPARISON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComparison(Comparison newComparison) {
		eSet(ContextPackage.Literals.COMPARISON_CONTEXT__COMPARISON, newComparison);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Number getThreshold() {
		return (Number) eGet(ContextPackage.Literals.COMPARISON_CONTEXT__THRESHOLD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreshold(Number newThreshold) {
		eSet(ContextPackage.Literals.COMPARISON_CONTEXT__THRESHOLD, newThreshold);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsFloating() {
		return (Boolean) eGet(ContextPackage.Literals.COMPARISON_CONTEXT__IS_FLOATING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsFloating(boolean newIsFloating) {
		eSet(ContextPackage.Literals.COMPARISON_CONTEXT__IS_FLOATING, newIsFloating);
	}

} //ComparisonContextImpl
