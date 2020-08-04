package com.crm.qa.commonfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctionsClass {

	WebDriver driver = new FirefoxDriver();

	WebDriverWait wait = new WebDriverWait(driver,10);
	
	public void waitForElementToAppear(WebElement element) {

	}// waitForElementToAppear

}
