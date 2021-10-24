package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class LoginSteps {

	WebDriver driver = null;

	public static class Browser{
		private static ChromeDriver driver;

		private void ChromeDriver(){
		}

		public static ChromeDriver getInstance() {
			if (driver == null){
				driver = new ChromeDriver();
			}
			return driver;
		}
	}

	@Given("browser is open")
	public void browser_is_open() {
		String projectPath = System.getProperty("user.dir");

		System.getProperty("webdriver.chrome.driver", projectPath+"src/test/resources/drivers/chromedriver");

		driver = Browser.getInstance();
		driver.manage().window().maximize();
	}

	@And("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		driver.navigate().to("https://example.testproject.io/web/");
		Thread.sleep(2000);
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.id("name")).sendKeys("Raghav");
		driver.findElement(By.id("password")).sendKeys("12345");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		driver.findElement(By.id("logout")).isDisplayed();
		Thread.sleep(2000);
	}
	//
	//	@When("user enters User1 and pass1")
	//	public void user_enters_user1_and_pass1() {
	//
	//	}
	//
	//	@When("user enters User2 and pass2")
	//	public void user_enters_user2_and_pass2() {
	//
	//	}

	@And("user is on Google search page")
	public void user_is_on_google_search_page() {
		driver.navigate().to("https://google.com.br/");
		String googleTitle = driver.getTitle();
		googleTitle = "Google";
	}

	@Given("user is on Juliana's search page")
	public void user_is_on_juliana_search_page() {
		driver = Browser.getInstance();
		String searchTitle = driver.getTitle();
		searchTitle = "Juliana Antunes Machado";
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("Juliana Antunes Machado");

		Thread.sleep(2000);
	}

	@When("user clear the search box")
	public void user_clear_the_search_box() throws InterruptedException {
		driver.findElement(By.name("q")).clear();

		Thread.sleep(2000);
	}

	@And("user enters another text in search box")
	public void user_enters_another_text_in_search_box() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("Juliana Machado Dev");

		Thread.sleep(2000);
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		Thread.sleep(2000);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		driver.getPageSource().contains("https://br.linkedin.com");
	}

	@And("browser is closed")
	public void browser_is_closed() {
		driver.close();
		driver.quit();
	}
}
