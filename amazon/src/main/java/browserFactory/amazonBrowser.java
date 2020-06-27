package browserFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class amazonBrowser {
	
	
	static Properties prop;
	static WebDriver driver;
	
	public static String Read_Properties(String key) {
		
		prop= new Properties();
		
		try {
			prop.load(new FileInputStream("C:\\Users\\Mani\\Desktop\\configuration\\config.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(key);
		
		
		
	}
	
	public static void LunchBrowser() {
		
		
		
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
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40000, TimeUnit.SECONDS);

	}
	
	
}
