package stepDefinitions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import com.cucumber.listener.Reporter;

//import framework.helper.genericHelper.sendMail;



@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin = {
			 "com.cucumber.listener.ExtentCucumberFormatter:Funimation_Report/Detailed-reports/report.html",
			 "pretty", "html:Funimation_Report/HtmlReport",
			 "json:Funimation_Report/cucumber.json" ,  // for json result
		     "junit:Funimation_Report/cucumber.xml",
		     "rerun:Funimation_Report/rerun.txt"
		},
		features = "src/test/resources/features",
		glue ="/src/test/java/stepDefinitions",
		monochrome = true,
		
		tags ="@funimation"
)
public class testRunner {
	@AfterClass
	 public static void writeExtentReport() {
	 Reporter.loadXMLConfig("E:/web/webautomation/src/test/resources/extent-config.xml");
     //sendMail.sendReportAsMail();
	}
}