package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;


public class GivenLogin {
	public static WebDriver driver;

	
	//tag1
	@Given("User opens the browser")
	public void user_opens_the_browser() {
		// Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	    
	    @Given("User navigate to the following page {string}")
		public void user_navigate_to_the_following_page (String mainPage) {
		    // Write code here that turns the phrase above into concrete actions
			driver.get(mainPage);
		}
	    
	    @Given("User clicks on sign in")
		public void user_clicks_on_sign_in() {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.className("login")).click();
		} 
}
	/*@Given("User opens the browser")
	public void user_opens_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Browser is open!");
	}

	@Given("User navigate to the following page http:\\/\\/automationpractice.com\\/index.php")
	public void user_navigate_to_the_following_page_http_automationpractice_com_index_php() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is in main page");
	}

	@Given("User click on Sign in")
	public void user_click_on_Sign_in() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is in sign in page");
	}
	
	
	
	//
	@Given("User clics sign in button")
	public void user_clics_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User clics sign in");
	}

	@Given("New user opens the browser")
	public void new_user_opens_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User opens browser");
	}

	@Given("New user navigate to the following page http:\\/\\/automationpractice.com\\/index.php")
	public void new_user_navigate_to_the_following_page_http_automationpractice_com_index_php() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User navigate page");
	}*/

