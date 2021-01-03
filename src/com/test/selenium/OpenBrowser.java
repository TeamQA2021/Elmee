package com.test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
 public static void main(String[] args) {
	

		
		System.setProperty("webdriver.chrome.driver","‪C:\\Users\\Elmee\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

}
