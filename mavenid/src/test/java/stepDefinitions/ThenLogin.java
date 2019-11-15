package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;


public class ThenLogin {
	WebDriver driver = GivenLogin.driver;
	
	//tag1
	/*
	@Then("User should be in profile page")
	public void user_should_be_in_profile_page() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(driver.getCurrentUrl(),"http://automationpractice.com/index.php?controller=my-account","Error");
		driver.quit();
		*/
		
	//tag2
	@Then("Should see an error message {string}")
	public void should_see_an_error_message(String InEmail) {
	    String err = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
	    System.out.println("err" + err); 
		err.equals(InEmail);
		//driver.quit();
	}	 
		 
	}
	
	
	
	
	/*
	@Then("User shouldn?t advance to the next page")
	public void user_shouldn_t_advance_to_the_next_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user shouldnt advance");
	}

	@Then("Should see an error message")
	public void should_see_an_error_message() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("should see an error");
	}
	
	@Then("User should go to the retrive password page")
	public void user_should_go_to_the_retrive_password_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User should go to retrive password page");
	}
	
	@Then("New user enters valid email")
	public void new_user_enters_valid_email() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user enters valid email");
	}

	@Then("New user clics in create account button")
	public void new_user_clics_in_create_account_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("new user creates a new accoun");
	}

	@Then("New user should go to the next page")
	public void new_user_should_go_to_the_next_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("new user should go to the next page");
	}

	@Then("contiunue with the registration")
	public void contiunue_with_the_registration() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User continues with the registration");
	}

	@Then("New user enters invalid email")
	public void new_user_enters_invalid_email() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User enters invalid email");
	}

	@Then("New user shouldn?t go to the next page")
	public void new_user_shouldn_t_go_to_the_next_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User shouldnt go to the next page");
	}

	@Then("see an error message")
	public void see_an_error_message() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User sees an error");
	}

	@Then("User enters already existing email")
	public void user_enters_already_existing_email() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User enters already existing email");
	}

	@Then("User clics in create account button")
	public void user_clics_in_create_account_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User creates account");
	}

	@Then("User sees an error message")
	public void user_sees_an_error_message() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User sees an error message");
	}*/
