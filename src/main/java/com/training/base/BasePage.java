package com.training.base;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;
	public HashMap<String,By> ObjectRepo = new HashMap<String, By>();
	
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void addObject(String LogicalName, By by) {
		ObjectRepo.put(LogicalName, by);
		
	}
	
	private WebElement getElement(String LogicalName) {
		By by = ObjectRepo.get(LogicalName);
		WebElement element = driver.findElement(by);
		return element; 
		
	}
	
	
	public void enterintoTextbox(String LogicalName, String Value) {
		 WebElement element = getElement(LogicalName);
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		    waitforElement(element);
		    element.sendKeys(Value);
		}
	
	
	public void clickonButton(String LogicalName) {
		 WebElement element = getElement(LogicalName);	
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 waitforElement(element);
		 element.click();
	}
	

	private void waitforElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}

	public void switchtoFrame(String frameName) {
		WebElement element = getElement(frameName);	
		 waitforElement(element);
		 driver.switchTo().frame(element);
		
	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();
		
	}

	
	

}
