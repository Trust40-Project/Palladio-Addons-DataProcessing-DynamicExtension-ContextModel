/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.context;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Organisation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organisation Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.OrganisationContext#getOrganisation <em>Organisation</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage#getOrganisationContext()
 * @model
 * @generated
 */
public interface OrganisationContext extends EnvironmentalContext {
	/**
	 * Returns the value of the '<em><b>Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisation</em>' reference.
	 * @see #setOrganisation(Organisation)
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage#getOrganisationContext_Organisation()
	 * @model required="true"
	 * @generated
	 */
	Organisation getOrganisation();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.OrganisationContext#getOrganisation <em>Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organisation</em>' reference.
	 * @see #getOrganisation()
	 * @generated
	 */
	void setOrganisation(Organisation value);

} // OrganisationContext
