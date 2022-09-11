package com.delta.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruDOMStructure {
	
	public static void main(String[] args) {
		
		// Configure the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aastha\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
				
		// Launch the browser
		WebDriver wd = new ChromeDriver();
				
		// To get specific url
        wd.get("https://demo.guru99.com/test/guru99home/");
        
	    // Switch to frame - 4 different ways
        // id
        wd.switchTo().frame("a077aa5e");
        
//        // name
//        wd.switchTo().frame("a077aa5e");
//        
//        // WebElement
//        WebElement ele = wd.findElement(By.xpath("//iframe[@name ='a077aa5e']"));
//       wd.switchTo().frame(ele);
//       
//       // index
//       wd.switchTo().frame(6);
       
       WebElement image = wd.findElement(By.xpath("//img[@src='Jmeter720.png']"));
       image.click();
       
       // Total count of iframes
       List<WebElement> frames = wd.findElements(By.tagName("iframe"));
       int frameCount = frames.size();
       System.out.println(frameCount);
       
       // To get into inner frames
       if(frameCount>0) {
    	   wd.switchTo().frame(0);
    	   wd.findElement(By.id("email")).sendKeys("Email");
       }
       
       if(frameCount>0) {
    	   wd.switchTo().frame(1);
    	   wd.findElement(By.id("pass")).sendKeys("password");
       }

       if(frameCount>0) {
    	   wd.switchTo().frame(2);
    	   wd.findElement(By.id("login")).click();
       }

       // Total 8 iframes 1st to 8th frame
       wd.switchTo().frame(7);
       
       // 8th frame - 8th to 1st frame
       wd.switchTo().parentFrame(); // 8th parent frame is 7
       wd.switchTo().parentFrame(); // 7th parent frame is 6
       wd.switchTo().parentFrame(); // 6th parent frame is 5
       wd.switchTo().parentFrame(); // 5th parent frame is 4
       wd.switchTo().parentFrame(); // 4th parent frame is 3
       wd.switchTo().parentFrame(); // 3th parent frame is 2
       wd.switchTo().parentFrame(); // 2th parent frame is 1
       
       // Totally 2 frames - 2md to 1st
       wd.switchTo().defaultContent();
		
	}

}
