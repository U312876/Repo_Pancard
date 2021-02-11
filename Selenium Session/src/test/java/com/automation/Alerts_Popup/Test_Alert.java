package com.automation.Alerts_Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

// Alert Methods
// 1.accept()
// 2.dismiss()
// 3.getText()
// 4.sendkeys()

public class Test_Alert {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete14/dialogs/#");
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Show Alert")).click();
		//Thread.sleep(2000);
		//Alert a = driver.switchTo().alert();
		//System.out.println(a.getText());
		//a.accept();
		//Thread.sleep(2000);
		
		//driver.findElement(By.linkText("Show Prompt")).click();
		//Thread.sleep(2000);
		//Alert a = driver.switchTo().alert();
		//System.out.println(a.getText());
		//a.sendKeys("Sreevani");
		//a.accept();
		//Thread.sleep(2000);
		//System.out.println(driver.findElement(By.id("promptLog")).getText());
		//Thread.sleep(2000);
		
		driver.findElement(By.linkText("Show Confirm")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("confirmLog")).getText());
		driver.quit();
		
	}

}
