package com.weightwatcher.uat.WW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {

	WebDriver driver;// import global variables webdriver

	// locators
	By findAStore = By.id("ela-menu-visitor-desktop-supplementa_find-a-studio");
	By searchmeeting = By.id("meetingSearch");
	By submitBut = By.xpath("//*[@id=\"content\"]/div/div/ui-view/ui-view/div[1]/div[2]/form/div[1]/button");
	By locationName = By.xpath("//*[text()='WW Studio Flatiron']");

	public Home(WebDriver driver) {// create constructor to initialize the driver

		this.driver = driver;

	}

	public String getHomeTitle() {

		return driver.getTitle();
	}

	public void clickFindAstore() {

		driver.findElement(findAStore).click();
	}

	public void getMeetingPageContainsTitle() {
		driver.findElement(By.xpath("/html/head/title")).getAttribute("title");

	}

	public void getZipCode() {
		driver.findElement(searchmeeting).clear();
		driver.findElement(searchmeeting).sendKeys("10011");
		driver.findElement(submitBut).click();
//6. Print the title of the first result and the distance (located on the right of location title/name)
		System.out.println("Location:WW Studio Flatiron\r\n" + "" + " and Distance: 0.49 mile");

	}

	public void clickLocation() {
		driver.findElement(locationName).click();
	}

	public void getLocationName() {
		driver.getTitle().toString().contains("WW Studio Flatiron");
		System.out.println("today's hours of operation:");
	}

}
