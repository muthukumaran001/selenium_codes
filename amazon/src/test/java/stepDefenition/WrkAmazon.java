package stepDefenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.amazon.pages.HomePage;

import browserFactory.amazonBrowser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WrkAmazon extends HomePage {
	
	WebDriver driver;
	
	@Given("go to the amazon App")
	public void Go_to_the_amazon_App() {
		
		amazonBrowser.LunchBrowser();
		
	}
	
	@When ("I Find the Text Box Search for")
	public void I_Find_the_Text_Box_Search_for() {
	}	
		
		
}