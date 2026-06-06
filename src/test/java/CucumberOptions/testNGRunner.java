package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue = "StepDefinations", monochrome = true, tags = "@SmokeTest")
public class testNGRunner extends AbstractTestNGCucumberTests{

}
