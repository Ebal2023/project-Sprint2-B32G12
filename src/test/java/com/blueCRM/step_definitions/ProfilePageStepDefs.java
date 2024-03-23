package com.blueCRM.step_definitions;

import com.blueCRM.pages.LoginPage;
import com.blueCRM.pages.ProfilePage;
import com.blueCRM.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ProfilePageStepDefs {

    ProfilePage profilePage = new ProfilePage();
    LoginPage loginPage = new LoginPage();

    @When("user login as hr")
    public void userLoginAsHr() {
        loginPage.login(ConfigurationReader.getProperty("hr_username"), ConfigurationReader.getProperty("hr_password"));
    }

    @When("user clicks profile dropdown")
    public void user_clicks_profile_dropdown() {

        profilePage.profilePagebutton.click();
    }

    @When("user clicks My Profile option from profile options")
    public void user_clicks_my_profile_option_from_profile_options() {
        profilePage.profilePagebutton.click();

    }

    @Then("user should be able to see the following options on My Profile")
    public void user_should_be_able_to_see_the_following_options_on_my_profile(List<String> webTexts) {

        List<WebElement> actualWeb = profilePage.profileElements;

        List<String> texts = new ArrayList<>();

        for (WebElement each : actualWeb
        ) {
            texts.add(each.getText());

        }

        Assert.assertEquals(webTexts,actualWeb);

    }

    @Then("user should be able to see the email {string} under the General tab is the same as the user’s account.")
    public void userShouldBeAbleToSeeTheEmailUnderTheGeneralTabIsTheSameAsTheUserSAccount(String email) {

        String actualEmail = profilePage.emailText.getText();
        Assert.assertEquals(actualEmail,email);

    }
}







