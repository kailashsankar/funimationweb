package framework.Pages;

/**
 * Created by MohanKrishna on 14-01-2019.
 */

import framework.configreader.ObjectRepo;
import framework.helper.Logger.FunLogger;
import framework.helper.Wait.WaitHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    WebDriver driver;
    private static  final Logger log = FunLogger.getLogger(LoginPage.class);
    WaitHelper waitHelper;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
    }

    @FindBy(css = "#accept-cookie")
    private WebElement acceptCookies;
    public WebElement getAccceptCookies() {return acceptCookies;}

    @FindBy(xpath = "//li[@class='login-button']/a")
    private WebElement Lnk_Login;
    public WebElement getLnk_Login() {return Lnk_Login;}

    @FindBy(id = "email2")
    private WebElement txt_emailId;
    public WebElement gettxt_emailId() {return txt_emailId;}

    @FindBy(id = "password2")
    private WebElement txt_Password;

    public WebElement getTxt_Password() {
        return txt_Password;
    }

    @FindBy(xpath = "//form[@name='loginForm']//button[@type='submit']")
    private WebElement btn_SignIn;

    public WebElement getBtn_SignIn() {
        return btn_SignIn;
    }

    @FindBy(xpath = "//a[@ng-click='logout()']")
    private WebElement lnk_Logout;

    public WebElement getLnk_Logout() {
        return lnk_Logout;
    }

    @FindBy(xpath = "//a[@href='/whats-new/']")
    private WebElement menu_whatsNew;

    public WebElement getmenu_whatsNew() {
        return menu_whatsNew;
    }

    @FindBy(xpath = "//a[@href='/discover/']")
    private WebElement menu_discover;

    public WebElement getmenu_discover() {
        return menu_discover;
    }

    @FindBy(css = "a[href='/shows/']")
    private WebElement menu_shows;

    public WebElement getmenu_shows() {
        return menu_shows;
    }

    @FindBy(xpath = "//a[@href='/shop/']")
    private WebElement menu_shop;

    public WebElement getmenu_shop() {
        return menu_shop;
    }

    @FindBy(css = "#logo")
    private WebElement funiLogo;

    public WebElement getfuniLogo() {
        return funiLogo;
    }

    @FindBy(xpath = "//a[@href='/new-releases/']")
    private WebElement Lnk_releases;

    public WebElement getLnk_releases() {
        return Lnk_releases;
    }

    @FindBy(xpath = "//a[@href='/schedule/']")
    private WebElement Lnk_schedule;

    public WebElement getLnk_schedule() {
        return Lnk_schedule;
    }

    @FindBy(xpath = "//a[@href='/shop/whats-new/']")
    private WebElement Lnk_products;

    public WebElement getLnk_products() {
        return Lnk_products;
    }

    @FindBy(xpath = "//a[@href='/events/']")
    private WebElement Lnk_events;

    public WebElement getLnk_events() {
        return Lnk_events;
    }

    @FindBy(xpath = "//a[@href='/recommended-for-you/']")
    private WebElement Lnk_recommended;

    public WebElement getLnk_recommended() {
        return Lnk_recommended;
    }

    @FindBy(xpath = "//a[@href='/trendingbuzz/']")
    private WebElement Lnk_trendingbuzz;

    public WebElement getLnk_trendingbuzz() {
        return Lnk_trendingbuzz;
    }

    @FindBy(xpath = "//a[@href='/guides/']")
    private WebElement Lnk_guides;

    public WebElement getLnk_guides() {
        return Lnk_guides;
    }

    @FindBy(xpath = "//a[@href='/moods/']")
    private WebElement Lnk_moods;

    public WebElement getLnk_moods() {
        return Lnk_moods;
    }

    @FindBy(xpath = "//a[@href='/blog/']")
    private WebElement Lnk_blog;

    public WebElement getLnk_blog() {
        return Lnk_blog;
    }

    @FindBy(xpath = "//a[@href='/forum/']")
    private WebElement Lnk_forum;

    public WebElement getLnk_forum() {
        return Lnk_forum;
    }

    @FindBy(xpath = "//a[@href='/dubbletalk/']")
    private WebElement Lnk_dubbletalk;

    public WebElement getLnk_dubbletalk() {
        return Lnk_dubbletalk;
    }

    @FindBy(xpath = "//a[@href='/genre/']")
    private WebElement Lnk_genres;

    public WebElement getLnk_genres() {
        return Lnk_genres;
    }

    @FindBy(xpath = "//a[@href='/simuldubs/']")
    private WebElement Lnk_simuldubs;

    public WebElement getLnk_simuldubs() {
        return Lnk_simuldubs;
    }

    @FindBy(xpath = "//a[@href='/shows/popular/']")
    private WebElement Lnk_showsPopular;

    public WebElement getLnk_showsPopular() {
        return Lnk_showsPopular;
    }

    @FindBy(xpath = "//a[@href='/shop/']")
    private WebElement Lnk_shop;

    public WebElement getLnk_shop() {
        return Lnk_shop;
    }

    @FindBy(xpath = "//a[@href='/shop/home-video/']")
    private WebElement Lnk_HomeVideo;

    public WebElement getLnk_HomeVideo() {
        return Lnk_HomeVideo;
    }

    @FindBy(xpath = "//a[@href='/shop/pre-orders/']")
    private WebElement Lnk_preOrders;

    public WebElement getLnk_preOrders() {
        return Lnk_preOrders;
    }

    @FindBy(xpath = "//a[@href='/shop/toys-games/']")
    private WebElement Lnk_toys;

    public WebElement getLnk_toys() {
        return Lnk_toys;
    }

    @FindBy(xpath = "//a[@href='/shop/accessories/']")
    private WebElement Lnk_accessories;

    public WebElement getLnk_accessories() {
        return Lnk_accessories;
    }

    @FindBy(xpath = "//a[@href='/shop/most-popular/']")
    private WebElement Lnk_shopPopular;

    public WebElement getLnk_shopPopular() {
        return Lnk_shopPopular;
    }

    @FindBy(xpath = "//a[@href='/shop/sale/']")
    private WebElement Lnk_sale;

    public WebElement getLnk_sale() {
        return Lnk_sale;
    }

    @FindBy(css = "div[class='header-icons'] [class='search'] a")
    private WebElement clickSearch;

    public WebElement getclickSearch() {
        return clickSearch;
    }

    @FindBy(xpath = "//input[@id='search-bar-input']")
    private WebElement Txt_searchBar;

    public WebElement getTxt_searchBar() {
        return Txt_searchBar;
    }

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement Btn_search;

    public WebElement getBtn_search() {
        return Btn_search;
    }

    @FindBy(css = "li[class='fun'] img")
    private WebElement lnk_userImage;

    public WebElement getlnk_userImage() {
        return lnk_userImage;
    }

    @FindBy(xpath = "//a[@id='headerAccount']")
    private WebElement Lnk_myAccount;

    public WebElement getLnk_myAccount() {
        return Lnk_myAccount;
    }

    @FindBy(css = "li[class='cart'] mini-cart")
    private WebElement cartIcon;

    public WebElement getcartIcon() {
        return cartIcon;
    }

    @FindBy(css = "a[href='/shop/figures-collectibles/']")
    private WebElement Lnk_figurescollectibles;

    public WebElement getLnk_figurescollectibles() {
        return Lnk_figurescollectibles;
    }

    @FindBy(css = "a[href='/shop/apparel/']")
    private WebElement Lnk_apparel;

    public WebElement getLnk_apparel() {
        return Lnk_apparel;
    }

    @FindBy(css = "a[href='/shop/home-decor/']")
    private WebElement Lnk_HomeAndDecor;

    public WebElement getLnk_HomeAndDecor() {
        return Lnk_HomeAndDecor;
    }

    @FindBy(xpath = "//a[@href='/shows/all-shows/']")
    private WebElement Lnk_allShows;

    public WebElement getLnk_allShows() {
        return Lnk_allShows;
    }

    @FindBy(xpath = "//a[@href='/games/']")
    private WebElement Lnk_games;

    public WebElement getLnk_games() {
        return Lnk_games;
    }

    @FindBy(xpath = "//li[@class='cart']//mini-cart//a[@href='/shop/checkout/']")
    private WebElement Btn_miniCartCheckout;

    public WebElement getBtn_miniCartCheckout() {
        return Btn_miniCartCheckout;
    }

    @FindBy(xpath = "//footer//a[@href='/about-us/']")
    private WebElement Lnk_aboutus;

    public WebElement getLnk_aboutus() {
        return Lnk_aboutus;
    }

    @FindBy(xpath = "//footer//a[@href='/terms-of-use/']")
    private WebElement Lnk_TermsofUse;

    public WebElement getLnk_TermsofUse() {
        return Lnk_TermsofUse;
    }

    @FindBy(xpath = "//footer//a[@href='/privacy-policy/']")
    private WebElement Lnk_privacyPolicy;

    public WebElement getLnk_privacyPolicy() {
        return Lnk_privacyPolicy;
    }

    /*Discover banner*/
    @FindBy(xpath = "//section[@id='intro']//h1")
    private WebElement bannerDiscover;
    @FindBy(xpath = "//div[@id='introCopy']/p[1]")
    private WebElement bannerDiscover1;
    @FindBy(xpath = "//div[@id='introCopy']/p[2]/a")
    private WebElement bannerDiscover2;

    public WebElement getbannerDiscover(int i) {
        if (i == 0)
            return bannerDiscover;
        else if (i == 1)
            return bannerDiscover1;
        else return bannerDiscover2;
    }

    @FindBy(xpath = "//div[starts-with(@data-module,'Home Simuldubs')]//h1")
    private WebElement mainHeaderSimuldubs;
    @FindBy(xpath = "//div[starts-with(@data-module,'Home Simuldubs')]//h2")
    private WebElement subHeaderSimuldubs;

    public WebElement getsimuldubsHeaders(int i) {
        if (i == 0) return mainHeaderSimuldubs;
        else return subHeaderSimuldubs;
    }

    @FindBy(xpath = "//div[@data-module='New Shop Arrivals']//h1")
    private WebElement mainHeaderShopCarousels;
    @FindBy(xpath = "//div[@data-module='New Shop Arrivals']//h2")
    private WebElement subHeaderShopCarousels;

    public WebElement getShopCarouselHeaders(int i) {
        if (i == 0) return mainHeaderShopCarousels;
        else return subHeaderShopCarousels;
    }

    @FindBy(xpath = "//h1[contains(text(),'FunimationNow Favorites')]")
    private WebElement carouselFavorites;

    public WebElement getcarouselFavorites() {
        return carouselFavorites;
    }

    @FindBy(xpath = "//div[@data-module='PIPH-pi-shows-you-love']//h1")
    private WebElement showsYouLoveCarousel;

    public WebElement getshowsYouLoveCarousel() {
        return showsYouLoveCarousel;
    }

    @FindBy(xpath = "//div[starts-with(@id, 'funimation_trending')]//h1")
    private WebElement trendingCarousel;

    public WebElement gettrendingCarousel() {
        return trendingCarousel;
    }

    @FindBy(xpath = "//div[@id='home-watch-shop-others']//a[1]//div[@class='btn']")
    private WebElement btnWatchsection;

    public WebElement getbtnWatchsection() {
        return btnWatchsection;
    }

    @FindBy(xpath = "//div[@id='home-watch-shop-others']//a[2]//div[@class='btn']")
    private WebElement btnDiscoverSection;

    public WebElement getbtnDiscoverSection() {
        return btnDiscoverSection;
    }

    @FindBy(xpath = "//*[@id='email2']/..//p")
    private WebElement emailErrorMsg;

    public WebElement getemailErrorMsg() {
        return emailErrorMsg;
    }

    @FindBy(xpath = "//*[@name='password2']/..//ng-messages/ng-message")
    private WebElement pswdErrorMsg;

    public WebElement getpswdErrorMsg() {
        return pswdErrorMsg;
    }

    @FindBy(xpath = "//*[@name='password2']/..//p")
    private WebElement pswdErrorMsg2;

    public WebElement getpswdErrorMsg2() {
        return pswdErrorMsg2;
    }


}

