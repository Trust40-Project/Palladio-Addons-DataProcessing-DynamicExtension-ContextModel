/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ModelFactory eINSTANCE = org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Hierachical Context</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Hierachical Context</em>'.
     * @generated
     */
    HierachicalContext createHierachicalContext();

    /**
     * Returns a new object of class '<em>Single Attribute Context</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Single Attribute Context</em>'.
     * @generated
     */
    SingleAttributeContext createSingleAttributeContext();

    /**
     * Returns a new object of class '<em>Related Context Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Related Context Set</em>'.
     * @generated
     */
    RelatedContextSet createRelatedContextSet();

    /**
     * Returns a new object of class '<em>Context</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Context</em>'.
     * @generated
     */
    Context createContext();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ModelPackage getModelPackage();

} //ModelFactory
