package com.blueCRM.step_definitions;

import com.blueCRM.pages.ActivityStreamPage;
import com.blueCRM.pages.CompanyPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

import java.util.List;

public class CompanyPage_StepDefs {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    CompanyPage companyPage = new CompanyPage();



    @Then("the user sees the Official Information module")
    public void theUserSeesTheOfficialInformationModule() {

        Assert.assertTrue(companyPage.OfficialInformationModule.isDisplayed());

    }

    @And("the user sees the Our Life module")
    public void theUserSeesTheOurLifeModule() {

        Assert.assertTrue(companyPage.OurLifeModule.isDisplayed());

    }

    @And("the user sees About Company module")
    public void theUserSeesAboutCompanyModule() {

        Assert.assertTrue(companyPage.AboutCompanyModule.isDisplayed());

    }

    @And("the user sees the Photo Gallery module")
    public void theUserSeesThePhotoGalleryModule() {
        Assert.assertTrue(companyPage.PhotoGalleryModule.isDisplayed());

    }

    @And("the user sees the Video module")
    public void theUserSeesTheVideoModule() {

        Assert.assertTrue(companyPage.VideoModule.isDisplayed());


    }

    @And("the user sees the Career module")
    public void theUserSeesTheCareerModule() {
        Assert.assertTrue(companyPage.CareerModule.isDisplayed());

    }

    @And("the user sees the More module")
    public void theUserSeesTheMoreModule() {
        Assert.assertTrue(companyPage.MoreModule.isDisplayed());
    }

    @And("the user sees the Business News module")
    public void theUserSeesTheBusinessNewsModule() {

        Assert.assertTrue(companyPage.BusinessNewsModule.isDisplayed());
    }

    @And("the user clicks on the Company option")
    public void theUserClicksOnTheCompanyOption() {

        companyPage.Company.click();
    }
}
