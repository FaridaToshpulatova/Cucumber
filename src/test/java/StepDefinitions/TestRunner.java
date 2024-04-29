package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
  features ="src/test/resources/Features",
        glue = {"StepDefinitions"},
        monochrome = true,
        plugin ={"pretty", "html:target/HtmlReports/"},
              //  {"pretty", "jason:target/JSONReports/report.json"},
                //{"pretty", "junit:target/JUnitReports/report.xml"},
        tags ="@smoke"
)





























public class TestRunner {

	
	}


