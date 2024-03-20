package com.blueCRM.step_definitions;

import com.blueCRM.pages.ActivityStreamPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DrivePage_StepDefinitions {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @Given("the user clicks on the {string} option")
    public void the_user_clicks_on_the_option(String string) {

        //specifically navigates to the Drive page
        activityStreamPage.navigateToModule(string);
    }


    @Then("the user sees the modules")
    public void the_user_sees_the_modules(io.cucumber.datatable.DataTable dataTable) {
        //need to locate each module seperately.
    }
}
