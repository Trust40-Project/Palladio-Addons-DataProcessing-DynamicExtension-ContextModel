/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.context;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Threshold Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.IntegerThresholdContext#getComparision <em>Comparision</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.IntegerThresholdContext#getThreshold <em>Threshold</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage#getIntegerThresholdContext()
 * @model
 * @generated
 */
public interface IntegerThresholdContext extends EnvironmentalContext {
	/**
	 * Returns the value of the '<em><b>Comparision</b></em>' attribute.
	 * The literals are from the enumeration {@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.Comparison}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparision</em>' attribute.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.Comparison
	 * @see #setComparision(Comparison)
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage#getIntegerThresholdContext_Comparision()
	 * @model
	 * @generated
	 */
	Comparison getComparision();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.IntegerThresholdContext#getComparision <em>Comparision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparision</em>' attribute.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.Comparison
	 * @see #getComparision()
	 * @generated
	 */
	void setComparision(Comparison value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(int)
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage#getIntegerThresholdContext_Threshold()
	 * @model
	 * @generated
	 */
	int getThreshold();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.IntegerThresholdContext#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(int value);

} // IntegerThresholdContext
