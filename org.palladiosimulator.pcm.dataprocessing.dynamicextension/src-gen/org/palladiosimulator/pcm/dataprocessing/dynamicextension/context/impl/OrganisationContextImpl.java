/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.OrganisationContext;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Organisation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organisation Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.OrganisationContextImpl#getOrganisation <em>Organisation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganisationContextImpl extends EnvironmentalContextImpl implements OrganisationContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganisationContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.ORGANISATION_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Organisation getOrganisation() {
		return (Organisation) eGet(ContextPackage.Literals.ORGANISATION_CONTEXT__ORGANISATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganisation(Organisation newOrganisation) {
		eSet(ContextPackage.Literals.ORGANISATION_CONTEXT__ORGANISATION, newOrganisation);
	}

} //OrganisationContextImpl
