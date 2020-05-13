/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "model";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.palladiosimulator.org/pcm/confidentiality/context/model/0.1/";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "model";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ModelPackage eINSTANCE = org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl.init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.ContextAttributeImpl <em>Context Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ContextAttributeImpl
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getContextAttribute()
     * @generated
     */
    int CONTEXT_ATTRIBUTE = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_ATTRIBUTE__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_ATTRIBUTE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The number of structural features of the '<em>Context Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.HierachicalContextImpl <em>Hierachical Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.HierachicalContextImpl
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getHierachicalContext()
     * @generated
     */
    int HIERACHICAL_CONTEXT = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIERACHICAL_CONTEXT__ID = CONTEXT_ATTRIBUTE__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIERACHICAL_CONTEXT__ENTITY_NAME = CONTEXT_ATTRIBUTE__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIERACHICAL_CONTEXT__PARENT = CONTEXT_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Include Direction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIERACHICAL_CONTEXT__INCLUDE_DIRECTION = CONTEXT_ATTRIBUTE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Hierachical Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIERACHICAL_CONTEXT_FEATURE_COUNT = CONTEXT_ATTRIBUTE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.SingleAttributeContextImpl <em>Single Attribute Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.SingleAttributeContextImpl
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getSingleAttributeContext()
     * @generated
     */
    int SINGLE_ATTRIBUTE_CONTEXT = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_ATTRIBUTE_CONTEXT__ID = CONTEXT_ATTRIBUTE__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_ATTRIBUTE_CONTEXT__ENTITY_NAME = CONTEXT_ATTRIBUTE__ENTITY_NAME;

    /**
     * The number of structural features of the '<em>Single Attribute Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_ATTRIBUTE_CONTEXT_FEATURE_COUNT = CONTEXT_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.RelatedContextSetImpl <em>Related Context Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.RelatedContextSetImpl
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getRelatedContextSet()
     * @generated
     */
    int RELATED_CONTEXT_SET = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_CONTEXT_SET__ID = CONTEXT_ATTRIBUTE__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_CONTEXT_SET__ENTITY_NAME = CONTEXT_ATTRIBUTE__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Context</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_CONTEXT_SET__CONTEXT = CONTEXT_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Related Context Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_CONTEXT_SET_FEATURE_COUNT = CONTEXT_ATTRIBUTE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.ContextImpl <em>Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ContextImpl
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getContext()
     * @generated
     */
    int CONTEXT = 4;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Context</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT__CONTEXT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.Direction <em>Direction</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.context.model.Direction
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getDirection()
     * @generated
     */
    int DIRECTION = 5;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.model.HierachicalContext <em>Hierachical Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hierachical Context</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.HierachicalContext
     * @generated
     */
    EClass getHierachicalContext();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.context.model.HierachicalContext#getParent <em>Parent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Parent</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.HierachicalContext#getParent()
     * @see #getHierachicalContext()
     * @generated
     */
    EReference getHierachicalContext_Parent();

    /**
     * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.confidentiality.context.model.HierachicalContext#getIncludeDirection <em>Include Direction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Include Direction</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.HierachicalContext#getIncludeDirection()
     * @see #getHierachicalContext()
     * @generated
     */
    EAttribute getHierachicalContext_IncludeDirection();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.model.SingleAttributeContext <em>Single Attribute Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Single Attribute Context</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.SingleAttributeContext
     * @generated
     */
    EClass getSingleAttributeContext();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.model.RelatedContextSet <em>Related Context Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Related Context Set</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.RelatedContextSet
     * @generated
     */
    EClass getRelatedContextSet();

    /**
     * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.confidentiality.context.model.RelatedContextSet#getContext <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Context</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.RelatedContextSet#getContext()
     * @see #getRelatedContextSet()
     * @generated
     */
    EReference getRelatedContextSet_Context();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute <em>Context Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Attribute</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute
     * @generated
     */
    EClass getContextAttribute();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.model.Context <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.Context
     * @generated
     */
    EClass getContext();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.confidentiality.context.model.Context#getContext <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Context</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.Context#getContext()
     * @see #getContext()
     * @generated
     */
    EReference getContext_Context();

    /**
     * Returns the meta object for enum '{@link org.palladiosimulator.pcm.confidentiality.context.model.Direction <em>Direction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Direction</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.Direction
     * @generated
     */
    EEnum getDirection();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ModelFactory getModelFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.HierachicalContextImpl <em>Hierachical Context</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.HierachicalContextImpl
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getHierachicalContext()
         * @generated
         */
        EClass HIERACHICAL_CONTEXT = eINSTANCE.getHierachicalContext();

        /**
         * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference HIERACHICAL_CONTEXT__PARENT = eINSTANCE.getHierachicalContext_Parent();

        /**
         * The meta object literal for the '<em><b>Include Direction</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HIERACHICAL_CONTEXT__INCLUDE_DIRECTION = eINSTANCE.getHierachicalContext_IncludeDirection();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.SingleAttributeContextImpl <em>Single Attribute Context</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.SingleAttributeContextImpl
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getSingleAttributeContext()
         * @generated
         */
        EClass SINGLE_ATTRIBUTE_CONTEXT = eINSTANCE.getSingleAttributeContext();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.RelatedContextSetImpl <em>Related Context Set</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.RelatedContextSetImpl
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getRelatedContextSet()
         * @generated
         */
        EClass RELATED_CONTEXT_SET = eINSTANCE.getRelatedContextSet();

        /**
         * The meta object literal for the '<em><b>Context</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RELATED_CONTEXT_SET__CONTEXT = eINSTANCE.getRelatedContextSet_Context();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.ContextAttributeImpl <em>Context Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ContextAttributeImpl
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getContextAttribute()
         * @generated
         */
        EClass CONTEXT_ATTRIBUTE = eINSTANCE.getContextAttribute();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.ContextImpl <em>Context</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ContextImpl
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getContext()
         * @generated
         */
        EClass CONTEXT = eINSTANCE.getContext();

        /**
         * The meta object literal for the '<em><b>Context</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT__CONTEXT = eINSTANCE.getContext_Context();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.Direction <em>Direction</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.context.model.Direction
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getDirection()
         * @generated
         */
        EEnum DIRECTION = eINSTANCE.getDirection();

    }

} //ModelPackage
