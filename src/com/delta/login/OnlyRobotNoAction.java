package com.delta.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlyRobotNoAction {
	
	public static void main(String[] args) throws AWTException {
		
		// Configure the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aastha\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
				
		// Launch the browser
		WebDriver wd = new ChromeDriver();
				
		// To get specific url
		wd.get("https://www.facebook.com/");
		
		Robot r = new Robot();
		
		WebElement txtEmail = wd.findElement(By.id("email"));
		txtEmail.sendKeys("1234566");
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

        r.keyPress(KeyEvent.VK_TAB);	
		r.keyRelease(KeyEvent.VK_TAB);
		
		WebElement pwd = wd.findElement(By.name("pass"));
		pwd.click();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);	
		
	}

}
