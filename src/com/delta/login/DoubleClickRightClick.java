package com.delta.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickRightClick {
	
	public static void main(String[] args) {
		
		// Configure the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aastha\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		
		// Launch the browser
		WebDriver wd = new ChromeDriver();
		
		// To get specific url
		wd.get("https://www.facebook.com/");
		
		Actions acc = new Actions(wd);
		WebElement txtEmail = wd.findElement(By.id("email"));
		txtEmail.sendKeys("1234566");
		
//		acc.doubleClick(txtEmail).perform();
//		acc.build().perform();
//		
//		acc.contextClick(txtEmail).perform();
//		acc.build().perform();
		
//		acc.doubleClick(txtEmail).contextClick(txtEmail).build().perform();
		
	}

}
