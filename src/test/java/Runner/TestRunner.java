package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\My coading workspace\\MyCucumberTestProject\\src\\test\\java\\features",
		glue= {"stepDefinitions"},
		stepNotifications = true,
				monochrome = true,
		plugin= {"pretty","html:target/Report/cucumber.html","json:target/target/cucumber.json"}
		
		
		
		
		
		)


public class TestRunner {

}
