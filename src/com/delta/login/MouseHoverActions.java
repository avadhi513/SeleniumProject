package com.delta.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {
	
	public static void main(String[] args) throws AWTException {
		
		// Configure the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aastha\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
				
		// Launch the browser
		WebDriver wd = new ChromeDriver();
				
		// To get specific url
		wd.get("https://www.snapdeal.com/");
				
		Actions acc = new Actions(wd);
		
		WebElement mous1 = wd.findElement(By.xpath("//span[text()='Books, Media & Music']"));
		acc.moveToElement(mous1).perform();
		
		WebElement mous2 = wd.findElement(By.xpath("//span[text()='Electronics']"));
		acc.moveToElement(mous2).perform();
		
		WebElement head = wd.findElement(By.xpath("//span[text()='Headphones']"));
		acc.moveToElement(head).click();
		
	}

}
