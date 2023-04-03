package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.training.base.BasePage;
import com.training.base.BaseTest;

public class AmazonPage extends BasePage{
	
	static WebDriver driver ;
	
	public AmazonPage() {
		super(driver=BaseTest.getDriver());
		
	 addObject("SearchText" , By.id("twotabsearchtextbox"));
	 addObject("Search" , By.xpath("//input[@id='nav-search-submit-button']"));
	 addObject("Book" , By.xpath("//span[normalize-space()='Selenium with Python Simplified For Beginners - Simple, Concise & Easy guide to Automation Testing using Python and Selenium WebDriver']"));
	 addObject("AddToCart" , By.xpath("//input[@id='add-to-cart-button']"));
	 
	
	}
	
	
}
