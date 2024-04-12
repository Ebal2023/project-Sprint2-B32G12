package com.blueCRM.step_definitions;

import com.blueCRM.pages.LoginPage;
import com.blueCRM.pages.ProfilePage;
import com.blueCRM.pages.ProfilePage2;
import com.blueCRM.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProfilePageStepDefs {

    ProfilePage profilePage = new ProfilePage();
    ProfilePage2 profilePage2 = new ProfilePage2();


    @When("user clicks profile dropdown")
    public void user_clicks_profile_dropdown() {

        profilePage.mainProfile.click();
    }

    @When("user clicks My Profile option from profile options")
    public void user_clicks_my_profile_option_from_profile_options() {

        profilePage.profilePagebutton.click();

    }

    @Then("user should be able to see the following options on My Profile")
    public void user_should_be_able_to_see_the_following_options_on_my_profile(List<String> webTexts) {


        List<WebElement> actualWeb = new ArrayList<>(Arrays.asList());
        actualWeb.addAll(profilePage.profileElements);

        List<String> texts = new ArrayList<>();

        for (WebElement each : actualWeb
        ) {
            texts.add(each.getText());

        }

        Assert.assertEquals(webTexts, texts);

    }

    @Then("user should be able to see the email {string} under the General tab is the same as the user’s account.")
    public void userShouldBeAbleToSeeTheEmailUnderTheGeneralTabIsTheSameAsTheUserSAccount(String email) {
        String actualEmail = profilePage2.emailText.getText();
        Assert.assertEquals(actualEmail, email);
    }
}







