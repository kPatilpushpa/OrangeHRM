package com.orangeHRM.testCases;

import org.openqa.selenium.By;
import com.orangeHRM.Base.BaseTest;

public class AddUser extends BaseTest
{
	public void AddUserMethod()
	{
		driver.findElement(By.xpath(loc.getProperty("adduser_userrole"))).click();
		driver.findElement(By.xpath(loc.getProperty("adduser_status"))).click();
		driver.findElement(By.xpath(loc.getProperty("adduser_status_enabled"))).isEnabled();
		
		driver.findElement(By.xpath(loc.getProperty("adduser_password"))).sendKeys("123456");
		driver.findElement(By.xpath(loc.getProperty("adduser_confirmpwd"))).sendKeys("123456");
		driver.findElement(By.xpath(loc.getProperty("adduse_empname"))).sendKeys("seema");
		driver.findElement(By.xpath(loc.getProperty("adduse_username"))).sendKeys("seema");
		driver.findElement(By.xpath(loc.getProperty("adduser_savebtn"))).click();
		driver.findElement(By.xpath(loc.getProperty("adduser_cancelbtn"))).click();
		
	}

}
