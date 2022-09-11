package com.delta.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	
	public static void main(String[] args) {
		
		// Configure the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aastha\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
						
		// Launch the browser
		WebDriver wd = new ChromeDriver();
						
		// To get specific url
		wd.get("https://demo.guru99.com/test/drag_drop.html");		
		
		Actions acc = new Actions(wd);
		WebElement cred1 = wd.findElement(By.id("credit2"));
		WebElement b1 = wd.findElement(By.id("bank"));
		
		acc.dragAndDrop(cred1, b1).perform();
		
		WebElement cred2 = wd.findElement(By.id("fourth"));
		WebElement b2 = wd.findElement(By.id("amt7"));
		
		acc.dragAndDrop(cred2, b2).perform();
		
	}

}
