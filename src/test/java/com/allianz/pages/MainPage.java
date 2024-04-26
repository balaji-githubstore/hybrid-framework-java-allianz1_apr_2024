package com.allianz.pages;

import org.openqa.selenium.WebDriver;

/**
 * This class handles all menu and other common elements inside the portal
 */
public class MainPage {

	private WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnMessagesMenu() {

	}

	public String getMainPageTitle() {
		return driver.getTitle();
	}

	public void clickOnPatientMenu() {

	}

	public void clickOnNewSearcHMenu() {

	}

}
