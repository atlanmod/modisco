/*******************************************************************************
 * Copyright (c) 2012 INRIA. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 * 
 ******************************************************************************/
package org.eclipse.modisco.utils.chart.birt.core;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.birt.chart.computation.Point;
import org.eclipse.birt.chart.device.IDeviceRenderer;
import org.eclipse.birt.chart.exception.ChartException;
import org.eclipse.birt.chart.factory.GeneratedChartState;
import org.eclipse.birt.chart.factory.Generator;
import org.eclipse.birt.chart.model.ChartWithAxes;
import org.eclipse.birt.chart.model.attribute.Anchor;
import org.eclipse.birt.chart.model.attribute.AxisType;
import org.eclipse.birt.chart.model.attribute.Bounds;
import org.eclipse.birt.chart.model.attribute.ChartDimension;
import org.eclipse.birt.chart.model.attribute.ColorDefinition;
import org.eclipse.birt.chart.model.attribute.LegendItemType;
import org.eclipse.birt.chart.model.attribute.LineAttributes;
import org.eclipse.birt.chart.model.attribute.LineStyle;
import org.eclipse.birt.chart.model.attribute.impl.BoundsImpl;
import org.eclipse.birt.chart.model.attribute.impl.ColorDefinitionImpl;
import org.eclipse.birt.chart.model.attribute.impl.LineAttributesImpl;
import org.eclipse.birt.chart.model.attribute.impl.NumberFormatSpecifierImpl;
import org.eclipse.birt.chart.model.attribute.impl.TextImpl;
import org.eclipse.birt.chart.model.component.Axis;
import org.eclipse.birt.chart.model.component.Label;
import org.eclipse.birt.chart.model.component.Series;
import org.eclipse.birt.chart.model.component.impl.LabelImpl;
import org.eclipse.birt.chart.model.component.impl.SeriesImpl;
import org.eclipse.birt.chart.model.data.NumberDataSet;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
import org.eclipse.birt.chart.model.data.impl.NumberDataSetImpl;
import org.eclipse.birt.chart.model.data.impl.SeriesDefinitionImpl;
import org.eclipse.birt.chart.model.impl.ChartWithAxesImpl;
import org.eclipse.birt.chart.model.type.LineSeries;
import org.eclipse.birt.chart.model.type.impl.LineSeriesImpl;
import org.eclipse.birt.chart.util.PluginSettings;
import org.eclipse.modisco.utils.chart.metamodel.chart.Axe;
import org.eclipse.modisco.utils.chart.metamodel.chart.Chart;
import org.eclipse.modisco.utils.chart.metamodel.chart.Coordinate;
import org.eclipse.modisco.utils.chart.metamodel.chart.Serie;

/**
 * Class providing support for generating a chart with Birt in png
 * The chart is generated from a birtchart model @see org.eclipse.modisco.utils.chart.metamodel
 * @author Guillaume Doux
 *
 */

public final class BirtGraphHelper {

	private static final double UNIT_SPACING = 0.1;
	
	private static BirtGraphHelper instance;

	private List<ColorDefinition> colors;

	private static final int CHART_WIDTH = 800;

	private static final int CHART_HEIGHT = 400;
	
	public List<ColorDefinition> getColors() {
		return this.colors;
	}

	public void setColors(final List<ColorDefinition> colors) {
		this.colors = colors;
	}

	private BirtGraphHelper() {
		this.colors = new ArrayList<ColorDefinition>();
		this.colors.add(ColorDefinitionImpl.BLUE());
		this.colors.add(ColorDefinitionImpl.ORANGE());
		this.colors.add(ColorDefinitionImpl.GREEN());
		this.colors.add(ColorDefinitionImpl.RED());
		this.colors.add(ColorDefinitionImpl.CYAN());
		this.colors.add(ColorDefinitionImpl.PINK());
		this.colors.add(ColorDefinitionImpl.GREY());
		this.colors.add(ColorDefinitionImpl.YELLOW());
	}

	/**
	 * Give an instance of the chart generator
	 * @return the BirtGraphHelper
	 */
	public static synchronized BirtGraphHelper getInstance() {
		if (BirtGraphHelper.instance == null) {
			BirtGraphHelper.instance = new BirtGraphHelper();
		}
		return BirtGraphHelper.instance;
	}
	
