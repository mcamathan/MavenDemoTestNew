package com.crm.qa.testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	
	public LoginPageTest() throws IOException {
		
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		
		launchBrowser();
		
		loginPage = new LoginPage();
		
	}//BeforeMethod
	
	@Test
	public void loginPageTitleTest() throws InterruptedException
	{
		
		String title  =  loginPage.validateLoginPageTitle();
		System.out.println("The page title is :"+title);
		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
		
	}//Test
	
	/*
	 * @Test public void loginTest() {
	 * 
	 * loginPage.validateLoginPageTitle();
	 * 
	 * }//Test
	 */	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	
	}//AfterMethod
	
	
	

}
