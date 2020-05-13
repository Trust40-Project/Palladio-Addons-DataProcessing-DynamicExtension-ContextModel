/**
 */
package org.palladiosimulator.pcm.confidentiality.context.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification;
import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;

import org.palladiosimulator.pcm.confidentiality.context.model.Context;

import org.palladiosimulator.pcm.confidentiality.context.policy.PolicyContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Confidential Access Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.impl.ConfidentialAccessSpecificationImpl#getPolicyContainer <em>Policy Container</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.impl.ConfidentialAccessSpecificationImpl#getContextcontainer <em>Contextcontainer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfidentialAccessSpecificationImpl extends CDOObjectImpl implements ConfidentialAccessSpecification {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConfidentialAccessSpecificationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PolicyContainer getPolicyContainer() {
        return (PolicyContainer) eGet(ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__POLICY_CONTAINER,
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPolicyContainer(PolicyContainer newPolicyContainer) {
        eSet(ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__POLICY_CONTAINER, newPolicyContainer);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Context getContextcontainer() {
        return (Context) eGet(ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__CONTEXTCONTAINER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContextcontainer(Context newContextcontainer) {
        eSet(ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__CONTEXTCONTAINER, newContextcontainer);
    }

} //ConfidentialAccessSpecificationImpl