	/**
	 * Create a Birt chart using the chart passed with the birtchart parameter
	 * Works only with graph having 2 dimensions
	 * @param birtChart
	 * @param targetFolder
	 * @param fileName+".png" name of the png file (without extension)
	 * @throws ChartException, Exception
	 */
	public void createBirtGraph(final Chart birtChart,
			final File targetFolder, final String fileName) throws Exception {
		ChartWithAxes chart = ChartWithAxesImpl.create();
		if (birtChart.getAxes().size() == 2) {
			chart.setDimension(ChartDimension.TWO_DIMENSIONAL_LITERAL);
		} else {
			throw new GraphHelperException("the chart should have only 2 dimensions");
		}
		chart.setUnitSpacing(BirtGraphHelper.UNIT_SPACING);
		chart.getPlot().setBackground(ColorDefinitionImpl.WHITE());
		chart.getPlot().getClientArea().setBackground(ColorDefinitionImpl.WHITE());
		chart.getLegend().setItemType(LegendItemType.SERIES_LITERAL);
		chart.getLegend().setVisible(true);
		chart.getLegend().setAnchor(Anchor.NORTH_EAST_LITERAL);

		chart.getTitle().getLabel().getCaption()
		.setValue(birtChart.getTitle()); //$NON-NLS-1$

		final Axe abs = birtChart.getAxes().get(0);
		final Axe ord = birtChart.getAxes().get(1);

		final Axis xAxis = chart.getPrimaryBaseAxes()[0];
		xAxis.setType(AxisType.LINEAR_LITERAL);
		xAxis.setFormatSpecifier(NumberFormatSpecifierImpl.create());

		xAxis.getTitle().getCaption().setValue(abs.getLegend() + " (" + abs.getUnit() + ")"); //$NON-NLS-1$
		xAxis.getTitle().setVisible(true);

		final List<Point> dataPoints = new ArrayList<Point>();

		final SeriesDefinition ySeriesDefinition = SeriesDefinitionImpl.create();
		
		final Comparator<Point> comparator = new Comparator<Point>() {
			public int compare(final Point point1, final Point point2) {
				if (point1.x == point2.x) {
					return 0;
				} else if (point1.x < point2.x) {
					return -1;
				} else {
					return 1;
				}
			}
		};
		for (Serie serie : birtChart.getSeries()) {
			dataPoints.clear();
			for (org.eclipse.modisco.utils.chart.metamodel.chart.Point point : serie.getPoints()) {
				double xCoord = 0;
				double yCoord = 0;
				for (Coordinate coord : point.getCoordinates()) {
					if (coord.getAxe().equals(abs)) {
						xCoord = coord.getValue();
					}
					if (coord.getAxe().equals(ord)) {
						yCoord = coord.getValue();
					}
				}
				final Point birtPoint = new Point(xCoord, yCoord);
				dataPoints.add(birtPoint);
			}

			// sort on X axis
			
			Collections.sort(dataPoints, comparator);


			final ColorDefinition serieColor = getColorForSerie(birtChart.getSeries().indexOf(serie));


			final LineSeries lineSeries = (LineSeries) LineSeriesImpl.create();
			lineSeries.setSeriesIdentifier(serie.getName());
			lineSeries.setCurve(false);

			final ArrayList<Double> yAxisValues = new ArrayList<Double>();
			for (Point dataPoint : dataPoints) {
				yAxisValues.add(dataPoint.y);
			}
			final NumberDataSet dataSet = NumberDataSetImpl.create(yAxisValues);
			lineSeries.setDataSet(dataSet);
			lineSeries.getMarkers().clear();//Remove this to show markers for each points

			final LineAttributes lineAttr = LineAttributesImpl.create(ColorDefinitionImpl.BLACK(),
					LineStyle.SOLID_LITERAL, 1);
			lineAttr.setVisible(true);
			lineAttr.setColor(serieColor);
			lineSeries.setLineAttributes(lineAttr);

			final Point[] linearRegression = computeLinearRegression(dataPoints);
			final LineSeries linearRegSeries = (LineSeries) LineSeriesImpl.create();
			final ArrayList<Double> regressionYAxisValues = new ArrayList<Double>();
			for (Point point : linearRegression) {
					regressionYAxisValues.add(point.y);
			}
			final NumberDataSet linearRegDataSet = NumberDataSetImpl.create(regressionYAxisValues);
			linearRegSeries.setDataSet(linearRegDataSet);
			linearRegSeries.getMarkers().clear();

			// line attributes
			final LineAttributes lineAttr2 = LineAttributesImpl.create(ColorDefinitionImpl.BLACK(),
					LineStyle.DASHED_LITERAL, 1);
			lineAttr2.setVisible(true);
			lineAttr2.setColor(serieColor);
			linearRegSeries.setLineAttributes(lineAttr2);
	
			ySeriesDefinition.getSeries().add(lineSeries);
			ySeriesDefinition.getSeries().add(linearRegSeries);
			
		}
		
		final ArrayList<Double> xAxisValues = new ArrayList<Double>();
		for (Point dataPoint : dataPoints) {
				xAxisValues.add(dataPoint.x);
		}
		final NumberDataSet xAxisDataSet = NumberDataSetImpl.create(xAxisValues);
		
		final Series xAxisSeries = SeriesImpl.create();
		xAxisSeries.setDataSet(xAxisDataSet);
		final SeriesDefinition xSeriesDefinition = SeriesDefinitionImpl.create();
		xSeriesDefinition.getSeries().add(xAxisSeries);
		xAxis.getSeriesDefinitions().add(xSeriesDefinition);

		final Axis yAxis = chart.getPrimaryOrthogonalAxis(xAxis);
		yAxis.setType(AxisType.LINEAR_LITERAL);
		yAxis.setFormatSpecifier(NumberFormatSpecifierImpl.create());
		yAxis.getTitle().setVisible(true);

		yAxis.getTitle().getCaption().setValue(ord.getLegend() + " (" + ord.getUnit() + ")"); //$NON-NLS-1$
		yAxis.getSeriesDefinitions().add(ySeriesDefinition);
	
		//Chart rendering
		final PluginSettings pSettings = PluginSettings.instance();
		final IDeviceRenderer render = pSettings.getDevice("dv.PNG"); //$NON-NLS-1$
		render.setProperty(IDeviceRenderer.FILE_IDENTIFIER, new File(targetFolder,
				fileName + ".png")); //$NON-NLS-1$ 
		final Bounds bounds = BoundsImpl.create(0, 0, CHART_WIDTH, CHART_HEIGHT);
		final Generator generator = Generator.instance();
		final GeneratedChartState state = generator.build(render.getDisplayServer(), chart, bounds, null,
				null, null);
		generator.render(render, state);
	}


