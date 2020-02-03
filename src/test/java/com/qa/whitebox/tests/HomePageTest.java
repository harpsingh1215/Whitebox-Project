package com.qa.whitebox.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.whitebox.base.BasePage;
import com.qa.whitebox.pages.HomePage;
import com.qa.whitebox.pages.LoginPage;

public class HomePageTest {



	public BasePage basePage;
	public WebDriver driver;
	public Properties prop;

	public LoginPage loginPage;

	public HomePage homePage;

	@BeforeMethod 
	public void setUp() throws InterruptedException {

		basePage= new BasePage();
		prop = basePage.initialize_Properties();
		driver = basePage.initialize_driver();

		driver.get(prop.getProperty("url"));
		//loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		homePage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
//@Test(priority = 1)
//	
//	public void loginCorrectCredentialsTest() {
//	
//		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//}

	@Test(priority = 1)
	public void navigateHomePageLink() {
		
     homePage.navigateToHomePage();

	}
	
	@Test(priority = 2)
    
    public void verifyHomePageTitle(){
    	
    	String title = homePage.getHomePageTitle();
    	
    	System.out.println("the home pge title is " +title);
    	
   Assert.assertEquals("QA/QE/SDET Training.", title);
	
   
   
   
	}
	
	




	
	@AfterMethod
	public void tearDown() {

		driver.quit();
	}
}




