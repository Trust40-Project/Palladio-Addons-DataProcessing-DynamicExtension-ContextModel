/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.context;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextCharacteristicType#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage#getContextCharacteristicType()
 * @model
 * @generated
 */
public interface ContextCharacteristicType extends CharacteristicType {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.Context}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage#getContextCharacteristicType_Context()
	 * @model containment="true"
	 * @generated
	 */
	EList<Context> getContext();

} // ContextCharacteristicType
