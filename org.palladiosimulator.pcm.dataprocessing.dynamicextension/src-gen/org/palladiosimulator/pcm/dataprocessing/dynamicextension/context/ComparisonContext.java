/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.context;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ComparisonContext#getComparison <em>Comparison</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ComparisonContext#getThreshold <em>Threshold</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage#getComparisonContext()
 * @model
 * @generated
 */
public interface ComparisonContext extends EnvironmentalContext {
	/**
	 * Returns the value of the '<em><b>Comparison</b></em>' attribute.
	 * The literals are from the enumeration {@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.Comparison}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison</em>' attribute.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.Comparison
	 * @see #setComparison(Comparison)
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage#getComparisonContext_Comparison()
	 * @model
	 * @generated
	 */
	Comparison getComparison();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ComparisonContext#getComparison <em>Comparison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison</em>' attribute.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.Comparison
	 * @see #getComparison()
	 * @generated
	 */
	void setComparison(Comparison value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(Number)
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage#getComparisonContext_Threshold()
	 * @model dataType="org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.Number"
	 * @generated
	 */
	Number getThreshold();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ComparisonContext#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(Number value);

} // ComparisonContext
