package codeCharge.Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

/**
 * @author Yamini Menta
  class created to run login page 
**/

@RunWith(Cucumber.class)
@CucumberOptions(features="features",
tags= "@p1_enter",
glue= {"codeCharge.stepDefination"},
plugin= {"html:target/cucumber-html.report"})
public class TaskRunner {
	private TestNGCucumberRunner testRunner;
  
	@BeforeClass
	public void setUP()
	 /**
		 * method to method for Initializing the Objects
		 */
	{
		testRunner = new TestNGCucumberRunner(LoginRunner.class);			
	}
  
	@Test(description="login",dataProvider="features")
	public void login(CucumberFeatureWrapper cFeature)
	{
		testRunner.runCucumber(cFeature.getCucumberFeature());
	}
	/**
	 * method to read the test data from features
	 * @return data
	 */
	@DataProvider(name="features")
	public Object[][] getFeatures()
	{
		return testRunner.provideFeatures();
	}
  
	@AfterClass
	/**
	 * method to close the page
	 * @throws InterruptedException
	 */
	public void tearDown() throws InterruptedException
	{		
		testRunner.finish();
		

	}

}
