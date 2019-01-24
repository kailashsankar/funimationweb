package framework.Pages;

/**
 * Created by MohanKrishna on 16-01-2019.
 */

import framework.helper.Logger.FunLogger;
import framework.helper.TestBase.TestBase;
import framework.helper.Wait.WaitHelper;
import framework.helper.genericHelper.GenericHelper;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AccountInfoPage extends TestBase {

    public AccountInfoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
    }

    private final Logger log = FunLogger.getLogger(AccountInfoPage.class);
    WaitHelper waitHelper;

    @FindBy(xpath = "/html[1]/body[1]/main[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]")
    private WebElement emailId;

    @FindBy(xpath = "/html[1]/body[1]/main[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]")
    private WebElement subPlan;

    @FindBy(xpath = "/html[1]/body[1]/main[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]")
    private WebElement status;

    @FindBy(xpath= "/html[1]/body[1]/main[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[3]/a[1]")
    private WebElement goToMyAccount;




    public WebElement getEmailId() {
        return emailId;
    }

    public WebElement getSubPlan() {
        return subPlan;
    }

    public WebElement getStatus() {
        return status;
    }

    public void goToMyAccount(){
    	GenericHelper.highLighterMethod(driver, goToMyAccount);
    	goToMyAccount.click();}
}