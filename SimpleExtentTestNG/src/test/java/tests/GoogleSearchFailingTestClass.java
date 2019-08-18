package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import config.WebDriverConfig;

public class GoogleSearchFailingTestClass extends WebDriverConfig {
	
	@Test(priority = 1)
	public void searchForWebsiteFailingTest() {

		WebDriverConfig.driver.findElement(By.name("q")).sendKeys("Selenium\n");
		assertEquals(WebDriverConfig.driver.getTitle(), "Selenium - Google");

	}

}
