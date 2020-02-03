package com.qa.whitebox.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.whitebox.base.BasePage;
import com.qa.whitebox.pages.LoginPage;

public class LoginTest {

	public BasePage basePage;
	 public WebDriver driver;
	public Properties prop;
	
	public LoginPage loginPage;
	
	@BeforeMethod 
	public void setUp() throws InterruptedException  {
	
		basePage= new BasePage();
	 prop = basePage.initialize_Properties();
	 driver = basePage.initialize_driver();
		
	driver.get(prop.getProperty("url"));
	 loginPage = new LoginPage(driver);
	
	}
	
	@Test(priority = 1)
	
	public void loginCorrectCredentialsTest() {
	
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	
	@Test(priority = 2)
	public void navigateToHomePage() {
		
   loginPage.navigateToHomePage();
	
	}
   @AfterMethod
	
	public void tearDown() {
		
		driver.quit();
	}
}
