package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Y:\\New Work Space\\CRMWebsite\\src\\main\\java\\Features\\hooks.feature",
		glue= {"StepDefinitions"},
		format={"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},//report generation
		strict=true,
		monochrome=true,
//		tags="@SmokeTest",   
//		tags= {"@SmokeTest,@RegressionTest"}, // OR operator to execute both Smoke and Regression Test Cases
//		tags= {"@SmokeTest","@RegressionTest"},//And Operator To Execute test cases have Both Regression and Smoke
//		tags= {"~@SmokeTest","~@RegressionTest"},// ~ Operator is used to Ignore Test cases 
		
		
		dryRun=false
		
		)

public class TestRunner {

}
