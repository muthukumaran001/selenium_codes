package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import browserFactory.amazonBrowser;

public class HomePage extends amazonBrowser {
	
	WebDriver driver;
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="twotabsearchtextbox")
	static
	WebElement SearchBox;
	
	public void SearchProduct() {
		
		SearchBox.sendKeys("mobile");

	}
}
