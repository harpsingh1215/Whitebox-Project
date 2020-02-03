package com.qa.whitebox.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.whitebox.base.BasePage;
import com.qa.whitebox.pages.HomePage;
import com.qa.whitebox.pages.LoginPage;
import com.qa.whitebox.pages.SchdulePage;

public class SchduleTestPage {

	
	
	
	public BasePage basePage;
	public WebDriver driver;
	public Properties prop;

	public LoginPage loginPage;

	public SchdulePage schdulePage;

	@BeforeMethod 
	public void setUp() throws InterruptedException {

		basePage= new BasePage();
		prop = basePage.initialize_Properties();
		driver = basePage.initialize_driver();

		driver.get(prop.getProperty("url"));
		loginPage = new LoginPage(driver);
		//homePage = new HomePage(driver);
		schdulePage = new SchdulePage(driver);
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		}
	
@Test

public void verifynavigateToFeaturePageLink() {
	
	
	schdulePage.navigateToFeaturePageLink();
}
	

	
	//@AfterMethod
	//public void tearDown() {

		//driver.quit();
//}
	
}
