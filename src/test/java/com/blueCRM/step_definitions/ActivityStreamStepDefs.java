package com.blueCRM.step_definitions;

import com.blueCRM.pages.ActivityStreamPage;
import com.blueCRM.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ActivityStreamStepDefs {

    public Object navigate;
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @When("user is on the Activity Stream page")
    public void user_is_on_the_activity_stream_page() {
        System.out.println("User is on the Activity Stream page as homepage");

    }
    @Then("user views the following options on the Activity Stream page")
    public void user_views_the_following_options_on_the_activity_stream_page(List<String> expectedModules){

        List<String> actualModules = new ArrayList<>();

//        actualModules.add(activityStreamPage.messageModule.getText());
//        actualModules.add(activityStreamPage.taskModule.getText());
//        actualModules.add(activityStreamPage.eventModule.getText());
//        actualModules.add(activityStreamPage.pollModule.getText());
//        actualModules.add(activityStreamPage.moreModule.getText());

//        for (WebElement eachModuleOption : activityStreamPage.moduleOptions) {
//            actualModules.add(eachModuleOption.getText());
//        }

        actualModules = BrowserUtils.getElementsText(activityStreamPage.moduleOptions);
        Assert.assertEquals(expectedModules,actualModules);

    }

    @When("user clicks on the MORE tab")
    public void user_clicks_on_the_more_tab() {
        activityStreamPage.moreModule.click();
    }


    @Then("user views the following options under the MORE tab")
    public void userViewsTheFollowingOptionsUnderTheMORETab(List<String> expectedMoreOptions) {

        BrowserUtils.waitForTitleContains("Portal");
        List<String> actualMoreOptions = new ArrayList<>();
//        for (WebElement eachMoreOption : activityStreamPage.allOptionsOfMoreDropdown) {
//            actualMoreOptions.add(eachMoreOption.getText());
//        }
        actualMoreOptions = BrowserUtils.getElementsText(activityStreamPage.allOptionsOfMoreDropdown);
        Assert.assertEquals(expectedMoreOptions,actualMoreOptions);

    }

}
