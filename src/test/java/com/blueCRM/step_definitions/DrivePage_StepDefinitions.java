package com.blueCRM.step_definitions;

import com.blueCRM.pages.ActivityStreamPage;
import com.blueCRM.pages.DrivePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class DrivePage_StepDefinitions {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    DrivePage drivePage = new DrivePage();

    @Given("the user clicks on the {string} option")
    public void the_user_clicks_on_the_option(String drive) {

        //specifically navigates to the Drive page
        activityStreamPage.navigateToModule(drive);
    }


    @Then("the user sees the modules")
    public void the_user_sees_the_modules(io.cucumber.datatable.DataTable dataTable) {
        //need to locate each module seperately.

        Assert.assertTrue(drivePage.myDriveModule.isDisplayed());
        Assert.assertTrue(drivePage.allDocumentsModule.isDisplayed());
        Assert.assertTrue(drivePage.companyDriveModule.isDisplayed());
        Assert.assertTrue(drivePage.salesAndMarketingModule.isDisplayed());
        Assert.assertTrue(drivePage.topManagementDocumentsModule.isDisplayed());
        Assert.assertTrue(drivePage.driveCleanupModule.isDisplayed());
    }
}
