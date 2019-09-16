/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.context;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.Characteristic;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextCharacteristic#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage#getContextCharacteristic()
 * @model
 * @generated
 */
public interface ContextCharacteristic extends Characteristic {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.Context}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage#getContextCharacteristic_Context()
	 * @model
	 * @generated
	 */
	EList<Context> getContext();

} // ContextCharacteristic
