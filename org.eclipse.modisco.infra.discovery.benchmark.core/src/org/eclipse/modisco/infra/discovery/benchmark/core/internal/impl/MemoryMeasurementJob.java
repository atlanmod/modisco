/*******************************************************************************
 * Copyright (c) 2012 INRIA. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 * 
 ******************************************************************************/

package org.eclipse.modisco.infra.discovery.benchmark.core.internal.impl;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.internal.jobs.JobStatus;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.BenchmarkFactory;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.EventType;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.benchmark.MemoryMeasurement;

/**
 * The implementation of the job measuring the memory consumption
 * @author Guillaume Doux
 *
 */
public class MemoryMeasurementJob extends Job {

	private int memoryPollingInterval;
	private List<MemoryMeasurement> measures;
	private long jobStartTime;
	
	private EventType eventType;
	
	/**
	 * Constructor
	 * @param name: the name of the job
	 * @param interval: the time interval between two measure in milliseconds 
	 */
	public MemoryMeasurementJob(final String name, final int interval) {
		super(name);
		this.memoryPollingInterval = interval;
		this.measures = new LinkedList<MemoryMeasurement>();
		this.jobStartTime = 0;
		this.eventType = BenchmarkFactory.eINSTANCE.createEventType();
		this.eventType.setName("periodicMemoryMeasure");
	}
	
	/**
	 * Re-initialize the memory measurement job
	 * @return this job
	 */
	public MemoryMeasurementJob reset() {
		this.measures = new LinkedList<MemoryMeasurement>();
		return this;
	}
	
	/**
	 * Setter for the starting time
	 * @param s: the starting time in milliseconds
	 */
	public void setJobStartTime(final long s) {
		this.jobStartTime = s;
	}
	
	/**
	 * Getter for the polling interval
	 * @return the interval
	 */
	public int getMemoryPollingInterval() {
		return this.memoryPollingInterval;
	}

	/**
	 * Getter for the list of measures
	 * @return the list of measures
	 */
	public List<MemoryMeasurement> getMeasures() {
		return this.measures;
	}

	/**
	 * The run method of the job
	 */
	//TODO check that the long is not too big for an int
	protected IStatus run(final IProgressMonitor monitor) {
		IStatus result = new JobStatus(IStatus.OK, this, "Memory measured every " + this.memoryPollingInterval + " ms.");
		System.gc();
		final long mem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		
		MemoryMeasurement memoryMeasure = BenchmarkFactory.eINSTANCE.createMemoryMeasurement();
		memoryMeasure.setTime(System.currentTimeMillis() - this.jobStartTime);
		memoryMeasure.setMemoryUsed((int) mem);
		memoryMeasure.setEventType(this.eventType);
		
		this.measures.add(memoryMeasure);
		schedule(this.memoryPollingInterval);
		return result;
	}

}
