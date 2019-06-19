/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.PrerequisiteContext;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Prerequisite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prerequisite Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.PrerequisiteContextImpl#getPrerequisite <em>Prerequisite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrerequisiteContextImpl extends UserDeclaredContextImpl implements PrerequisiteContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrerequisiteContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.PREREQUISITE_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Prerequisite getPrerequisite() {
		return (Prerequisite) eGet(ContextPackage.Literals.PREREQUISITE_CONTEXT__PREREQUISITE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrerequisite(Prerequisite newPrerequisite) {
		eSet(ContextPackage.Literals.PREREQUISITE_CONTEXT__PREREQUISITE, newPrerequisite);
	}

} //PrerequisiteContextImpl
