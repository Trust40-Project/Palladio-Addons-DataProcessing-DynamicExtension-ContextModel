/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.model.Context;
import org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute;
import org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.ContextImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextImpl extends EntityImpl implements Context {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContextImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.CONTEXT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<ContextAttribute> getContext() {
        return (EList<ContextAttribute>) eGet(ModelPackage.Literals.CONTEXT__CONTEXT, true);
    }

} //ContextImpl
