/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.ComparisonNumber#getIntegralValue <em>Integral Value</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.ComparisonNumber#getFloatingValue <em>Floating Value</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.ComparisonNumber#isIsFloating <em>Is Floating</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperattributesPackage#getComparisonNumber()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ComparisonNumber extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Integral Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integral Value</em>' attribute.
	 * @see #setIntegralValue(long)
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperattributesPackage#getComparisonNumber_IntegralValue()
	 * @model
	 * @generated
	 */
	long getIntegralValue();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.ComparisonNumber#getIntegralValue <em>Integral Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integral Value</em>' attribute.
	 * @see #getIntegralValue()
	 * @generated
	 */
	void setIntegralValue(long value);

	/**
	 * Returns the value of the '<em><b>Floating Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floating Value</em>' attribute.
	 * @see #setFloatingValue(double)
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperattributesPackage#getComparisonNumber_FloatingValue()
	 * @model
	 * @generated
	 */
	double getFloatingValue();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.ComparisonNumber#getFloatingValue <em>Floating Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floating Value</em>' attribute.
	 * @see #getFloatingValue()
	 * @generated
	 */
	void setFloatingValue(double value);

	/**
	 * Returns the value of the '<em><b>Is Floating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Floating</em>' attribute.
	 * @see #setIsFloating(boolean)
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperattributesPackage#getComparisonNumber_IsFloating()
	 * @model
	 * @generated
	 */
	boolean isIsFloating();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.ComparisonNumber#isIsFloating <em>Is Floating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Floating</em>' attribute.
	 * @see #isIsFloating()
	 * @generated
	 */
	void setIsFloating(boolean value);

} // ComparisonNumber
