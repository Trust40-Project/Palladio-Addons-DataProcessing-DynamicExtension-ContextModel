/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.context;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Location;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.LocationContext#getCurrentLocation <em>Current Location</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage#getLocationContext()
 * @model
 * @generated
 */
public interface LocationContext extends EnvironmentalContext {
	/**
	 * Returns the value of the '<em><b>Current Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Location</em>' reference.
	 * @see #setCurrentLocation(Location)
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextPackage#getLocationContext_CurrentLocation()
	 * @model required="true"
	 * @generated
	 */
	Location getCurrentLocation();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.LocationContext#getCurrentLocation <em>Current Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Location</em>' reference.
	 * @see #getCurrentLocation()
	 * @generated
	 */
	void setCurrentLocation(Location value);

} // LocationContext
