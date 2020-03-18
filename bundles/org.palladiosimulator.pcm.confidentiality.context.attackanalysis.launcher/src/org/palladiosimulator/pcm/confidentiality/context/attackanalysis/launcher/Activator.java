package org.palladiosimulator.pcm.confidentiality.context.attackanalysis.launcher;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
//import org.palladiosimulator.pcm.confidentiality.context.attackanalysis.workflow.query.impl.IQueryManager;
//import org.prolog4j.manager.IProverManager;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.palladiosimulator.pcm.confidentiality.context.attackanalysis.launcher"; //$NON-NLS-1$

	// The shared instance
	private static Activator instance;

//	private IProverManager proverManager;
//	private volatile IQueryManager queryManager;
	/**
	 * The constructor
	 */
	public Activator() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		setInstance(this);

		//FIXME attackerAnalysis package
//		ServiceReference<Analysis.> proverManagerReference = context.getServiceReference(Analysis.class);
//		this.proverManager = context.getService(proverManagerReference);

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		setInstance(null);
		super.stop(context);
	}

	private static void setInstance(Activator instance) {
		Activator.instance = instance;
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getInstance() {
		return Activator.instance;
	}

//	public IProverManager getProverManagerInstance() {
//		return proverManager;
//	}
//
//	public IQueryManager getQueryManagerInstance() {
//		IQueryManager foundQueryManager = queryManager;
//		if (foundQueryManager == null) {
//			synchronized (this) {
//				foundQueryManager = queryManager;
//				if (foundQueryManager == null) {
//					BundleContext bundleContext = getInstance().getBundle().getBundleContext();
//					ServiceReference<IQueryManager> queryManagerReference = bundleContext
//							.getServiceReference(IQueryManager.class);
//					foundQueryManager = bundleContext.getService(queryManagerReference);
//					queryManager = foundQueryManager;
//				}
//			}
//		}
//		return foundQueryManager;
//	}

}
