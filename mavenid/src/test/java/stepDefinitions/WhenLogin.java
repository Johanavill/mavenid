package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.When;

public class WhenLogin {
	WebDriver driver = GivenLogin.driver;
	
	//tag1
	/*
	@When("User enters valid Email address {string}")
	public void user_enters_valid_Email_address(String email) {
	    // Write code here that turns the phrase above into concrete actions
		  //System.out.println("User entered valid Email");
		driver.findElement(By.id("email")).sendKeys(email);
		
	}

	@When("User enters valid password {string}")
	public void user_enters_valid_password(String password) {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println("User entered valid password");
		driver.findElement(By.id("passwd")).sendKeys(password);
	}

	@When("User clicks sign in button")
	public void user_clicks_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println("User clicked sign in button");
		driver.findElement(By.id("SubmitLogin")).click();
	}*/
	
	//tag2
	@When("User enters invalid Email address {string}")
	public void User_enters_invalid_Email_address(String email) {
	    // Write code here that turns the phrase above into concrete actions
		  //System.out.println("User entered valid Email");
		driver.findElement(By.id("email")).sendKeys(email);
	}
	
	@When("User enters valid password {string}")
	public void user_enters_valid_password(String password) {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println("User entered valid password");
		driver.findElement(By.id("passwd")).sendKeys(password);
	}
	
	@When("User clicks sign in button")
	public void user_clicks_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println("User clicked sign in button");
		driver.findElement(By.id("SubmitLogin")).click();
	}
}
	
	
/*	
	//
	@When("User clics sign in button")
	public void user_clics_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User clics sign button");
	}

	@When("User enters invalid email address")
	public void user_enters_invalid_email_address() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User enters invalid address");
	}
	
	@When("User enters valid email address")
	public void user_enters_valid_email_address() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User enters valid email");
	}

	@When("User enters invalid password")
	public void user_enters_invalid_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User entrs invalid password");
	}

	@When("User doesn?t know the password")
	public void user_doesn_t_know_the_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User dosnt know the password");
	}

	@When("User clics on Forgot your password? button")
	public void user_clics_on_Forgot_your_password_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User clics forgot password");
	}


}*/
