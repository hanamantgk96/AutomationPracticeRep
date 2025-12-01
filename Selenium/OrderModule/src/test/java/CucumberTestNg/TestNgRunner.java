package CucumberTestNg;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestNgRunner {
	
@CucumberOptions(features = "src/test/java/feature", glue = "StepDefinition", monochrome = true, tags="@createorder",
			
 			plugin = { "html:target/cucmber.html", "json:target/cucumber.json"})

			public class TestNgtestRunner extends AbstractTestNGCucumberTests{

}
}
