package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\besch\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement phone = driver.findElement(By.id("email"));
		phone.sendKeys("dsjfgkdfghoi");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("hsfjhv");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
	}

}
