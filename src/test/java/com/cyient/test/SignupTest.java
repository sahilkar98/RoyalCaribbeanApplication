package com.cyient.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverParent;

public class SignupTest extends WebDriverParent {

	@Test
	public void signInTest() {

		driver.findElement(By.xpath("//div[@class='email-capture__body']//*[local-name()='svg']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create an account')]")).click();
		driver.findElement(By.xpath("//input[@id='mat-input-3']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@id='mat-input-4']")).sendKeys("XYZ");
		driver.findElement(By.xpath("//span[contains(text(),'Month')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),' March ')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Day')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),' 16 ')]")).click();
		driver.findElement(By.xpath("//input[@id='mat-input-5']")).sendKeys("1998");
		driver.findElement(By.xpath("//span[contains(text(),'Country/Region of residence')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),' India ')]")).click();
		driver.findElement(By.xpath("//input[@data-placeholder='Email address']")).click();
		driver.findElement(By.xpath("//input[@data-placeholder='Email address']")).sendKeys("sahil113459@gmail.com");
		// driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ABC@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1ABC@XYZ.com");
		driver.findElement(By.xpath("//span[contains(text(),'Select one security question')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),' What was the name of your first pet? ')]")).click();
		driver.findElement(By.xpath("//input[@id='mat-input-7']")).sendKeys("chloe");
		driver.findElement(
				By.xpath("//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']"))
				.click();
		driver.findElement(By.xpath("//button[contains(text(),' Done ')]")).click();

		Assert.assertEquals(driver.getTitle(), "Royal Caribbean");
	}
}
