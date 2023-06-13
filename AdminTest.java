package com.orangeHRM.testCases;

import org.openqa.selenium.By;

import com.orangeHRM.Base.BaseTest;

public class AdminTest extends BaseTest
{

	public static void SystemUser()
	{
		driver.findElement(By.xpath(loc.getProperty("admin_mod"))).click();
		driver.findElement(By.xpath(loc.getProperty("system_un"))).sendKeys("Admin");
		driver.findElement(By.xpath(loc.getProperty("system_urole"))).click();
		driver.findElement(By.xpath(loc.getProperty("urole_admin"))).isSelected();
		driver.findElement(By.xpath(loc.getProperty("system_empname"))).sendKeys("Seema Savant");
		driver.findElement(By.xpath(loc.getProperty("system_status"))).click();
		driver.findElement(By.xpath(loc.getProperty("status_enable"))).isSelected();
		driver.findElement(By.xpath(loc.getProperty("search_btn"))).click();
		driver.findElement(By.xpath(loc.getProperty("reset_btn"))).click();
		
			
	}

}