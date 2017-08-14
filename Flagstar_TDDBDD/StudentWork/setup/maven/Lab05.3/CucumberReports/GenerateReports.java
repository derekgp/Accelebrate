package com.ntier.life.insurance;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;


public class GenerateReports {

 
	@Test
	public void test() throws Exception {
		 
			CucumberResultsOverview results = new CucumberResultsOverview();
			results.setOutputDirectory("target");
			results.setOutputName("cucumber-results");
			results.setSourceFile("./target/test-report.json");
			results.executeFeaturesOverviewReport();
		 
	}

}
