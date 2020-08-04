package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(name = "email")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//div[text()='Login']")
	WebElement login;
	
	@FindBy(xpath = "//a[@title='free crm home']/span[3]/font")
	WebElement crmLogo;
	
	
	public LoginPage() throws IOException {
		
		PageFactory.initElements(driver,this);
	
	}//LoginPage
	
	public String validateLoginPageTitle() throws InterruptedException
	{
		
		Thread.sleep(10000);
		return driver.getTitle();
		
	}//validateLoginPageTitle
	
	
	
	
	

}
