/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prerequisite Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.PrerequisiteContainer#getPrerequisite <em>Prerequisite</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperattributesPackage#getPrerequisiteContainer()
 * @model
 * @generated
 */
public interface PrerequisiteContainer extends Entity {
	/**
	 * Returns the value of the '<em><b>Prerequisite</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Prerequisite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prerequisite</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperattributesPackage#getPrerequisiteContainer_Prerequisite()
	 * @model containment="true"
	 * @generated
	 */
	EList<Prerequisite> getPrerequisite();

} // PrerequisiteContainer
