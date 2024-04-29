package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
  features ="src/test/resources/Features",
        glue = {"StepDefinitions"},
      monochrome=true,
      tags= "@smoke or @regression",
   
      plugin= {"pretty", "html:target/HtmlReports"}
       //   {"pretty", "jason:target/HtmlReports/cucumber.json"}
         //  {"pretty", "junit:target/HtmlReports/cucumber.xml"}
  //{"pretty", "html:target/HtmlReports/report.html"}
)


public class TestRunner {

	
	}


