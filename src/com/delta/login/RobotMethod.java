package com.delta.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotMethod {
	
	public static void main(String[] args) throws AWTException {
		
		// Configure the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aastha\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
				
		// Launch the browser
		WebDriver wd = new ChromeDriver();
				
		// To get specific url
		wd.get("https://www.facebook.com/");
		
		Actions acc = new Actions(wd);
		WebElement txtEmail = wd.findElement(By.id("email"));
		txtEmail.sendKeys("1234566");
		
		acc.doubleClick(txtEmail).contextClick(txtEmail).build().perform();

		Robot r = new Robot();
				
		for(int i=0; i<3; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
				
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement pwd = wd.findElement(By.name("pass"));
		pwd.click();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
	}

}
