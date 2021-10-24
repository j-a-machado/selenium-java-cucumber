package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class LoginSteps {

	WebDriver driver = null;
	
//	@Given("user is on login page")
	//	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
	//	throw new io.cucumber.java.PendingException();
	//	}

	//	@When("user enters username and password")
	//	public void user_enters_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
	//		throw new io.cucumber.java.PendingException();
	//	}

	//	@And("clicks on login button")
	//	public void clicks_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
	//		throw new io.cucumber.java.PendingException();
	//	}

	//	@Then("user is navigated to the home page")
	//	public void user_is_navigated_to_the_home_page() {
		// Write code here that turns the phrase above into concrete actions
	//		throw new io.cucumber.java.PendingException();
	//	}


	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Step1");
		System.getProperty("webdriver.chrome.driver", "/AutomationStepByStep/src/test/resources/drivers/chromedriver");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@And("user is on Google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Step1");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		System.out.println("Step1");
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("Step1");
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Step1");
	}
}
