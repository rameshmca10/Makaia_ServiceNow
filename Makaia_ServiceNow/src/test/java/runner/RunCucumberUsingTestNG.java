package runner;

import io.cucumber.testng.CucumberOptions;
import lib.selenium.PreAndPost;

@CucumberOptions(features = { "src/test/java/features" }, glue = { "pages.selenium", "pages.rest" }, monochrome = true
//dryRun = false, 
//strict = true,
//plugin = { "html:reports/cucumber",	"json:reports/cucumber.json" }
)

public class RunCucumberUsingTestNG extends PreAndPost {

}