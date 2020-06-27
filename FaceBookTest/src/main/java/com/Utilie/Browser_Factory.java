package com.Utilie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser_Factory {
	
	public static Properties prop ;
	static WebDriver driver;
	
	public static String readconfig(String key) {
		
		prop = new Properties();
		
		try {
			prop.load(new FileInputStream("src/main/java/ConfigurationDetailes/Config.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(key);
		
	}
	
	public static void Lunch_Browser() {
		
String browser = prop.getProperty("browser");
		
		if(browser.toUpperCase().equals("CHROME")) {
			
			driver = new ChromeDriver();
			
		}else if(browser.toUpperCase().equals("FIREFOX")) {
			
			driver = new FirefoxDriver(); 
		}else {
			
			driver = new InternetExplorerDriver();
		}
		
		driver.get("url");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TimeOut.TIME_IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TimeOut.TIME_PAGE_WAIT, TimeUnit.SECONDS);
		
		
		
		
		

	}
		
	}


