package com.blueCRM.step_definitions;

import com.blueCRM.pages.ActivityStreamPage;
import com.blueCRM.pages.AddLinkPage;
import com.blueCRM.pages.LoginPage;
import com.blueCRM.utilities.BrowserUtils;
import com.blueCRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class AddLinkStepDefs {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    AddLinkPage addLinkPage = new AddLinkPage();



    @Given("on the {string} Page")
    public void on_the_page(String ModuleName) {

        activityStreamPage.navigateToModule(ModuleName);


    }
    @When("user clicks on message module")
    public void user_clicks_on_message_module() {

        addLinkPage.messageModule.click();

    }
    @Given("clicks on link icon")
    public void clicks_on_link_module() {

        addLinkPage.linkIcon.click();
    }
    @Given("enters {string} in linkURLBox")
    public void enters_text_in_link_url_box(String Link) {

        addLinkPage.LinkUrlBox.clear();
        addLinkPage.LinkUrlBox.sendKeys(Link);

    }
    @Given("user clicks save button")
    public void user_clicks_save_button() {

        addLinkPage.saveButton.click();
    }
    @When("user clicks send")
    public void user_clicks_send() {

        addLinkPage.sendButton.click();
    }
    @Then("user will see link open in new tab")
    public void user_will_see_link_open_in_new_tab() {


        Assert.assertTrue(Driver.getDriver().getWindowHandles().size()>1);

    }


    @And("adds {string} to the linkTextBox")
    public void addsToTheLinkTextBox(String text) {
        addLinkPage.linkTextBox.clear();
        addLinkPage.linkTextBox.sendKeys(text);
    }

    @Then("user should see added link in message box")
    public void userShouldSeeAddedLinkInMessageBox() {

        Driver.getDriver().switchTo().frame(addLinkPage.frameName);
        Assert.assertTrue(addLinkPage.attachedLink.isDisplayed());
        Driver.getDriver().switchTo().defaultContent();
    }

    @Then("user will {string} open in new tab")
    public void userWillOpenInNewTab(String arg0) {
    }

    @And("user clicks on attached link in message box")
    public void userClicksOnAttachedLinkInMessageBox() {
        addLinkPage.lastLinkInFeed.click();
    }

    @Then("user is able to navigate to {string}")
    public void userIsAbleToNavigateToTheCorrectURL(String expectedTitle) {
        BrowserUtils.switchToWindow(expectedTitle);
        BrowserUtils.verifyTitleContains(expectedTitle);


    }
}
