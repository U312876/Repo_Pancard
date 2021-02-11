package com.automation.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThePancard_Locators {
	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thepancard.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Apply New PAN Card")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("rblCategory_0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("rblCategory_1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("txtDOB")).sendKeys("01/01/2000");
		Thread.sleep(2000);
		driver.findElement(By.id("rblGender_1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("proof_dob")).sendKeys("Birth Certificate");
		Thread.sleep(2000);
		driver.findElement(By.id("ddlPOI")).sendKeys("AADHAAR Card issued by UIDAI");
		Thread.sleep(2000);
		driver.findElement(By.id("ddlPOA")).sendKeys("Driving License");
		Thread.sleep(2000);
		driver.findElement(By.id("txtMobNo")).sendKeys("6125584232");
		Thread.sleep(2000);
		driver.findElement(By.id("txtAadhaarNo")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.id("aadhaar_name")).sendKeys("Sreevani");
		Thread.sleep(2000);
		driver.findElement(By.id("ddlIncomeSource")).sendKeys(" Salary");
		Thread.sleep(2000);
		driver.findElement(By.id("txtOffName")).sendKeys("Wells");
		Thread.sleep(2000);
		driver.findElement(By.id("txtOffNo")).sendKeys("16887");
		Thread.sleep(2000);
		driver.findElement(By.id("txtOffPremises")).sendKeys("Lakeville");
		Thread.sleep(2000);
		driver.findElement(By.id("ddlOffCity")).sendKeys("Minneaplois");
		Thread.sleep(2000);
		driver.findElement(By.id("agreeproof")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("agree_check")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ddlPlace")).sendKeys("Lakeville");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		driver.close();
	}
	

}
