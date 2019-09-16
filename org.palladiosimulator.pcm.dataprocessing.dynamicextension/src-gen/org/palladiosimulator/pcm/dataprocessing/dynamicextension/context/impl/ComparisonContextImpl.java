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
 * </ul>
 *
 * @generated
 */
public abstract class ComparisonContextImpl extends EnvironmentalContextImpl implements ComparisonContext {
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

} //ComparisonContextImpl
