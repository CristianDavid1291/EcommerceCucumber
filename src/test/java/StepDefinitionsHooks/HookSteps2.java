package StepDefinitionsHooks;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HookSteps2 {

	@Given("we have a {word} and {word}")
	public void we_have_a_username_and_password(String username,String password) {
	 System.out.println("Given step "+ username +" password "+ password);
	}

	@Then("print {word} and {word}")
	public void print_username_and_password(String username, String password) {
	   System.out.println("Printing username: "+ username);
	   System.out.println("Printing password: "+ password);
	}
	
}
