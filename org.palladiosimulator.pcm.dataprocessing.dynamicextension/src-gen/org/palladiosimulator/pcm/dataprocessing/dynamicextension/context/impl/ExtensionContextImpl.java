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
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ExtensionContextImpl#getExtensionCode <em>Extension Code</em>}</li>
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
	public String getExtensionCode() {
		return (String) eGet(ContextPackage.Literals.EXTENSION_CONTEXT__EXTENSION_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtensionCode(String newExtensionCode) {
		eSet(ContextPackage.Literals.EXTENSION_CONTEXT__EXTENSION_CODE, newExtensionCode);
	}

} //ExtensionContextImpl
