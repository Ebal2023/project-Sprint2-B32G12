package com.blueCRM.step_definitions;

import com.blueCRM.pages.ActivityStreamPage;
import com.blueCRM.pages.EmployeePage;
import com.blueCRM.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class EmployeePage_StepDefinitions {


        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        EmployeePage employeePage = new EmployeePage();

        /*@Given("the user clicks on the {string} option")
        public void the_user_clicks_on_the_option(String employee) {

            //specifically navigates to the Employee page
            activityStreamPage.navigateToModule(employee);
        }*/

        @Then("the user sees following modules")
        public void the_user_sees_the_modules(List<String> expectedModules){

            List<String> actualModules = BrowserUtils.getElementsText(employeePage.modules);

            Assert.assertEquals(expectedModules, actualModules);


        }


        // @Then("the {string} module should be displayed by default")
        // public void the_module_should_be_displayed_by_default(String string) {
        //    Assert.assertTrue(employeePage.pagetitleStarModule.isDisplayed());

        // }

        @Then("the Company Structure module is displayed by default")
        public void theCompanyStructureModuleIsDisplayedByDefault() {
            Assert.assertTrue(employeePage.pagetitleStarModule.isDisplayed());
        }
    }
