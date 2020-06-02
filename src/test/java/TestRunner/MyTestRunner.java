package TestRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import ProjectUtility.GenerateExtentReport;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		 monochrome = true,
    features = {
        "resources/features"
    },
    glue = {
        "StepDefination"
    },
    tags = {
    	    "@PastDateAPIStatusCode,"
    	  + " @PastDateJSONResponse,"
          + " @LatestDateAPIStatusCode,"
          + " @LatestDateJSONResponse,"
          + " @IncorrectAPIsStatuscode,"
          + " @DifferentDatesJSONResponse"
     }
	)
public class MyTestRunner {
	@AfterClass
	 public static void extentReportExecution() {
		
		GenerateExtentReport generateReport = new GenerateExtentReport();
		generateReport.setupExtendReport();
 
	}
}