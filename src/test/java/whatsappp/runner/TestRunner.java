package whatsappp.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		features = "./src/test/java/featurefile" ,
		glue = {"whatsapp.steps"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty" , "html:Output/html-output"}
		
		
		)


public class TestRunner extends AbstractTestNGCucumberTests {

}
