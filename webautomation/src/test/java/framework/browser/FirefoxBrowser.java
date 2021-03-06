package framework.browser;

import framework.utility.ResourceHelper;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirefoxBrowser {

    public Capabilities getFirefoxCapabilities() {
        DesiredCapabilities firefox = DesiredCapabilities.firefox();
        FirefoxProfile profile = new FirefoxProfile();
        profile.setAcceptUntrustedCertificates(true);
        profile.setAssumeUntrustedCertificateIssuer(true);
        firefox.setCapability(FirefoxDriver.PROFILE, profile);
        firefox.setCapability("marionette", true);
        return firefox;
    }

    public WebDriver getFirefoxDriver(Capabilities cap) {

        if (System.getProperty("os.name").contains("Mac")) {
            System.setProperty("webdriver.gecko.driver", ResourceHelper.getResourcePath("/src/test/resources/drivers/geckodriver"));
            return new FirefoxDriver(cap);
        } else if (System.getProperty("os.name").contains("Window")) {
            System.setProperty("webdriver.chrome.driver", ResourceHelper.getResourcePath("/src/test/resources/drivers/geckodriver.exe"));
            return new FirefoxDriver(cap);
        }
        return null;
    }

}
