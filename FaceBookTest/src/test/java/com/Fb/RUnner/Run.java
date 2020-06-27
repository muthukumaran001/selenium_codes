package com.Fb.RUnner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/java/folder/Fb.feature"},
		
		
		glue = {"com.Fb.step"}
		
		)
public class Run {

}
