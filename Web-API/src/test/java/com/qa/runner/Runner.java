package com.qa.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/feature",
        glue = "com/qa/steps",
        plugin = {"pretty", "json:target/cucumber/report.json", "html:target/cucumber/report.html"}
)

public class Runner {
}
