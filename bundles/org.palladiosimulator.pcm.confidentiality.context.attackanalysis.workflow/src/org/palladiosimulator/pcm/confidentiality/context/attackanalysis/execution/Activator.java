package org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.palladiosimulator.pcm.confidentiality.context.analysis.api.Analysis;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "pcm.dataprocessing.analysis.wfe"; //$NON-NLS-1$

	// The shared instance
	private static Activator instance;

    private Analysis analysis;

	/**
	 * The constructor
	 */
	public Activator() {
	
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		setInstance(instance);
		ServiceReference<Analysis> reference = context.getServiceReference(Analysis.class);
        analysis = context.getService(reference);
        instance = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		setInstance(null);
		super.stop(context);
	}


	private static void setInstance(Activator instance) {
		Activator.instance = instance;
	}
	
	public Analysis getAnalysis() {
	    return analysis;
	}
	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getInstance() {
		return Activator.instance;
	}

	
}
