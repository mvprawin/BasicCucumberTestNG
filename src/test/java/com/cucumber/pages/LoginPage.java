/**
 * 
 */
/**
 * @author mvprawin
 *
 */
//http://testerstories.com/2015/10/page-objects-with-selenium-and-cucumber-jvm/
package com.cucumber.pages;
//http://toolsqa.com/selenium-cucumber-framework/page-object-manager/
//http://testerstories.com/2015/10/page-objects-with-selenium-and-cucumber-jvm/
//https://medium.com/@hmurari/bdd-cucumber-and-selenium-webdriver-based-test-automation-framework-in-python-ae092a7581d3
import com.cucumber.tests.LoginTest;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage{
	LoginTest lt = new LoginTest();
@Given("^Open Application and Enter url$")
public void open_Application_and_Enter_url() throws Throwable {
	LoginTest.driver.get("http://demo.guru99.com/v4/");
	Thread.sleep(5000);
   //throw new PendingException();
}

@When("^enter username$")
public void enter_username() throws Throwable {
	System.out.println("username text field found");
LoginTest.driver.findElement(By.name("uid")).sendKeys("Admin");
   //throw new PendingException();
}

@When("^enter password$")
public void enter_password() throws Throwable {
	System.out.println("passwd text field found");
   LoginTest.driver.findElement(By.name("password")).sendKeys("Admin123");
  
	LoginTest.driver.findElement(By.name("btnReset")).click();
	
	// WebElement lg= LoginTest.driver.findElement(By.id("btnLogin"));
	//((JavascriptExecutor)LoginTest.driver).executeScript("arguments[0],scrollIntoView();",lg);
	//LoginTest.driver.findElement(By.id("loginButton")).click();
  // throw new PendingException();
}

@Then("^verify Msg$")
public void verify_Msg() throws Throwable {
   String result =  LoginTest.driver.findElement(By.xpath("//h2[contains(text(),'Guru')]")).getText();
	   Assert.assertEquals(result, "Guru99 Bank");
  // throw new PendingException();
}
}
