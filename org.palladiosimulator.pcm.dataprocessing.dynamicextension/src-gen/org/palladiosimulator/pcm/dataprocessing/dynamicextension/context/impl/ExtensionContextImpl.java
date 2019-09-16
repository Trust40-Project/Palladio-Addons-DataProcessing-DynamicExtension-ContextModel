/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ExtensionContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ExtensionContextImpl#getCustomAccessPolicy <em>Custom Access Policy</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ExtensionContextImpl#isAddAtEnd <em>Add At End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionContextImpl extends UserDeclaredContextImpl implements ExtensionContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.EXTENSION_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomAccessPolicy() {
		return (String) eGet(ContextPackage.Literals.EXTENSION_CONTEXT__CUSTOM_ACCESS_POLICY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomAccessPolicy(String newCustomAccessPolicy) {
		eSet(ContextPackage.Literals.EXTENSION_CONTEXT__CUSTOM_ACCESS_POLICY, newCustomAccessPolicy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAddAtEnd() {
		return (Boolean) eGet(ContextPackage.Literals.EXTENSION_CONTEXT__ADD_AT_END, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddAtEnd(boolean newAddAtEnd) {
		eSet(ContextPackage.Literals.EXTENSION_CONTEXT__ADD_AT_END, newAddAtEnd);
	}

} //ExtensionContextImpl
