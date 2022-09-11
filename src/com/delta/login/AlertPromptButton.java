package com.delta.login;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPromptButton {
	
	public static void main(String[] args) throws InterruptedException {
		
		// Configure the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aastha\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
				
		// Launch the browser
		WebDriver wd = new ChromeDriver();
				
		// To get specific url
		wd.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");

		WebElement logInBtn = wd.findElement(By.xpath("//input[@value='SIGN IN']"));
		logInBtn.click();
		
		// Switch To Alert
		Thread.sleep(2000);
		Alert al = wd.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
		al.accept();
		
		// Confirm Alert
		al.accept();
		
		// cancel
		al.dismiss();
		
		// Prompt Alert
		al.sendKeys("OK");
		al.accept();
		
		// Prompt Cancel
		al.sendKeys("cancel");
		al.dismiss();
		
	}

}
