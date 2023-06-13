package com.orangeHRM.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseTest
{
	public static WebDriver driver;
	public static Properties pro=new Properties();
	public static Properties loc=new Properties();
	public static FileReader fr;
	public static FileReader fr1;
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		if(driver==null)
		{
			fr=new FileReader("D:\\Selenium\\OrangeHRMProject\\src\\test\\resources\\configFiles\\config.properties");
			 fr1=new FileReader("D:\\Selenium\\OrangeHRMProject\\src\\test\\resources\\configFiles\\locators.properties");
			pro.load(fr);
			loc.load(fr1);
		}
		if(pro.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			//WebDriverManger.ChromeDriver().setup();
			driver=new ChromeDriver();
			driver.get(pro.getProperty("testUrl"));
		}
		else if(pro.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			//WebDriverManger.ChromeDriver().setup();
			//driver=new FireFoxDriver();
		}
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		System.out.println("tearDown Successfull");
		
	}
}
