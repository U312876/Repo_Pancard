package com.automation.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CNN_Locators {
	
	WebDriver driver = null;
	@BeforeTest
	public void OpenBrowser() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cnn.com/");
		Thread.sleep(2000);
	}
	@Test
	public void Testing() throws Exception{
		driver.findElement(By.linkText("Sports")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("NBA")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Tickets")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.className("NoLocalEvents")).getText());
		Thread.sleep(2000);
	}
	@AfterTest
	public void CloseBrowser() {
		driver.quit();
		
	}

}
