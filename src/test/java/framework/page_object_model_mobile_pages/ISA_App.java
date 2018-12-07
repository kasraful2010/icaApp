package framework.page_object_model_mobile_pages;

import framework.AppiumWrapper;
import framework.actions_apps.MobileBasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.Dimension;


public class ISA_App extends MobileBasePage {

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='SKIP ']")
    @iOSFindBy(accessibility = "yesButton")
    private MobileElement yesButton;

    @AndroidFindBy(xpath= "//android.webkit.WebView/android.view.View/android.widget.Button[1]")
    private MobileElement mainMenu;

    @AndroidFindBy(xpath= "//android.view.View[@content-desc='Menu']")
    private MobileElement sidebarHeader;

    @AndroidFindBy(xpath = "//android.widget.ToggleButton[@content-desc='FAVORITES ']")
    private MobileElement clickOnFavorites;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='No Sessions Found']")
    private MobileElement noSessionsFoundText;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='CONTINUE arrow forward ']")
    private MobileElement continueButtonText;

    public void tapOnSkipButton() {
        tapOn(yesButton);
    }

    public void tapOnMainMenuButton() {
        tapOn(mainMenu);
    }

    public void tapOnFavorites() { tapOn(clickOnFavorites);}

    public boolean isSideMenuBarDisplayed() { return isElementDisplayed(sidebarHeader); }

    public boolean isNoSessionsFoundDisplayed() { return isElementDisplayed(noSessionsFoundText); }


    public void swpieRight() throws InterruptedException {
        swipe(1000,1000, 200, 400);
        swipe(1000,1000, 200, 400);
        swipe(1000,1000, 200, 400);
    }

    public void verifyContinue (){
        isElementDisplayed(continueButtonText);
    }



}

