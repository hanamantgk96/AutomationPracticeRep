package CucumberTestNg;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestNgRunner {
	
@CucumberOptions(features = "src/test/java/FeatureFile", 
                     glue = "StepDefinition",
                     tags="@CreateLpo",
                     dryRun =false,
                     monochrome = true, 
                     			

		plugin = { "pretty",  
		  
		          "html:target/cucumber-reports.html",
				  "json:target/cucumber.json"})  


			public class TestNgtestRunner extends AbstractTestNGCucumberTests{
	
	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
		
}
}
}
