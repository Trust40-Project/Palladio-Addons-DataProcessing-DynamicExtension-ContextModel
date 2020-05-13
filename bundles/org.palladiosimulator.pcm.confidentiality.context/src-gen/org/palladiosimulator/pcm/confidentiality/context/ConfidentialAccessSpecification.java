/**
 */
package org.palladiosimulator.pcm.confidentiality.context;

import org.eclipse.emf.cdo.CDOObject;

import org.palladiosimulator.pcm.confidentiality.context.model.Context;

import org.palladiosimulator.pcm.confidentiality.context.policy.PolicyContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Confidential Access Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getPolicyContainer <em>Policy Container</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getContextcontainer <em>Contextcontainer</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.ContextPackage#getConfidentialAccessSpecification()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ConfidentialAccessSpecification extends CDOObject {
    /**
     * Returns the value of the '<em><b>Policy Container</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Policy Container</em>' containment reference.
     * @see #setPolicyContainer(PolicyContainer)
     * @see org.palladiosimulator.pcm.confidentiality.context.ContextPackage#getConfidentialAccessSpecification_PolicyContainer()
     * @model containment="true" required="true"
     * @generated
     */
    PolicyContainer getPolicyContainer();

    /**
     * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getPolicyContainer <em>Policy Container</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Policy Container</em>' containment reference.
     * @see #getPolicyContainer()
     * @generated
     */
    void setPolicyContainer(PolicyContainer value);

    /**
     * Returns the value of the '<em><b>Contextcontainer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contextcontainer</em>' containment reference.
     * @see #setContextcontainer(Context)
     * @see org.palladiosimulator.pcm.confidentiality.context.ContextPackage#getConfidentialAccessSpecification_Contextcontainer()
     * @model containment="true" required="true"
     * @generated
     */
    Context getContextcontainer();

    /**
     * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getContextcontainer <em>Contextcontainer</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Contextcontainer</em>' containment reference.
     * @see #getContextcontainer()
     * @generated
     */
    void setContextcontainer(Context value);

} // ConfidentialAccessSpecification
