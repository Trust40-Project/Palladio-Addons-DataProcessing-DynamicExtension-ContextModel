/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperattributesPackage;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.IDPrerequisite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ID Prerequisite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.IDPrerequisiteImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IDPrerequisiteImpl extends PrerequisiteImpl implements IDPrerequisite {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IDPrerequisiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HelperattributesPackage.Literals.ID_PREREQUISITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String) eGet(HelperattributesPackage.Literals.ID_PREREQUISITE__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eSet(HelperattributesPackage.Literals.ID_PREREQUISITE__ID, newId);
	}

} //IDPrerequisiteImpl
