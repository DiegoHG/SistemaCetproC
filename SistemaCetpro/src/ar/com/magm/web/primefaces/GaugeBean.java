package ar.com.magm.web.primefaces;

import java.io.Serializable;
import java.util.ArrayList;

import org.primefaces.model.chart.MeterGaugeChartModel;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class GaugeBean implements Serializable {

	 private MeterGaugeChartModel meterGaugeModel;

	 public MeterGaugeChartModel getMeterGaugeModel() {
	  meterGaugeModel.setValue(Math.random() * 220);
	  return meterGaugeModel;
	 }
	 public GaugeBean() {
	  createMeterGaugeModel();
	 }
	 private void createMeterGaugeModel() {
	  ArrayList<Number> intervals = new ArrayList<Number>() {
	   {
	    add(20);
	    add(50);
	    add(120);
	    add(220);
	   }
	  };
	  meterGaugeModel = new MeterGaugeChartModel(0, intervals);
	 }

	}