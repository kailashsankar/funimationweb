package framework.browser;


import framework.helper.Logger.FunLogger;
import framework.utility.ResourceHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeBrowser {

    private final Logger log = FunLogger.getLogger(ChromeBrowser.class);

    public Capabilities getChromeCapabilities() {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("start-maximized");

        DesiredCapabilities chrome = DesiredCapabilities.chrome();
        chrome.setJavascriptEnabled(true);
        chrome.setCapability(ChromeOptions.CAPABILITY, option);
        return chrome;
    }

    public WebDriver getChromeDriver(Capabilities cap) {
        if (System.getProperty("os.name").contains("Mac")) {
            System.setProperty("webdriver.chrome.driver", ResourceHelper.getResourcePath("/src/test/resources/drivers/chromedriver"));
            return new ChromeDriver(cap);
        } else if (System.getProperty("os.name").contains("Windows")) {
            System.setProperty("webdriver.chrome.driver", ResourceHelper.getResourcePath("/src/test/resources/drivers/chromedriver.exe"));
            return new ChromeDriver(cap);
        }
        return null;
    }


}
