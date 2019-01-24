package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import framework.configreader.ObjectRepo;
import framework.configreader.PropertyFileReader;
import framework.helper.Logger.FunLogger;
import framework.helper.TestBase.TestBase;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;


import java.io.File;

import static framework.helper.TestBase.TestBase.setUpDriver;

/**
 * Created by MohanKrishna on 14-01-2019.
 */
public class Hooks {

    private static final Logger log = FunLogger.getLogger(TestBase.class);

    public static WebDriver driver;

    @Before()
    public static void setup() throws Exception {
        ObjectRepo.reader = new PropertyFileReader();
        setUpDriver(ObjectRepo.reader.getBrowser());
        log.info(ObjectRepo.reader.getBrowser());
    }

    

    public void embedScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
            	
                // Code to capture and embed images in test reports (if scenario fails)
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    @After()
    public static void tearDown(Scenario scenario) throws Exception {
        driver=TestBase.getDriver();
    	driver.close();
    	driver .quit();
        log.info("");
    }



}
