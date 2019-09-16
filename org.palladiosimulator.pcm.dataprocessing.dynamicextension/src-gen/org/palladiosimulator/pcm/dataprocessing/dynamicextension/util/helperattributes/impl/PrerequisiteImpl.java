/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperattributesPackage;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Prerequisite;

import org.palladiosimulator.pcm.repository.OperationSignature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prerequisite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.PrerequisiteImpl#getPrerequisite <em>Prerequisite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrerequisiteImpl extends EntityImpl implements Prerequisite {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrerequisiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HelperattributesPackage.Literals.PREREQUISITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationSignature getPrerequisite() {
		return (OperationSignature) eGet(HelperattributesPackage.Literals.PREREQUISITE__PREREQUISITE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrerequisite(OperationSignature newPrerequisite) {
		eSet(HelperattributesPackage.Literals.PREREQUISITE__PREREQUISITE, newPrerequisite);
	}

} //PrerequisiteImpl
