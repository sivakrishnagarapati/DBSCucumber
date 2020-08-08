package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepDefinations",tags="@PositiveTest",dryRun=false,monochrome=true,strict=true,
		plugin= {"html:target/cucumber-html-Report"})
public class TestRunner1 {

}
