package StepDefinitionsHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
	
	@Before
	public void setUp() {
		System.out.println("Driver SetUp");
	}
	
	@After
	public void tearDown() {
		System.out.println("Driver TearDown");
	}
	
	
	@BeforeStep
	public void beforeStep() {
		System.out.println("This is before each step");
	}

}
