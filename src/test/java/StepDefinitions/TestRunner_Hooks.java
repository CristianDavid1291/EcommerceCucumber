package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\Hooks.feature", 
glue={"StepDefinitionsHooks"},
monochrome = true,
plugin = {"pretty","summary","json:target/JSONReports.json",
			"html:target/HtmlReports.html"}

)
public class TestRunner_Hooks {

}
