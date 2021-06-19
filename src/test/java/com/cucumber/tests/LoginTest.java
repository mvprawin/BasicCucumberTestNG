/**
 * 
 */
/**
 * @author mvprawin
 *
 */
package com.cucumber.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterClass;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;


	
//@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/cucumberfeatures/Login.feature",
		glue={"com.cucumber.pages"},
		plugin = {"pretty",
				"html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/CucumberTestReport.json",
				"rerun:target/cucumber-reports/re-run.txt"}	)		
public class LoginTest  
{
	public static WebDriver driver;
	private TestNGCucumberRunner testRunner;
	
	@BeforeClass
	public void setUP()
	{
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
	      driver.manage().window().maximize();
		testRunner = new TestNGCucumberRunner(LoginTest.class);
		
	}
	@Test(description="login",dataProvider="features")
	public void login(CucumberFeatureWrapper cFeature)
	{
		testRunner.runCucumber(cFeature.getCucumberFeature());
	}
	@DataProvider(name="features")
	public Object[][] getFeatures()
	{
		return testRunner.provideFeatures();
	}
	//@AfterMethod
	@AfterMethod
	@AfterClass
	public void tearDown() throws IOException {
	testRunner.finish();
	driver.quit();
	}
}
	
	
