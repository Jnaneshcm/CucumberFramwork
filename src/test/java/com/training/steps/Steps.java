package com.training.steps;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.pagefactory.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps extends BaseTest{
	
	PageFactory pageFactory = new PageFactory();
	BasePage page;

	@Before
	public void setup() throws Exception{
	
	}
	
	@Given("User is on the {string} application")
	public void user_is_on_the_application(String application) {
	
		if(application.equals("Amazon")){
		launchapplication("https://www.amazon.com/");
	   }else if (application.equals("Salesforce")) {
		   launchapplication("https://login.salesforce.com");
	   } else if (application.equals("Flipkart")) {
		   launchapplication("https://www.flipkart.com/");
		   
	   }
		
	}


	
	
	@Given("User is on {string}")
	public void user_is_on(String Page) {
		page = pageFactory.initialize(Page);
		//page = new LoginPage();
		
		
	}

	@When("User enter into Textbox {string} {string}")
	public void user_enter_into_textbox(String logicalName, String Value) {
		page.enterintoTextbox(logicalName, Value);
	    
	}
	
	
	@Then("click on Button {string}")
	public void click_on_button(String logicalName) {
	    page.clickonButton(logicalName);
	}
	
	
	@Then("click on link {string}")
	public void click_on_link(String logicalName) {
		page.clickonButton(logicalName);
	}
	
	
	@When("User switch to frame {string}")
	public void user_switch_to_frame(String frameName) {
	   page.switchtoFrame(frameName);
	}
	
	
	@Then("User Accepts the Alert")
	public void user_accepts_the_alert() {
	   page.acceptAlert();
	}

	
	@After
	public void teardown(Scenario scenario) {
		
		byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		
		scenario.attach(screenshot, "image/png", scenario.getName());
		
		driver.close();
		driver=null;
	}
	
}
