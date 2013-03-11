/*******************************************************************************
 * Copyright (c) 2012 INRIA. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 * 
 ******************************************************************************/

package org.eclipse.modisco.infra.discovery.benchmark.core.internal.reporting.internal;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Event;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.MemoryMeasurement;
import org.eclipse.modisco.utils.chart.birt.core.BirtGraphHelper;
import org.eclipse.modisco.utils.chart.metamodel.chart.Axe;
import org.eclipse.modisco.utils.chart.metamodel.chart.Chart;
import org.eclipse.modisco.utils.chart.metamodel.chart.Coordinate;
import org.eclipse.modisco.utils.chart.metamodel.chart.Point;
import org.eclipse.modisco.utils.chart.metamodel.chart.Serie;
import org.eclipse.modisco.utils.chart.metamodel.chart.chartFactory;

/**
 * Class preparing and launching the chart generation in Birt
 * @author Guillaume Doux
 *
 */
public class BenchmarkChartGeneration {

	private File location;
	private boolean measureMemory;
	private chartFactory factory;
	private BirtGraphHelper helper;

	public static final double MEGABYTE = 1024.0 * 1024.0;

	/**
	 * public constructor of the chart generator
	 * @param location: location folder of the generated charts
	 */
	public BenchmarkChartGeneration(final File location, final boolean measureMemory) {
		this.location = location;
		this.measureMemory = measureMemory;
		this.factory = chartFactory.eINSTANCE;
		this.helper = BirtGraphHelper.getInstance();		
	}

	public void generateAll(final Benchmark b) throws Exception {
		createDiscoveryTimeAsProjectSizeFull(b);
		if (this.measureMemory) {
			createMemoryUsedAsProjectSizeFull(b);
		}
	}

	public void createDiscoveryTimeAsProjectSizeFull(final Benchmark b) throws Exception {
		createDiscoveryTimeAsProjectSizeOverallAveraged(b);
		List<String> testedDiscoverers = new ArrayList<String>();
		for (Discovery d : b.getDiscoveries()) {
			if (!testedDiscoverers.contains(d.getDiscovererId())) {
				createDiscoveryTimeAsProjectSizeAveraged(b, d);
				testedDiscoverers.add(d.getDiscovererId());
			}
		}			
	}

	private void createDiscoveryTimeAsProjectSizeAveraged(final Benchmark b, final Discovery d) throws Exception {
		Chart chart = this.factory.createChart();
		chart.setTitle("Discovery time by project size for" + d.getDiscovererId());
		Serie s = this.factory.createSerie();
		s.setName(d.getDiscovererId());
		chart.getSeries().add(s);
		Axe size = this.factory.createAxe();
		Axe time = this.factory.createAxe();
		size.setUnit("megabytes");
		size.setLegend("project size");
		time.setUnit("secondes");
		time.setLegend("Discovery Time");
		chart.getAxes().add(size);
		chart.getAxes().add(time);
		for (Discovery dtemp : b.getDiscoveries()) {
			if (dtemp.getDiscovererId().equals(d.getDiscovererId())) {
				Point p = this.factory.createPoint();
				p.setSerie(s);
				Coordinate t = this.factory.createCoordinate();
				t.setAxe(size);
				t.setValue(dtemp.getProject().getTotalSizeInBytes() / MEGABYTE);
				Coordinate m = this.factory.createCoordinate();
				m.setAxe(time);
				m.setValue(dtemp.getDiscoveryTimeAverageInSeconds());
				p.getCoordinates().add(t);
				p.getCoordinates().add(m);
			}
		}
		this.helper.createBirtGraph(chart, this.location, "DiscoveryTimeByProjectSize" + d.getDiscovererId());
	}

	private void createDiscoveryTimeAsProjectSizeOverallAveraged(final Benchmark b) throws Exception {
		Chart chart = this.factory.createChart();
		chart.setTitle("Discovery time by project size overall");
		Axe size = this.factory.createAxe();
		Axe time = this.factory.createAxe();
		size.setUnit("megabytes");
		size.setLegend("project size");
		time.setUnit("secondes");
		time.setLegend("Discovery Time");
		chart.getAxes().add(size);
		chart.getAxes().add(time);
		List<String> testedDiscoverers = new ArrayList<String>();
		for (Discovery d : b.getDiscoveries()) {
			if (!testedDiscoverers.contains(d.getDiscovererId())) {
				Serie s = this.factory.createSerie();
				s.setName(d.getDiscovererId());
				chart.getSeries().add(s);
				for (Discovery dtemp : b.getDiscoveries()) {
					if (dtemp.getDiscovererId().equals(d.getDiscovererId())) {
						Point p = this.factory.createPoint();
						p.setSerie(s);
						Coordinate t = this.factory.createCoordinate();
						t.setAxe(size);
						t.setValue(dtemp.getProject().getTotalSizeInBytes() / MEGABYTE);
						Coordinate m = this.factory.createCoordinate();
						m.setAxe(time);
						m.setValue(dtemp.getDiscoveryTimeAverageInSeconds());
						p.getCoordinates().add(t);
						p.getCoordinates().add(m);
					}
				}
				testedDiscoverers.add(d.getDiscovererId());
			}
		}
		this.helper.createBirtGraph(chart, this.location, "DiscoveryTimeByProjectSizeOverall");
	}


