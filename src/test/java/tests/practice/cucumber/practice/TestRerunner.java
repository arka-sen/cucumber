package tests.practice.cucumber.practice;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@src/test/resources/failed.txt",
glue = "tests.practice.cucumber.practice", plugin = {
		"html:target" })
public class TestRerunner {

}
