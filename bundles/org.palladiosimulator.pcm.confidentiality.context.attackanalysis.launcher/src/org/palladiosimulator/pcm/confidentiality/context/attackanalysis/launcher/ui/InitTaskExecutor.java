package org.palladiosimulator.pcm.confidentiality.context.attackanalysis.launcher.ui;

import java.util.concurrent.atomic.AtomicBoolean;

public class InitTaskExecutor {

	private final AtomicBoolean initTaskRunning = new AtomicBoolean(false);
	
	public void runInitTask(Runnable task) {
		synchronized(initTaskRunning) {
			initTaskRunning.set(true);
			try {
				task.run();
			} finally {
				initTaskRunning.set(false);
			}
		}
	}
	
	public boolean isInitTaskRunning() {
		synchronized (initTaskRunning) {
			return initTaskRunning.get();
		}
	}
	
}
