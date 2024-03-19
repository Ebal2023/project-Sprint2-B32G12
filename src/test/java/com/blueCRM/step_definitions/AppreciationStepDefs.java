package com.blueCRM.step_definitions;
import com.blueCRM.pages.ActivityStreamPage;
import com.blueCRM.pages.AppreciationPage;
import com.blueCRM.utilities.BrowserUtils;
import com.blueCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class AppreciationStepDefs {
    // Initialize page objects
    ActivityStreamPage streamPage = new ActivityStreamPage();
    AppreciationPage appreciation = new AppreciationPage();

    @Given("is on the {string} page")
    public void theUserIsOnThePage(String moduleName) {
        streamPage.navigateToModule(moduleName);
    }

    @When("the user clicks on the More drop-down")
    public void user_clicks_on_the_more_drop_down() {
        streamPage.activityMenuMoreDropDown.click();
    }

    @When("selects the {string} option")
    public void selects_related_option_from_drop_down(String optionName) {
        streamPage.navigateToActivityMoreMenuOptions(optionName);
    }



    @Then("user should see {string} message posted on the feed")
    public void user_should_see_posted_on_the_feed(String expectedLastPost) {
        Assert.assertEquals(expectedLastPost,appreciation.lastPostInFeed.getText());
    }

    @When("clicks on the upload files icon")
    public void clicks_on_the_upload_files_icon() {
        appreciation.uploadFileIcon.click();
    }
    @When("selects file\\(s) and or picture\\(s)")
    public void selects_a_file_and_or_a_picture() {
        String filePath="/Users/amrullah/Downloads/Introduction_To_Selenium.pdf";
        appreciation.uploadFilesAndImageInput.sendKeys(filePath);

        String imagePath="/Users/amrullah/Downloads/advantages-of-selenium.png";
        appreciation.uploadFilesAndImageInput.sendKeys(imagePath);
    }


    @Then("the user sees the newly uploaded file\\(s) name\\(s)")
    public void the_user_should_be_able_to_see_uploaded_file_s_name_s() {
        for (WebElement eachFile : appreciation.uploadedFilesList) {
            BrowserUtils.waitForVisibility(eachFile,10);
            Assert.assertTrue(eachFile.isDisplayed());
        }
    }

    @When("writes {string} in the editor box")
    public void writes_in_the_editor_box(String appreciationMsg) {
        Driver.getDriver().switchTo().frame(streamPage.editorIframe);
        appreciation.appreciationEditor.sendKeys(appreciationMsg);
    }
    @When("clicks on send button")
    public void clicks_on_send_button() {
        Driver.getDriver().switchTo().defaultContent();
        appreciation.sendButton.click();
    }


}
