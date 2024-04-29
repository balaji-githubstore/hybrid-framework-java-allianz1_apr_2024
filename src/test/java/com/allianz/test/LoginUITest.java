package com.allianz.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;

public class LoginUITest extends AutomationWrapper {

	@Test(groups = {"ui","smoke"})
	public void titleTest() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "OpenEMR Login");
	}

	@Test(groups = {"ui"})
	public void appDescriptionTest() {
		String actualDesc = driver.findElement(By.xpath("//p[contains(text(),'most')]")).getText();
		Assert.assertEquals(actualDesc,
				"The most popular open-source Electronic Health Record and Medical Practice Management solution.");
	}

}
