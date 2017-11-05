package java.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/com/mh/test/features/login"}, glue = "loginsteps")
public class RunnerOne extends AbstractTestNGCucumberTests{




}
