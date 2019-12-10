package org.palladiosimulator.pcm.confidentiality.context;

import org.eclipse.emf.cdo.CDOObject;

import org.palladiosimulator.pcm.confidentiality.context.model.Context;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Confidential Access Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getContextContainer <em>Context Container</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.ContextPackage#getConfidentialAccessSpecification()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ConfidentialAccessSpecification extends CDOObject {
    /**
     * Returns the value of the '<em><b>Context Container</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Container</em>' containment reference.
     * @see #setContextContainer(Context)
     * @see org.palladiosimulator.pcm.confidentiality.context.ContextPackage#getConfidentialAccessSpecification_ContextContainer()
     * @model containment="true"
     * @generated
     */
    Context getContextContainer();

    /**
     * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getContextContainer <em>Context Container</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Container</em>' containment reference.
     * @see #getContextContainer()
     * @generated
     */
    void setContextContainer(Context value);

} // ConfidentialAccessSpecification
