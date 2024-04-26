package com.allianz.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;
import com.allianz.pages.LoginPage;

public class PatientTest extends AutomationWrapper {

	@Test
	public void addValidPatientTest()
	{
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUsername("admin");
		loginPage.enterPassword("pass");
		loginPage.clickOnLogin();
		
		//AUTOMATE DIRECTLY USING driver.findlement and do assertion
		//then move to page object class
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("")));
		
		//enter firstname
		driver.findElement(By.id("")).sendKeys("jack");
		
		
	}
}
