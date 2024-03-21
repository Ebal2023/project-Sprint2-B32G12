package com.blueCRM.step_definitions;

import com.blueCRM.pages.CompanyPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompanyStepDefs {


    CompanyPage companyPage = new CompanyPage();


    @When("user clicks on company page")
    public void user_clicks_on_company_page() {

        companyPage.companyLink.click();



    }

    @Then("user sees the following modules")
    public void user_sees_the_following_modules(List<String> modulesExpectedNames) {

        List<String> actualModules = new ArrayList<>();

        for (WebElement each : companyPage.modulesActualList) {
            actualModules.add(each.getText());


        }



        Assert.assertEquals(modulesExpectedNames,actualModules);

    }












}
