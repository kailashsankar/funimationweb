package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.Pages.AccountInfoPage;
import framework.Pages.HomePage;
import framework.Pages.LoginPage;
import framework.Pages.MyAccountPage;
import framework.configreader.ObjectRepo;
import framework.helper.Logger.FunLogger;
import framework.helper.TestBase.TestBase;
import framework.helper.Wait.WaitHelper;
import framework.helper.genericHelper.GenericHelper;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by MohanKrishna on 14-01-2019.
 */
public class CreateAccountSteps {
    private final Logger log = FunLogger.getLogger(CreateAccountSteps.class);

    
    LoginPage loginpage;
    HomePage homePage;
    AccountInfoPage accountInfoPage;
    MyAccountPage myAccountPage;
    WaitHelper waitHelper;
    public static WebDriver driver;

    @Given("^A user navigates to FUNimation site$")
    public void a_user_navigates_to_FUNimation_site() throws Throwable {
        TestBase.driver.get(ObjectRepo.reader.getWebsite());
        log.info("Opened UAT Website");
        homePage = new HomePage(TestBase.driver);
        homePage.getAccceptCookies().click();
    }

    @When("^the user wants create an Subsciprtion Account$")
    public void the_user_wants_create_an_Subsciprtion_Account() throws Throwable {
        loginpage = new LoginPage(TestBase.driver);
        loginpage.clickOnLoginInLink();
        loginpage.createAnAccount();
    }

    @Then("^He should be able to subscribe successfully$")
    public void he_should_be_able_to_subscribe_successfully() throws Throwable {
        loginpage.freeAccount();
        loginpage.enterRegistrationEmail();
        loginpage.enterPassword();
        Thread.sleep(3000);
        loginpage.clickContinue();
    }

    @Then("^verify details in Thank you page$")
    public void verify_details_in_Thank_you_page() throws Throwable {
        Thread.sleep(3000);
        accountInfoPage = new AccountInfoPage(TestBase.driver);

        log.info("Successfully created an Account");
        accountInfoPage.goToMyAccount();
        myAccountPage = new MyAccountPage(TestBase.driver);
        myAccountPage.getmyInfoAccordion().click();
       String Username = myAccountPage.getAccountEmail().getText();
       log.info(Username);

    }

    @Then("^Should log out successfully$")
    public void should_log_out_successfully() throws Throwable {
        myAccountPage.getLnk_userDropdown().click();
        Thread.sleep(4000);
        myAccountPage.getLnk_Logout().click();
        driver.close();
    }


}
