package com.Fb.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utilie.Browser_Factory;

import net.bytebuddy.asm.Advice.This;

public class LoginPage extends Browser_Factory {
	
	WebDriver driver;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, This.class);
		
	}
	
		
	
	@FindBy(id="u_0_m")
	static
	WebElement First_Name;
	
	@FindBy(className = "inputtext _58mg _5dba _2ph-")
	static
	WebElement Last_Name;
	
	@FindBy(xpath = "//input[@id='u_0_r']")
	static
	WebElement mail_ID;
	
	@FindBy(xpath = "//input[@id='u_0_w']")
	static
	WebElement password;
	
	
	public static void LOgIN_DEt() {
		
		First_Name.sendKeys(prop.getProperty("First_Name"));
		Last_Name.sendKeys(prop.getProperty("Last_name"));
		mail_ID.sendKeys(prop.getProperty("Mail"));
		password.sendKeys(prop.getProperty("Pwd"));

	}

}
