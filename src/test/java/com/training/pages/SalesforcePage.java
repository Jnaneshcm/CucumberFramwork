package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class SalesforcePage extends BasePage{
	
	static WebDriver driver ;
	
	public SalesforcePage() {
		super(driver=BaseTest.getDriver());
	 addObject("Username" , By.id("username"));
	 addObject("Password" , By.id("password"));
	 addObject("Login" , By.id("Login"));
	 addObject("Leads" , By.xpath("//a[normalize-space()='Leads']"));
	 addObject("Accounts" , By.xpath("//a[normalize-space()='Accounts']"));
	 addObject("Home" , By.xpath("	//a[text()='Home'][1]"));
	 addObject("FirstName" , By.id("name_first"));
	 addObject("LastName" , By.id("name_last"));
	 addObject("Company" , By.id("company"));
	 addObject("Save" , By.xpath("//input[@title='Save']"));
	 addObject("Close" , By.id("tryLexDialogX"));
	 addObject("LightingExperience" , By.xpath("//iframe[@title='sessionserver']"));
	 addObject("LeadCreated" , By.xpath("//a[normalize-space()='Test2, Test1']"));
	 addObject("DeleteLead" , By.xpath("//td[@id='topButtonRow']//input[@title='Delete']"));
}
	
	
}
