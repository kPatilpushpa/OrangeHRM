package com.orangeHRM.testCases;

import org.openqa.selenium.By;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangeHRM.Base.BaseTest;
import com.orangeHRM.utilities.ReadXLSdata;

public class MyLoginTest extends BaseTest
{
	@Test(dataProviderClass =ReadXLSdata.class,dataProvider ="hrmdata")
	public static void LoginTest(String usernmae, String password) throws InterruptedException
	{
		
		CharSequence username = null;
		driver.findElement(By.xpath(loc.getProperty("UN_field"))).sendKeys(username);
		//Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("pwd_field"))).sendKeys(password);
		driver.findElement(By.xpath(loc.getProperty("login_btn"))).click();
		//Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("admin_mod"))).click();
		
	}
	

	
		}
	


