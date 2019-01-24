package framework.Pages;

import framework.helper.TestBase.TestBase;
import framework.helper.Wait.WaitHelper;
import framework.helper.genericHelper.GenericHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MyAccountPage extends TestBase {


    public  MyAccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        WaitHelper waitHelper = new WaitHelper(driver);
    }

    @FindBy(xpath="//a[@href='#subscription']")
    private WebElement Lnk_subscription;
    public WebElement getLnk_subscription(){
        return Lnk_subscription;
    }

    @FindBy(xpath="//a[@href='#info']")
    private WebElement myInfoAccordion;
    public WebElement getmyInfoAccordion(){
    	GenericHelper.highLighterMethod(driver, myInfoAccordion);
        return myInfoAccordion;
    }

    @FindBy(xpath="//a[@href='#subscriptionSummary']")
    private WebElement Lnk_subscriptionAccordion;
    public WebElement getLnk_subscriptionAccordion(){
        return Lnk_subscriptionAccordion;
    }

    @FindBy(xpath="//a[@href='/cancel-subscription']")
    private WebElement Lnk_cancelSubscription;
    public WebElement getLnk_cancelSubscription(){
        return Lnk_cancelSubscription;
    }

    @FindBy(xpath="//a[@ng-click='editField(myInformation.firstName)']")
    private WebElement Lnk_firstNameEdit;
    public WebElement getLnk_firstNameEdit(){
        return Lnk_firstNameEdit;
    }

    @FindBy(css="#firstName")
    private WebElement Txt_firstName;
    public WebElement getTxt_firstName(){
        return Txt_firstName;
    }

    @FindBy(xpath="//a[@ng-click='saveField(myInformation.firstName)']")
    private WebElement Lnk_firstNameSave;
    public WebElement getLnk_firstNameSave(){
        return Lnk_firstNameSave;
    }

    @FindBy(xpath="//*[@id='firstName']/../p")
    private WebElement firstName;
    public WebElement getfirstName(){
        return firstName;
    }

    @FindBy(xpath="//*[@id='lastName']/../p")
    private WebElement lastName;
    public WebElement getlastName(){
        return lastName;
    }

    @FindBy(xpath="//a[@ng-click='editField(myInformation.lastName)']")
    private WebElement Lnk_lastNameEdit;
    public WebElement getLnk_lastNameEdit(){
        return Lnk_lastNameEdit;
    }

    @FindBy(css="#lastName")
    private WebElement Txt_lastName;
    public WebElement getTxt_lastName(){
        return Txt_lastName;
    }

    @FindBy(xpath="//a[@ng-click='saveField(myInformation.lastName)']")
    private WebElement Lnk_lastNameSave;
    public WebElement getLnk_lastNameSave(){
        return Lnk_lastNameSave;
    }

    @FindBy(xpath="//a[@ng-click='editField([myInformation.birthMonth, myInformation.birthDay, myInformation.birthYear])']")
    private WebElement Lnk_editDOB;
    public WebElement getLnk_editDOB(){return Lnk_editDOB;}

    @FindBy(id="birthMonth")
    private WebElement selectbirthMonth;
    public WebElement getselectbirthMonth(){
        return selectbirthMonth;
    }

    @FindBy(id="birthDay")
    private WebElement selectbirthDay;
    public WebElement getselectbirthDay(){
        return selectbirthDay;
    }

    @FindBy(id="birthYear")
    public WebElement selectbirthYear;
    public WebElement getselectbirthYear(){
        return selectbirthYear;
    }

    @FindBy(xpath="//a[@ng-click='saveField([myInformation.birthMonth, myInformation.birthDay, myInformation.birthYear])']")
    private WebElement Lnk_saveDOB;
    public WebElement getLnk_saveDOB(){return Lnk_saveDOB;}

    @FindBy(xpath="//input[@id='birthdate']/../p")
    private WebElement Txt_DOB;
    public WebElement getTxt_DOB(){
        return Txt_DOB;
    }

    @FindBy(xpath="//a[@ng-click='editField(myInformation.gender)']")
    private WebElement Lnk_editGender;
    public WebElement getLnk_editGender(){
        return Lnk_editGender;
    }

    @FindBy(id="gender")
    private WebElement selectGender;
    public WebElement getselectGender(){
        return selectGender;
    }

    @FindBy(xpath="//a[@ng-click='saveField(myInformation.gender)']")
    private WebElement Lnk_saveGender;
    public WebElement getLnk_saveGender(){
        return Lnk_saveGender;
    }

    @FindBy(xpath="//p[@ng-show='!myInformation.gender.showField']")
    private WebElement Txt_Gender;
    public WebElement getTxt_Gender(){
        return Txt_Gender;
    }

    @FindBy(xpath="//a[@href='/change-plan/']")
    private WebElement Lnk_changePlan;
    public WebElement getLnk_changePlan(){
        return Lnk_changePlan;
    }

    @FindBy(css="a[href='#subscriptionSummary'] span")
    private WebElement Txt_serviceSubscriptionSummary;
    public WebElement getTxt_serviceSubscriptionSummary(){
        return Txt_serviceSubscriptionSummary;
    }

    @FindBy(xpath="//a[@class='tab-subscription']")
    private WebElement Tab_subscription;
    public WebElement getTab_subscription(){
        return Tab_subscription;
    }

    @FindBy(xpath="//div[@class='account-summaryinfo-details']/div/div[2]/span")
    private WebElement Txt_plan;
    public WebElement getTxt_plan(){
        return Txt_plan;
    }

    @FindBy(xpath="//div[@class='account-summaryinfo-details']//a[text()='Purchase Add ons']")
    private WebElement Lnk_purchaseAddons;
    public WebElement getLnk_purchaseAddons(){
        return Lnk_purchaseAddons;
    }

    @FindBy(xpath="//div[contains(@data-title,'Family & Friends')]/div[2]")
    private WebElement btn_purchaseFF;
    public WebElement getbtn_purchaseFF(){
        return btn_purchaseFF;
    }

    @FindBy(xpath="//div[@class='accept btn btn-light ']")
    private WebElement btn_continuePopUp;
    public WebElement getbtn_continuePopUp(){
        return btn_continuePopUp;
    }

    @FindBy(xpath="//div[@class='gs_model-wrap fade-out success']/p")
    private WebElement Txt_successMsg;
    public WebElement getTxt_successMsg(){
        return Txt_successMsg;
    }

    @FindBy(xpath="//div[@class='account-summaryinfo-details']/div[1]//span[2]")
    private WebElement Txt_freeTrialEndDate;
    public WebElement getTxt_freeTrialEndDate(){
        return Txt_freeTrialEndDate;
    }

    @FindBy(css="li[class='fun'] img")
    private WebElement lnk_userDropdown;
    public WebElement getLnk_userDropdown() {
        return lnk_userDropdown;
    }

    @FindBy(className="headerLogOut")
    private WebElement lnk_Logout;
    public WebElement getLnk_Logout() {return lnk_Logout;}

    @FindBy(xpath="//div[contains(@data-title,'Power Up')]/div[2]")
    private WebElement btn_purchasePerks;
    public WebElement getbtn_purchasePerks(){
        return btn_purchasePerks;
    }

    @FindBy(xpath = "/html/body/main/div/div/div[2]/div/div[1]/div/div[1]/div[2]/div/form/div[3]/div[2]/p")
    private WebElement accountEmail;
    public WebElement getAccountEmail(){
        return accountEmail;
    }

}

