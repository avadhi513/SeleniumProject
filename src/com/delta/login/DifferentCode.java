package com.delta.login;

import org.openqa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.*;
import com.thoughtworks.selenium.*;
//import org.junit.Before;

public class DifferentCode {

	public Selenium selenium;
	public WebDriver driver;

	@Before
	public void setup() throws Exception {
		driver = new FirefoxDriver();
		driver.get("http://www.fb.com");
	}

	@Test
	public void Test() throws Exception {
		// selenium.type("id=gs_htif0", "test");
		System.out.println("hi");
		// driver.findElement(By.cssSelector("#gb_1 > span.gbts")).click();
		selenium.waitForPageToLoad("300000000");

		WebElement email = driver.findElement(By.id("email"));

		email.sendKeys("nshakuntalas@gmail.com");
		driver.findElement(By.id("u_0_b")).click();
	}

	@After
	public void Close() throws Exception {
		System.out.println("how are you?");
	}

}
