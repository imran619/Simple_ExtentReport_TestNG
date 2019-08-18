package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import listeners.ExtentITestListenerClassAdapter;

@Listeners({ ExtentITestListenerClassAdapter.class })
public class WebDriverConfig {
	public static WebDriver driver;
	public WebDriverWait wait;

	@BeforeMethod
	public static void initialization() throws Throwable {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	@AfterMethod
	public void tearDown() {

		WebDriverConfig.driver.close();
		WebDriverConfig.driver.quit();
	}

}
