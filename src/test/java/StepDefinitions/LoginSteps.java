package StepDefinitions;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

	WebDriver driver;
	LoginPage lp;

	@Given("user is on login page")
	public void user_is_on_login_page() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://example.testproject.io/web/");

	}

	@When("user enters {word} and {word}")
	public void user_enters_username_and_password(String username, String password) {
		lp = new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		lp.clickLoginButton();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		assertEquals(driver.findElement(By.cssSelector("div[id='pageProfile'] h1")).getText(), "TestProject Example page");
		driver.close();
		driver.quit();
	}

}
