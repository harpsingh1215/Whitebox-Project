package com.qa.whitebox.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.whitebox.base.BasePage;

public class HomePage extends BasePage {

	
	
	
	
	
	
	
	
	@FindBy(id = "password")
	WebElement password ;

	@FindBy(id = "login")

	WebElement LoginButton;

	@FindBy(id = "username")
	
	WebElement username;
	
	
@FindBy(xpath = "//*[@id=\"navbar-collapse\"]/ul/li[1]/a")
	
    WebElement HomePageLink;


	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public  void login(String un,String pwd) {
		 
		 
		 username.sendKeys(un);
		 
		 password.sendKeys(pwd);
		 
		 LoginButton.click();
		 
		 
		 }
	
	
	public void  navigateToHomePage() {
		
	WebDriverWait wait = new WebDriverWait(driver,200);
		
	
			wait.until(ExpectedConditions.elementToBeClickable(HomePageLink)).click();
		    HomePageLink.click();
		
	 
		
	}
	
	public String getHomePageTitle() {
		
		
	 return driver.getTitle();
		
		
	}
	
}
