package com.blueCRM.step_definitions;

import com.blueCRM.pages.ActivityStreamPage;
import com.blueCRM.pages.DrivePage;
import com.blueCRM.utilities.BrowserUtils;
import com.blueCRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DrivePage_StepDefinitions {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    DrivePage drivePage = new DrivePage();


    @Given("the user clicks on the {string} option")
    public void the_user_clicks_on_the_option(String drive) {

        //specifically navigates to the Drive page
        activityStreamPage.navigateToModule(drive);
    }

//    @Then("user should be able to see following {int} modules in the Drive page")
//    public void userShouldBeAbleToSeeFollowingModulesInTheDrivePage(int expectedModuleNumbers, List<String>expectedModules) {
//        List<String> actualModules = BrowserUtils.getElementsText(drivePage.allModulesOfDrivePage);
//        Assert.assertEquals(expectedModuleNumbers, actualModules.size());
//        Assert.assertEquals(expectedModules, actualModules);



    @Then("the user sees the My Drive module")
    public void theUserSeesTheMyDriveModule() {

        Assert.assertTrue(drivePage.myDriveModule.isDisplayed());
    }

    @And("the user sees the All Documents module")
    public void theUserSeesTheAllDocumentsModule() {

        Assert.assertTrue(drivePage.allDocumentsModule.isDisplayed());
    }

    @And("the user sees the Company Drive module")
    public void theUserSeesTheCompanyDriveModule() {
        Assert.assertTrue(drivePage.companyDriveModule.isDisplayed());
    }

    @And("the user sees the Sales and Marketing module")
    public void theUserSeesTheSalesAndMarketingModule() {
        Assert.assertTrue(drivePage.salesAndMarketingModule.isDisplayed());
    }

    @And("the user sees the Top Management's documents module")
    public void theUserSeesTheTopManagementSDocumentsModule() {
        drivePage.moreButton.click();
        Assert.assertTrue(drivePage.topManagementDocumentsModule.isDisplayed());
    }

    @And("then user sees the Drive Cleanup module")
    public void thenUserSeesTheDriveCleanupModule() {
        Assert.assertTrue(drivePage.driveCleanupModule.isDisplayed());
    }
}
