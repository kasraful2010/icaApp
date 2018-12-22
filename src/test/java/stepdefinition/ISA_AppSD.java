package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import framework.actions_web.BasePage;
import framework.page_object_model_mobile_pages.ISA_App;
import org.testng.Assert;


public class ISA_AppSD {

    ISA_App landingPage = new ISA_App();

    @When("^I click on skip button")
    public void clickOnSkipButton() {
        landingPage.tapOnSkipButton();
    }

    @And("^I click on favorites button$")
    public void clickOnFavorites() {
        landingPage.tapOnFavorites();
    }

    @When("^I click on menu button$")
    public void clickOnMenuButton() throws InterruptedException {
        Thread.sleep(30000);
        landingPage.tapOnMainMenuButton();
    }

    @Then("^I verify sidebar menu is displayed$")
    public void verifySidebarMenu() {
        Assert.assertTrue(landingPage.isSideMenuBarDisplayed());
    }

    @Then("^I verify \"No Sessions Found\" text displayed$")
    public void verifyNoSessionsFound() {
        Assert.assertTrue(landingPage.isNoSessionsFoundDisplayed());
    }


    //Verify user should be able to slide right on tutorial pages

    @Given("^I am on Splash screen of the ionic conference app$")
    public void verifySplashScreen() throws InterruptedException {
    }

    @When("^I swipe right 3 times on tutorials slides$")
    public void verifySwipeThreeTimes() throws InterruptedException {
        landingPage.swipeRight();
    }


    @Then("^I verify Continue button is displayed$")
    public void verifyContinueButton() {
        landingPage.verifyContinue();
    }

    //verify User should be able filter options

    @Given("^I am on a home page of the app$")
    public void verifyHomePage() {
        landingPage.tapOnSkipButton();
    }

    @When("^I click on filter button$")
    public void verifyFilterButton() {
        landingPage.clickOnFilterButton();
        landingPage.clickOnAngularButton();
    }

    @And("^I disable \"Angular\" option$")
    public void verifyOption() {
        landingPage.verifyAngularButtonIsEnabled();
    }

    @And("^I click on All Reset Filer button$")
    public void verifyResetFilterButton() {
        landingPage.clickOnResetButton();
    }

    @Then("^I verify all options are enabled$")
    public void verifyOptionsEnabled() {
        landingPage.verifyAllButtons();
    }


}
