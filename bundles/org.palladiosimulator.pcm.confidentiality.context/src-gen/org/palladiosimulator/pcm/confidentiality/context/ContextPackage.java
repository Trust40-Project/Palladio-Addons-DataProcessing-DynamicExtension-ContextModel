/**
 */
package org.palladiosimulator.pcm.confidentiality.context;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.palladiosimulator.pcm.confidentiality.context.ContextFactory
 * @model kind="package"
 * @generated
 */
public interface ContextPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "context";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.palladiosimulator.org/pcm/confidentiality/0.1/";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "context";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ContextPackage eINSTANCE = org.palladiosimulator.pcm.confidentiality.context.impl.ContextPackageImpl.init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.impl.ConfidentialAccessSpecificationImpl <em>Confidential Access Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.context.impl.ConfidentialAccessSpecificationImpl
     * @see org.palladiosimulator.pcm.confidentiality.context.impl.ContextPackageImpl#getConfidentialAccessSpecification()
     * @generated
     */
    int CONFIDENTIAL_ACCESS_SPECIFICATION = 0;

    /**
     * The feature id for the '<em><b>Policy Container</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIAL_ACCESS_SPECIFICATION__POLICY_CONTAINER = 0;

    /**
     * The feature id for the '<em><b>Contextcontainer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIAL_ACCESS_SPECIFICATION__CONTEXTCONTAINER = 1;

    /**
     * The number of structural features of the '<em>Confidential Access Specification</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIDENTIAL_ACCESS_SPECIFICATION_FEATURE_COUNT = 2;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification <em>Confidential Access Specification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Confidential Access Specification</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification
     * @generated
     */
    EClass getConfidentialAccessSpecification();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getPolicyContainer <em>Policy Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Policy Container</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getPolicyContainer()
     * @see #getConfidentialAccessSpecification()
     * @generated
     */
    EReference getConfidentialAccessSpecification_PolicyContainer();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getContextcontainer <em>Contextcontainer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Contextcontainer</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification#getContextcontainer()
     * @see #getConfidentialAccessSpecification()
     * @generated
     */
    EReference getConfidentialAccessSpecification_Contextcontainer();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ContextFactory getContextFactory();

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
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.impl.ConfidentialAccessSpecificationImpl <em>Confidential Access Specification</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.context.impl.ConfidentialAccessSpecificationImpl
         * @see org.palladiosimulator.pcm.confidentiality.context.impl.ContextPackageImpl#getConfidentialAccessSpecification()
         * @generated
         */
        EClass CONFIDENTIAL_ACCESS_SPECIFICATION = eINSTANCE.getConfidentialAccessSpecification();

        /**
         * The meta object literal for the '<em><b>Policy Container</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONFIDENTIAL_ACCESS_SPECIFICATION__POLICY_CONTAINER = eINSTANCE
                .getConfidentialAccessSpecification_PolicyContainer();

        /**
         * The meta object literal for the '<em><b>Contextcontainer</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONFIDENTIAL_ACCESS_SPECIFICATION__CONTEXTCONTAINER = eINSTANCE
                .getConfidentialAccessSpecification_Contextcontainer();

    }

} //ContextPackage
