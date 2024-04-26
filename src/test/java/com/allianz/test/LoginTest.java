package com.allianz.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;
import com.allianz.pages.LoginPage;
import com.allianz.pages.MainPage;
import com.allianz.utils.DataUtils;

public class LoginTest extends AutomationWrapper {

	@Test(dataProvider = "commonDataProvider",dataProviderClass = DataUtils.class)
	public void validLoginTest(String username, String password, String expectedTitle) {
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickOnLogin();
		
		MainPage mainPage=new MainPage(driver);
		String actualTitle = mainPage.getMainPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(dataProvider = "commonDataProvider",dataProviderClass = DataUtils.class)
	public void invalidLoginTest(String username,String password,String expectedError) {
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickOnLogin();

		String actualError = loginPage.getInvalidError();
		Assert.assertTrue(actualError.contains(expectedError)); // expect true
	}
}
