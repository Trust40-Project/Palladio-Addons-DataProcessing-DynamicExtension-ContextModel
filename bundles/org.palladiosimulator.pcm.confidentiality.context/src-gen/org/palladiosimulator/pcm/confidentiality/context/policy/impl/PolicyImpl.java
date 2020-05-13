/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute;

import org.palladiosimulator.pcm.confidentiality.context.policy.Policy;
import org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyImpl#getContexts <em>Contexts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolicyImpl extends EntityImpl implements Policy {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PolicyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PolicyPackage.Literals.POLICY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<ContextAttribute> getContexts() {
        return (EList<ContextAttribute>) eGet(PolicyPackage.Literals.POLICY__CONTEXTS, true);
    }

} //PolicyImpl
