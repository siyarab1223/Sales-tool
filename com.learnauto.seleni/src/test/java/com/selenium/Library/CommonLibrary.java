package com.selenium.Library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.selenium.base.BaseClass;

public class CommonLibrary extends BaseClass {
	WebDriver driver = null;
	@Test (description="function to open browser and enter URL")
	public void openBrowser() throws Exception{ 
		driver= new FirefoxDriver();
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.xpath(returnXpath("Login","UserName_EditBox"))).sendKeys("Admin");
	}
	
}
