/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicLiteral;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.PrivacyLevelContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Privacy Level Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.PrivacyLevelContextImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrivacyLevelContextImpl extends UserDeclaredContextImpl implements PrivacyLevelContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivacyLevelContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.PRIVACY_LEVEL_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumCharacteristicLiteral getLevel() {
		return (EnumCharacteristicLiteral) eGet(ContextPackage.Literals.PRIVACY_LEVEL_CONTEXT__LEVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(EnumCharacteristicLiteral newLevel) {
		eSet(ContextPackage.Literals.PRIVACY_LEVEL_CONTEXT__LEVEL, newLevel);
	}

} //PrivacyLevelContextImpl
