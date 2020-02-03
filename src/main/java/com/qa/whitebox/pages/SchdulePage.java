package com.qa.whitebox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.whitebox.base.BasePage;

public class SchdulePage extends BasePage {

	@FindBy(xpath="//a[text()='Schedule']")

	WebElement FeatureLink;

public SchdulePage (WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


public void navigateToFeaturePageLink() {
	
	//WebDriverWait wait = new WebDriverWait(driver,200);
	
	
	//wait.until(ExpectedConditions.elementToBeClickable(FeatureLink)).click();
	FeatureLink.click();
	
}


}
