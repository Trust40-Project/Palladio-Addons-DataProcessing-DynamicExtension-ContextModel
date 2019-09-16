/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.LocationContext;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Location;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.LocationContextImpl#getCurrentLocation <em>Current Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationContextImpl extends EnvironmentalContextImpl implements LocationContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.LOCATION_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location getCurrentLocation() {
		return (Location) eGet(ContextPackage.Literals.LOCATION_CONTEXT__CURRENT_LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentLocation(Location newCurrentLocation) {
		eSet(ContextPackage.Literals.LOCATION_CONTEXT__CURRENT_LOCATION, newCurrentLocation);
	}

} //LocationContextImpl
