package runners;



	import io.cucumber.testng.AbstractTestNGCucumberTests;

	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
			features ="src//test//resources//features//PlaceOrder.feature",
			glue=("stepDefs"),
			monochrome=true,
			dryRun=true,
			plugin= {"pretty"}
					//"html:target//Reports//HtmlReport.html",
					//"json:target//Reports//JsonReport.json",
					//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			        // "rerun:target//failedScenarios.txt"
			
			)
	public class MyTestRunner extends AbstractTestNGCucumberTests{
		
	}

