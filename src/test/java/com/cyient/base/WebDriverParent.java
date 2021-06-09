package com.cyient.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WebDriverParent {

	protected WebDriver driver;
	
	@BeforeMethod
	public void startUp() {
		String browser = "chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\driver\\geckodriver.ex");
			driver = new ChromeDriver();
		}
		else {
			System.setProperty("webdriver.ie.driver", "src\\test\\resources\\driver\\IEDriverServer.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.royalcaribbean.com/");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
