package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	
	public static WebDriver driver;
	
	static Properties prop;
	
	public TestBase() throws IOException
	{
	
		try
		{
		
			prop = new Properties();
		
			FileInputStream ip = new FileInputStream("C:\\Users\\Laksh\\eclipse-workspace\\SeleniumMavenFrameworkCreation\\MavenDemoTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		
			prop.load(ip);	
		
		}//try 
	
		catch(FileNotFoundException e)
		{
		
			e.printStackTrace();
		
		}//catch
	
		catch(IOException e)
		{
		
			e.printStackTrace();
		
		}//catch
	
	}
	
	public void launchBrowser()
	{	
		
		String browserName = prop.getProperty("browser");
		
		ChromeOptions options = new ChromeOptions();
		//options.setPageLoadStrategy(PageLoadStrategy.NONE);
		//options.addArguments("start-maximized"); 
		
		if(browserName.equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laksh\\eclipse-workspace\\SeleniumMavenFrameworkCreation\\MavenDemoTest\\src\\main\\resources\\chromedriver.exe");
			
			driver = new ChromeDriver(options);
			
			driver.manage().window().maximize();
			
		}//if
		
		else if(browserName.equals("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Laksh\\eclipse-workspace\\FreeSampleProject\\src\\main\\resources\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			
		}//else if
	
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			
	}//launchBrowser

	
}
