/**
 */
package org.palladiosimulator.pcm.confidentiality.context.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification;
import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;

import org.palladiosimulator.pcm.confidentiality.context.model.Context;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Confidential Access Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.impl.ConfidentialAccessSpecificationImpl#getContextContainer <em>Context Container</em>}</li>
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
    public Context getContextContainer() {
        return (Context) eGet(ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__CONTEXT_CONTAINER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContextContainer(Context newContextContainer) {
        eSet(ContextPackage.Literals.CONFIDENTIAL_ACCESS_SPECIFICATION__CONTEXT_CONTAINER, newContextContainer);
    }

} //ConfidentialAccessSpecificationImpl
