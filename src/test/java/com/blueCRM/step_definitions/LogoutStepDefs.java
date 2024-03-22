package com.blueCRM.step_definitions;

import com.blueCRM.pages.LogoutPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDefs {
LogoutPage logoutPage = new LogoutPage();


    @When("the user clicks profile picture")
    public void the_user_clicks_profile_picture() {
        logoutPage.profileIcon.click();

    }
    @When("the user clicks Log out option")
    public void the_user_clicks_log_out_option() {
        logoutPage.logoutOption.click();

    }
    @Then("the user gets Logged out successfully")
    public void the_user_gets_logged_out_successfully() {


    }
}
