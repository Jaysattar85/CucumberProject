package Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\junai\\Downloads\\Eclipse\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\features\\login.feature" 
				,glue= "" )
public class LoginRunner {

	

}
