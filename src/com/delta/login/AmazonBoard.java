package com.delta.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBoard {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		// Configure the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aastha\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
				
		// Launch the browser
		WebDriver wd = new ChromeDriver();
				
		// To get specific url
        wd.get("https://www.amazon.in/");
        
        WebElement searchb = wd.findElement(By.id("twotabsearchtextbox"));
        searchb.sendKeys("Iphone 13");
        
        Robot r = new Robot();
			
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement iphn = wd.findElement(By.xpath("//span[text()='Apple iPhone 13 (256GB) - Midnight']"));
		iphn.click();
		
		// parent window id - 1
		String pwid = wd.getWindowHandle();
		System.out.println(pwid);
		
		// child window id - 1 & 2
		Set<String> all = wd.getWindowHandles();
		System.out.println(all);
		
		for(String x : all) { // - 1, 2

			if(!pwid.equals(x)) {
				
				wd.switchTo().window(x);
				
			}
		}
		
		Thread.sleep(3000);
		WebElement cart = wd.findElement(By.id("add-to-cart-button"));
		cart.click();
		
	}

}
