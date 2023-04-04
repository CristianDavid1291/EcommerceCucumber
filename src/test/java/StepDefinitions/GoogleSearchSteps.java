package StepDefinitions;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {
	WebDriver driver;
	
	@Given("Chrome borwser is open")
	public void chrome_borwser_is_open() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	
	
	}

	@Given("user is in google search part")
	public void user_is_in_google_search_part() {
	    
		driver.navigate().to("https://www.google.com");
		
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	}

	@When("hits enter")
	public void hits_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
	    List<WebElement> elements = driver.findElements(By.cssSelector(".yuRUbf a h3"));
	    elements.stream().map(we -> we.getText()).forEach(t -> System.out.println(t));
	    driver.close();
	    driver.quit();
	    
	}

}
