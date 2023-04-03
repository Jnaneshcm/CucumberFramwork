package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class FlipkartPage extends BasePage{
	
	static WebDriver driver;
	
	public FlipkartPage() {
		super(driver=BaseTest.getDriver());
		addObject("MobileNumber", By.xpath("//input[@class='_2IX_2- VJZDxU']"));
      addObject("Travel", By.xpath("//div[contains(text(),'Travel')]"));
    

	addObject("From" , By.xpath("//input[@name='0-departcity']"));
	addObject("To" , By.xpath("//input[@name='0-arrivalcity']"));
	addObject("Search" , By.xpath("//button[@type='button']"));
	
	
	}
}
