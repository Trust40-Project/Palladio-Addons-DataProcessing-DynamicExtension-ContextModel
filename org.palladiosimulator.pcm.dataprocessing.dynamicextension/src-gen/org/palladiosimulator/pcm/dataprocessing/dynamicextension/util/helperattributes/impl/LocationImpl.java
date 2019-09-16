/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperattributesPackage;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Location;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.LocationImpl#getIncludes <em>Includes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends EntityImpl implements Location {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HelperattributesPackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Location> getIncludes() {
		return (EList<Location>) eGet(HelperattributesPackage.Literals.LOCATION__INCLUDES, true);
	}

} //LocationImpl
