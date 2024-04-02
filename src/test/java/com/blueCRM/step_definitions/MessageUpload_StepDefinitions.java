package com.blueCRM.step_definitions;

import com.blueCRM.pages.LoginPage;
import com.blueCRM.pages.MessagePage;
import com.blueCRM.utilities.BrowserUtils;
import com.blueCRM.utilities.ConfigurationReader;
import com.blueCRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class MessageUpload_StepDefinitions {

    MessagePage messagePage = new MessagePage();
    LoginPage loginPage = new LoginPage();

    @Given("user is on the Activity Stream")
    public void userIsOnTheActivityStream() {
        if (!(Driver.getDriver().getTitle().contains("Portal"))) {
            messagePage.activityStream.click();
        }
    }

    @When("user clicks on the Message")
    public void userClicksOnTheMessage() {
        BrowserUtils.waitForVisibility(messagePage.messageMenuOption, 5);
        messagePage.messageMenuOption.click();
    }

    @And("then user clicks on the upload icon")
    public void thenUserClicksOnTheUploadIcon() {
        BrowserUtils.waitForClickablility(messagePage.messageMenuOption, 5);
        messagePage.uploadIcon.click();

    }

    @When("user uploads {string}")
    public void user_uploads(String supportedFileType) {

        switch (supportedFileType) {
            case ".pdf":
                messagePage.uploadButton.sendKeys(System.getProperty("user.dir") + "/" + ConfigurationReader.getProperty("pdf_file_path"));
                break;
            case ".jpeg":
                messagePage.uploadButton.sendKeys(System.getProperty("user.dir") + "/" + ConfigurationReader.getProperty("jpeg_file_path"));
                break;
            case ".png":
                messagePage.uploadButton.sendKeys(System.getProperty("user.dir") + "/" + ConfigurationReader.getProperty("png_file_path"));
                break;
            case ".txt":
                messagePage.uploadButton.sendKeys(System.getProperty("user.dir") + "/" + ConfigurationReader.getProperty("txt_file_path"));
                break;
            default:
                messagePage.uploadButton.sendKeys(System.getProperty("user.dir") + "/" + ConfigurationReader.getProperty("docx_file_path"));
                break;
        }
    }


    @Then("user is able to see that file uploaded")
    public void user_is_able_to_see_that_file_uploaded() {
        BrowserUtils.waitForVisibility(messagePage.uploadSuccess, 5);
        Assert.assertTrue(messagePage.uploadSuccess.isDisplayed());
    }

    @When("user clicks on insert in text button")
    public void user_clicks_on_insert_in_text_button() {
        BrowserUtils.waitForVisibility(messagePage.insertInTextButton, 5);
        messagePage.insertInTextButton.click();
    }

    @Then("user sees file or images as part of text")
    public void user_sees_file_or_images_as_part_of_text() {
        Driver.getDriver().switchTo().frame(messagePage.messageBody);
        BrowserUtils.waitForVisibility(messagePage.fileInText, 5);
        Assert.assertTrue(messagePage.fileInText.isDisplayed());
        Driver.getDriver().switchTo().defaultContent();
    }

    @When("user clicks on X icon to remove image or file")
    public void user_clicks_on_x_icon_to_remove_image_or_file() {
        messagePage.removeAttachmentButton.click();
    }
    @Then("user sees file or images are removed from the message")
    public void user_sees_file_or_images_are_removed_from_the_message() {
        Assert.assertTrue(messagePage.uploadedFileList.isEmpty());

    }





}
