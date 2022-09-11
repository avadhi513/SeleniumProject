package com.delta.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	private static final By By = null;

	public static void main(String[] args) {
		
		// Configure the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aastha\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		
		// Launch the browser
		WebDriver wd = new ChromeDriver();
		
		// To get specific url
		wd.get("https://www.facebook.com/");
		
		// To print the title in the console 
		String tit = wd.getTitle();
		System.out.println(tit);
		
		// To get the current url in the console
		String cu = wd.getCurrentUrl();
		System.out.println(cu);		
		
//		// To close the webpage
//		wd.quit();
		
		// Find the locator
		WebElement txtMail =  wd.findElement(By.xpath("//input[@type='text']"));
		txtMail.sendKeys("Java");
		String att = txtMail.getAttribute("value");
		System.out.println(att);
		
		WebElement txtPwd = wd.findElement(By.xpath("//input[@type='password']"));
		txtPwd.sendKeys("Java");
		String att1 = txtPwd.getAttribute("class");
		System.out.println(att);
		
		WebElement btn = wd.findElement(By.xpath("//input[@name='login']"));
		btn.click();
		
		WebElement txt = wd.findElement(By.xpath("//a[text()='Create a Page']"));
		String t = txt.getText();
		System.out.println(t);
		
		WebElement para = wd.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
		String p = para.getText();
		System.out.println(p);
		
	}
	

}
