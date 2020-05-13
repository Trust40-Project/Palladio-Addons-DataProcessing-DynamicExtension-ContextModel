/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.model.Direction;
import org.palladiosimulator.pcm.confidentiality.context.model.HierachicalContext;
import org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hierachical Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.HierachicalContextImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.HierachicalContextImpl#getIncludeDirection <em>Include Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HierachicalContextImpl extends ContextAttributeImpl implements HierachicalContext {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HierachicalContextImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.HIERACHICAL_CONTEXT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HierachicalContext getParent() {
        return (HierachicalContext) eGet(ModelPackage.Literals.HIERACHICAL_CONTEXT__PARENT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParent(HierachicalContext newParent) {
        eSet(ModelPackage.Literals.HIERACHICAL_CONTEXT__PARENT, newParent);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Direction getIncludeDirection() {
        return (Direction) eGet(ModelPackage.Literals.HIERACHICAL_CONTEXT__INCLUDE_DIRECTION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIncludeDirection(Direction newIncludeDirection) {
        eSet(ModelPackage.Literals.HIERACHICAL_CONTEXT__INCLUDE_DIRECTION, newIncludeDirection);
    }

} //HierachicalContextImpl
