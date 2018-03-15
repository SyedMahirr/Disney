package com.Disney.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class testNGtestRunner {
	
		
		@CucumberOptions(
		        features = "Features",
		        glue="com.Disney.stepdef",
		        tags="@ResortFind"
		        )

		public class TestRunner extends AbstractTestNGCucumberTests{}

	}


