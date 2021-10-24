package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinitions"},
plugin = {"pretty", "html:target/htmlReports", "junit:target/JUnitReports/report.xml"},
tags="@testThis"
		)
public class Runner {

}
