/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hierachical Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.model.HierachicalContext#getParent <em>Parent</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.model.HierachicalContext#getIncludeDirection <em>Include Direction</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage#getHierachicalContext()
 * @model
 * @generated
 */
public interface HierachicalContext extends ContextAttribute {
    /**
     * Returns the value of the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent</em>' reference.
     * @see #setParent(HierachicalContext)
     * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage#getHierachicalContext_Parent()
     * @model
     * @generated
     */
    HierachicalContext getParent();

    /**
     * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.model.HierachicalContext#getParent <em>Parent</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent</em>' reference.
     * @see #getParent()
     * @generated
     */
    void setParent(HierachicalContext value);

    /**
     * Returns the value of the '<em><b>Include Direction</b></em>' attribute.
     * The literals are from the enumeration {@link org.palladiosimulator.pcm.confidentiality.context.model.Direction}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Include Direction</em>' attribute.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.Direction
     * @see #setIncludeDirection(Direction)
     * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage#getHierachicalContext_IncludeDirection()
     * @model
     * @generated
     */
    Direction getIncludeDirection();

    /**
     * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.model.HierachicalContext#getIncludeDirection <em>Include Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Include Direction</em>' attribute.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.Direction
     * @see #getIncludeDirection()
     * @generated
     */
    void setIncludeDirection(Direction value);

} // HierachicalContext
