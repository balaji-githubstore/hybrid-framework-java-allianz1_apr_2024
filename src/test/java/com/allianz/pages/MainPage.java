package com.allianz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * This class handles all menu and other common elements inside the portal
 */
public class MainPage {

	private WebDriver driver;
	private By patientLocator=By.xpath("//div[text()='Patient']");
	private By newSearchLocator=By.xpath("New/Search");

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnMessagesMenu() {

	}

	public String getMainPageTitle() {
		return driver.getTitle();
	}

	public void clickOnPatientMenu() {
		driver.findElement(patientLocator).click();
	}

	public void clickOnNewSearcHMenu() {
		driver.findElement(newSearchLocator).click();
	}

}
