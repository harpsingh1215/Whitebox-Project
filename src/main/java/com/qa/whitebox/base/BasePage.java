package com.qa.whitebox.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

	public WebDriver driver;
	public Properties  prop;
	
	
	public WebDriver initialize_driver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aman\\Desktop\\eclipseOxygenPortable\\eclipseOxygen\\Workspace\\WhiteBox\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
		driver.get("http://whiteboxqa.com/login.php");
		
		
		return driver;
	
	}
	
	public Properties initialize_Properties() {
		prop = new Properties();
		
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\Aman\\Desktop\\eclipseOxygenPortable\\eclipseOxygen\\Workspace\\WhiteBox\\src\\main\\java\\com\\qa\\whitebox\\config\\config.properties");
		prop.load(ip);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return prop;
		
		
	}
	
	
}
