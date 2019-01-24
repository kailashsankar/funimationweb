package framework.Pages;

import framework.configreader.ObjectRepo;
import framework.helper.Logger.FunLogger;
import framework.helper.Wait.WaitHelper;
import framework.helper.genericHelper.GenericHelper;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage  {

    WebDriver driver;
    private final Logger log = FunLogger.getLogger(LoginPage.class);
    WaitHelper waitHelper;

    @FindBy(xpath = "//li[@class='login-button']/a")
    WebElement login;

    @FindBy(xpath = "//a[contains(text(),'Create an account here.')]")
    WebElement createAnAccountHere;

    @FindBy(xpath = "//input[@id='email']")
    WebElement email;

    @FindBy(xpath = "//input[@id='submit']")
    WebElement submitLogin;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//div[@class='col-md-6 col-xs-12']//div//a[@class='btn planSelectBtn'][contains(text(),'START YOUR FREE TRIAL')]")
    WebElement freeTrailButton;

    @FindBy(xpath = "//a[@class='btn red-inverse planSelectBtn']")
    WebElement freeAccount;

    @FindBy(id="submit")
    WebElement continueButton;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
        waitHelper.waitForElement(driver, login, ObjectRepo.reader.getExplicitWait());
    }

    public void clickOnLoginInLink() {
        log.info("clicked on sign in link...");
        GenericHelper.highLighterMethod(driver, login);
        login.click();
    }

    public void enterEmailAddress(String emailAddress) {
        log.info("entering email address...." + emailAddress);
        GenericHelper.highLighterMethod(driver, this.email);
        this.email.sendKeys(emailAddress + System.currentTimeMillis() + "@gmail.com");
    }

    public void enterPassword() {
        String password = "Testing@123";
        log.info("entering password...." + password);
        GenericHelper.highLighterMethod(driver, this.password);
        this.password.sendKeys(password);
    }

    public void enterRegistrationEmail() {
        String email = "uatfuni+" + System.currentTimeMillis() + "@gmail.com";
        log.info("entering registration email.." + email);
        GenericHelper.highLighterMethod(driver, this.email);
        this.email.sendKeys(email);
    }

    public void clickContinue(){
    	 GenericHelper.highLighterMethod(driver, continueButton);
        continueButton.click();
    }

    public void createAnAccount() {
    	GenericHelper.highLighterMethod(driver, createAnAccountHere);
        createAnAccountHere.click();
    }

    public void freeTrail() {
    	GenericHelper.highLighterMethod(driver, freeTrailButton);
        freeTrailButton.click();
    }

    public void freeAccount() {
    	GenericHelper.highLighterMethod(driver, freeAccount);
        freeAccount.click();
    }


}
