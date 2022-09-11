package com.delta.login;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LibGlobal {

	public static WebDriver driver;

	public static Actions acc;

	public static WebDriver getDriver() {

		// System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+
		// "\\driver\\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aastha\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public static void maximize() {
		driver.manage().window().maximize();

	}

	public static void loadUrl(String url) {
		driver.get(url);
		maximize();

	}

	public static void type(WebElement element, String data) {
		element.sendKeys(data);

	}

	public static void btnClick(WebElement element) {
		element.click();

	}

	public static void quit() {
		driver.quit();

	}

	public static void typeJs(WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value' " + data + ")", element);

	}

	public static void btnClickJs(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click", element);

	}

	public String getValueByText(WebElement element) {
		return element.getText();

	}

	public String getAttributeValue(WebElement element) {
		return driver.getCurrentUrl();

	}

	public static void getUrl(String url) {
		driver.get(url);

	}

	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	public static void PageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	public static void mouseDragandDrop(WebElement src, WebElement des) {
		acc = new Actions(driver);
		acc.dragAndDrop(src, des).perform();

	}

	public static void mouseDoubleClick(WebElement element) {
		acc.doubleClick(element).perform();

	}

	public static void mouseRightClick(WebElement element) {
		acc.contextClick(element).perform();

	}

}
