package StepDefinitionsHooks;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HookSteps {


	@Given("user is on login page hooks")
	public void user_is_on_login_page_hooks() {
		System.out.println("Hooks user login step");
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	}

}
