package com.weightwatcher.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.weightwatcher.uat.WW.Home;

public class HomeTest {

	@Test

	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\AUTO\\chromedriver.exe");

		// 1. Navigate to https://www.weightwatchers.com/us/
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.weightwatchers.com/us/");

		Home login = new Home(driver);

		// 2. Verify loaded page title matches “Weight Loss Program, Recipes & Help |
		// Weight Watchers”

		String title = login.getHomeTitle();
		AssertJUnit.assertEquals(title, "WW (Weight Watchers): Weight Loss & Wellness Help");

		// 3. On the right corner of the page, click on “Find a Meeting”
		login.clickFindAstore();

		// 4. Verify loaded page title contains “Get Schedules & Times Near You”
		login.getMeetingPageContainsTitle();

		// 5. In the search field, search for meetings for zip code: 10011
		login.getZipCode();

		// 7. Click on the first search result and then, verify displayed location name
		// matches with the name of the

		login.clickLocation();

		// 8. From this location page, print TODAY’s hours of operation (located towards
		// the bottom of the page)
		login.getLocationName();

		driver.quit();

	}

}
