/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Helper Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperContainer#getShiftcontainer <em>Shiftcontainer</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperContainer#getRolecontainer <em>Rolecontainer</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperContainer#getLocationcontainer <em>Locationcontainer</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperattributesPackage#getHelperContainer()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface HelperContainer extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Shiftcontainer</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.ShiftContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shiftcontainer</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperattributesPackage#getHelperContainer_Shiftcontainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<ShiftContainer> getShiftcontainer();

	/**
	 * Returns the value of the '<em><b>Rolecontainer</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.RoleContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rolecontainer</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperattributesPackage#getHelperContainer_Rolecontainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleContainer> getRolecontainer();

	/**
	 * Returns the value of the '<em><b>Locationcontainer</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.LocationContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locationcontainer</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperattributesPackage#getHelperContainer_Locationcontainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<LocationContainer> getLocationcontainer();

} // HelperContainer
