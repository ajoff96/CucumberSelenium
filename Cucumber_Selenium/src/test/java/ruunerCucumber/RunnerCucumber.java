package ruunerCucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)


@CucumberOptions(
		features = "src//test//java//Feature//test.feature", 
		glue = { "seleniumgluecode" },
		monochrome = true,
		dryRun=true,
		plugin = {"pretty","json:target/Report/TestSmoke.json"},
		tags= ("@SmokeTest")
		
		
		
		
		)

public class RunnerCucumber {
	

}
//plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
//cucumeber 6.10.2
//cucumber junit 
//"pretty","html:target/Destination/cucumberResult.html"
//plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
////ExtentReports extent = new ExtentReports();
//extent.@attachReporter(new ExtentHtmlReporter("test-output/SparkReport/MySparkReport.html"));