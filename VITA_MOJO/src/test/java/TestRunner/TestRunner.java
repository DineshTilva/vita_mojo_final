package TestRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/Report"},
		features = "src/test/java/Feature/",
		glue= {"StepDefinition"},
		monochrome = true
)


public class TestRunner {

	
	
}