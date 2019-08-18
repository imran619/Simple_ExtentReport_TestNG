package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import config.WebDriverConfig;

public class SeleniumGoogleSearch extends WebDriverConfig {

	@Test(priority = 0)
	public void searchForWebsitePassingTest() {

		WebDriverConfig.driver.findElement(By.name("q")).sendKeys("Selenium\n");
		assertEquals(WebDriverConfig.driver.getTitle(), "Selenium - Google Search");

	}

	@Test(priority = 1)
	public void searchForWebsiteFailingTest() {

		WebDriverConfig.driver.findElement(By.name("q")).sendKeys("Selenium\n");
		assertEquals(WebDriverConfig.driver.getTitle(), "Selenium - Google");

	}

}
