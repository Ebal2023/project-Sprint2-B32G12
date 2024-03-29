package com.blueCRM.step_definitions;

import com.blueCRM.pages.ActivityStreamPage;
import com.blueCRM.pages.AppreciationPage;
import com.blueCRM.utilities.BrowserUtils;
import com.blueCRM.utilities.ConfigurationReader;
import com.blueCRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class AppreciationStepDefs {
    // Initialize page objects
    ActivityStreamPage streamPage = new ActivityStreamPage();
    AppreciationPage appreciation = new AppreciationPage();

    @Given("is on the {string} page")
    public void theUserIsOnThePage(String moduleName) {


        if (!(Driver.getDriver().getTitle().contains("Portal"))) {
            streamPage.navigateToModule(moduleName);
        }

    }

    @When("the user clicks on the More drop-down")
    public void user_clicks_on_the_more_drop_down() {
        streamPage.activityMenuMoreDropDown.click();
    }

    @When("selects the {string} option")
    public void selects_related_option_from_drop_down(String optionName) {
        streamPage.navigateToActivityMoreMenuOptions(optionName);
    }


    @Then("user sees {string} message posted on the feed")
    public void user_should_see_posted_on_the_feed(String expectedLastPost) {
        Assert.assertEquals(expectedLastPost, appreciation.lastPostInFeed.getText());
    }

    @When("clicks on the upload files icon")
    public void clicks_on_the_upload_files_icon() {
        appreciation.uploadFileIcon.click();
    }

    @When("selects the {string} file from the specified directory")
    public void selects_a_file_from_the_files_directory(String fileType) {
        String filePath = ConfigurationReader.getProperty(fileType + "_file_path"); //getting file path
        String projectPath = System.getProperty("user.dir"); //getting user details
        String fullPath = projectPath + "/" + filePath;
        appreciation.uploadFilesAndImageInput.sendKeys(fullPath);
    }


    @Then("the user sees the newly uploaded file\\(s) name\\(s)")
    public void the_user_should_be_able_to_see_uploaded_file_s_name_s() {
        for (WebElement eachFile : appreciation.uploadedFilesList) {
            Assert.assertTrue(eachFile.isDisplayed());
        }

    }

    @When("writes {string} in the editor box")
    public void writes_in_the_editor_box(String appreciationMsg) {
        Driver.getDriver().switchTo().frame(streamPage.editorIframe);
        appreciation.appreciationEditor.sendKeys(appreciationMsg);
        Driver.getDriver().switchTo().defaultContent();
    }

    @When("clicks on send button")
    public void clicks_on_send_button() {
        Driver.getDriver().switchTo().defaultContent();
        appreciation.sendButton.click();
    }


    @And("clicks on the Insert in text button")
    public void clicksOnTheInsertInTextButton() {
        appreciation.insertInTextBtn.click();
    }

    @Then("the user sees the newly inserted file in text area")
    public void theUserSeesTheNewlyInsertedFileInTextArea() {
        Driver.getDriver().switchTo().frame(appreciation.editorIframe);
        Assert.assertTrue(appreciation.newlyInsertedFile.isDisplayed());
        Driver.getDriver().switchTo().defaultContent();
    }

    @And("clicks on the x icon next to the uploaded file")
    public void clicksOnTheXIconNextToTheUploadedFile() {
        BrowserUtils.waitForClickablility(appreciation.removeAllEmployeeBtn, 5);
        appreciation.removeFileIcon.click();

    }

    @Then("the uploaded file is no longer visible")
    public void theUploadedFileIsNoLongerVisible() {
        Assert.assertTrue(appreciation.uploadedFilesList.isEmpty());

    }

    @And("clicks on the x button on the All employees button")
    public void clicksOnTheXButtonOnTheAllEmployeesButton() {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", appreciation.removeAllEmployeeBtn);
    }

    @When("the user attempts to send an appreciation without message content")
    public void theUserAttemptsToSendAnAppreciationWithoutMessageContent() {
        appreciation.sendButton.click();
    }


    @Then("the system displays an error message {string}")
    public void theSystemDisplaysAnErrorMessage(String expectedErrorMessage) {
        Assert.assertEquals(expectedErrorMessage,appreciation.errorMessage.getText());
    }

    @When("the user attempts to send an appreciation without recipient")
    public void theUserAttemptsToSendAnAppreciationWithoutRecipient() {
        appreciation.removeAllEmployeeBtn.click();
        appreciation.sendButton.click();
    }

    @Then("user sees message sent to the {string} on the feed")
    public void userSeesMessageSentToTheOnTheFeed(String expectedRecipient) {
        Assert.assertEquals(expectedRecipient,appreciation.lastMessageRecipientInFeed.getText());
    }

    @And("adds a recipient {string} to the To field")
    public void addsARecipientToTheToField(String recipient) {
        appreciation.removeAllEmployeeBtn.click();
        appreciation.addRecipientLink.click();
        appreciation.recipientInputBox.sendKeys(recipient+ Keys.ENTER);


    }

    @And("clicks on cancel button")
    public void clicksOnCancelButton() {
        appreciation.cancelButton.click();
    }

    @Then("the user sees the message box collapse")
    public void theUserSeesTheMessageBoxCollapse() {
        Assert.assertFalse(appreciation.sendButton.isDisplayed());
    }
}