	public void createMemoryUsedAsProjectSizeFull(final Benchmark b) throws Exception {
		createMemoryUsedAsProjectSizeOverallAveraged(b);
		List<String> testedDiscoverers = new ArrayList<String>();
		for (Discovery d : b.getDiscoveries()) {
			if (!testedDiscoverers.contains(d.getDiscovererId())) {
				createMemoryUsedAsProjectSizeAveraged(b, d);
				testedDiscoverers.add(d.getDiscovererId());
			}
			for (DiscoveryIteration di : d.getIterations()) {
				createMemoryUseByTime(d, di);
			}
		}
	}

	private void createMemoryUsedAsProjectSizeAveraged(final Benchmark b, final Discovery d) throws Exception {
		Chart chart = this.factory.createChart();
		chart.setTitle("Memory used by project size for" + d.getDiscovererId());
		Serie s = this.factory.createSerie();
		s.setName(d.getDiscovererId());
		chart.getSeries().add(s);
		Axe size = this.factory.createAxe();
		Axe memory = this.factory.createAxe();
		size.setUnit("megabytes");
		size.setLegend("project size");
		memory.setUnit("megabytes");
		memory.setLegend("memory used");
		chart.getAxes().add(size);
		chart.getAxes().add(memory);
		for (Discovery dtemp : b.getDiscoveries()) {
			if (dtemp.getDiscovererId().equals(d.getDiscovererId())) {
				Point p = this.factory.createPoint();
				p.setSerie(s);
				Coordinate t = this.factory.createCoordinate();
				t.setAxe(size);
				t.setValue(dtemp.getProject().getTotalSizeInBytes() / MEGABYTE);
				Coordinate m = this.factory.createCoordinate();
				m.setAxe(memory);
				m.setValue(dtemp.getIterations().get(0).getMaxUsedMemoryInBytes() / MEGABYTE);
				p.getCoordinates().add(t);
				p.getCoordinates().add(m);
			}
		}
		this.helper.createBirtGraph(chart, this.location, "memoryByProjectSize" + d.getDiscovererId());
	}

	private void createMemoryUsedAsProjectSizeOverallAveraged(final Benchmark b) throws Exception {
		Chart chart = this.factory.createChart();
		chart.setTitle("Memory used by project size overall");
		Axe size = this.factory.createAxe();
		Axe memory = this.factory.createAxe();
		size.setUnit("megabytes");
		size.setLegend("project size");
		memory.setUnit("megabytes");
		memory.setLegend("memory used");
		chart.getAxes().add(size);
		chart.getAxes().add(memory);
		List<String> testedDiscoverers = new ArrayList<String>();
		for (Discovery d : b.getDiscoveries()) {
			if (!testedDiscoverers.contains(d.getDiscovererId())) {
				Serie s = this.factory.createSerie();
				s.setName(d.getDiscovererId());
				chart.getSeries().add(s);
				for (Discovery dtemp : b.getDiscoveries()) {
					if (dtemp.getDiscovererId().equals(d.getDiscovererId())) {
						Point p = this.factory.createPoint();
						p.setSerie(s);
						Coordinate t = this.factory.createCoordinate();
						t.setAxe(size);
						t.setValue(dtemp.getProject().getTotalSizeInBytes() / MEGABYTE);
						Coordinate m = this.factory.createCoordinate();
						m.setAxe(memory);
						m.setValue(dtemp.getIterations().get(0).getMaxUsedMemoryInBytes() / MEGABYTE);
						p.getCoordinates().add(t);
						p.getCoordinates().add(m);
					}
				}
				testedDiscoverers.add(d.getDiscovererId());
			}
		}
		this.helper.createBirtGraph(chart, this.location, "memoryByProjectSizeOverall");
	}


	public void createMemoryUseByTime(final Discovery d, final DiscoveryIteration di) throws Exception {
		Chart chart = this.factory.createChart();
		chart.setTitle("Memory used by time for " + d.getDiscovererId() + " on " + d.getProject().getName() + " the " + di.getDiscoveryDate());
		Serie s = this.factory.createSerie();
		s.setName(d.getDiscovererId());
		chart.getSeries().add(s);
		Axe time = this.factory.createAxe();
		Axe memory = this.factory.createAxe();
		time.setUnit("ms");
		time.setLegend("time");
		memory.setUnit("megabytes");
		memory.setLegend("memory used");
		chart.getAxes().add(time);
		chart.getAxes().add(memory);
		
		for (Event mm : di.getMemoryMeasurements()) {
			if (mm instanceof MemoryMeasurement) {
				MemoryMeasurement mem = (MemoryMeasurement) mm;
				Point p = this.factory.createPoint();
				p.setSerie(s);
				Coordinate t = this.factory.createCoordinate();
				t.setAxe(time);
				t.setValue(mem.getTime());
				Coordinate m = this.factory.createCoordinate();
				m.setAxe(memory);
				m.setValue(mem.getMemoryUsed() / MEGABYTE);
				p.getCoordinates().add(t);
				p.getCoordinates().add(m);
			}
		}
		this.helper.createBirtGraph(chart, this.location, "memoryByTime" + d.getDiscovererId() + "_" + di.getDiscoveryDate().toString().replaceAll(" ", "_").replaceAll(":", "-"));
	}

}