	private ColorDefinition getColorForSerie(final int indexOf) {
		return this.colors.get(indexOf % this.colors.size());
	}



	/**
	 * Computes the linear regression of the given list of points, and returns
	 * points on the computed line.
	 * 
	 * @param dataPoints
	 *            the points to include in the computation
	 * @return points on the computed approximation line, with the same abscissa
	 *         as the input points
	 */
	private static Point[] computeLinearRegression(final List<Point> dataPoints) {
		// see: http://en.wikipedia.org/wiki/Simple_linear_regression
		final double size = dataPoints.size();
		if ((int) size == 0) {
			return new Point[0];
		}
		if ((int) size == 1) {
			Point point = dataPoints.get(0);
			return new Point[] { new Point(point.x, point.y) };
		}
		double sumXY = 0.0;
		double sumX = 0.0;
		double sumY = 0.0;
		double sumXX = 0.0;
		for (Point point : dataPoints) {
			sumX += point.x;
			sumXX += point.x * point.x;
			sumY += point.y;
			sumXY += point.x * point.y;
		}

		// a = (NΣXY - (ΣX)(ΣY)) / (NΣX² - (ΣX)²)
		final double a = (size * sumXY - sumX * sumY) / (size * sumXX - sumX * sumX);
		// b = (ΣY - b(ΣX)) / N
		final double b = (sumY - a * sumX) / size;

		List<Point> resultPoints = new ArrayList<Point>();
		for (Point point : dataPoints) {
			// y = ax + b
			resultPoints.add(new Point(point.x, a * point.x + b));
		}
		return resultPoints.toArray(new Point[resultPoints.size()]);
	}
}
