package tests.practice.cucumber.practice;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/2DMap.feature",
glue = "tests.practice.cucumber.practice", plugin = {
		"html:target", "rerun:src/test/resources/failed.txt",
		"json:target/report.json" }, dryRun = false, monochrome = true, strict = true)
public class testRunner {

}
