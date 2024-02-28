package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue ={"stepdefination"},tags="@tag1",plugin = "html:target/reports/test.html")
public class Testrunner extends AbstractTestNGCucumberTests{



}
