package com.Fb.step;

import com.Fb.Pages.LoginPage;
import com.Utilie.Browser_Factory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FBTest extends Browser_Factory {
	
	
	@Given ("the user get into facebook")
	public static void  the_user_get_into_facebook(String key) {
		
		Browser_Factory.Lunch_Browser();
		
	}
	@When ("Enter the detailes")
	public static void  Enter_the_detailes () {
		
		LoginPage.LOgIN_DEt();
		
	}
		
		
	}

