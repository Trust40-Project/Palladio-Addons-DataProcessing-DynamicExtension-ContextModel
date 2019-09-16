/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.RoleContext;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.RoleContextImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleContextImpl extends UserDeclaredContextImpl implements RoleContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.ROLE_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role getRole() {
		return (Role) eGet(ContextPackage.Literals.ROLE_CONTEXT__ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(Role newRole) {
		eSet(ContextPackage.Literals.ROLE_CONTEXT__ROLE, newRole);
	}

} //RoleContextImpl
