package com.blueCRM.step_definitions;

import com.blueCRM.pages.CompanyPage;
import io.cucumber.java.en.When;

public class CompanyStepDefs {


    CompanyPage companyPage = new CompanyPage();


    @When("user clicks on company page")
    public void user_clicks_on_company_page() {

        companyPage.companyLink.click();



    }







}
