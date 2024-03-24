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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class MessageUpload_StepDefinitions {

    MessagePage messagePage = new MessagePage();
    LoginPage loginPage = new LoginPage();

    /*
    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equalsIgnoreCase("hr")){
            username = ConfigurationReader.getProperty("hr_username");
            password = ConfigurationReader.getProperty("hr_password");
        }else if(userType.equalsIgnoreCase("helpdesk")){
            username = ConfigurationReader.getProperty("helpdesk_username");
            password = ConfigurationReader.getProperty("helpdesk_password");
        }else if(userType.equalsIgnoreCase("marketing")){
            username = ConfigurationReader.getProperty("marketing_username");
            password = ConfigurationReader.getProperty("marketing_password");
        }
        //send username and password and login
        loginPage.login(username, password);
    }

*/
    @Given("the user is logged in as hr")
    public void theUserIsLoggedInAsHr() {
        loginPage.login(ConfigurationReader.getProperty("hr_username"), ConfigurationReader.getProperty("hr_password"));
    }

    @Given("user is on the Activity Stream")
    public void userIsOnTheActivityStream() {
        if (!(Driver.getDriver().getTitle().contains("Portal"))) {
            messagePage.activityStream.click();
        }
    }

    @When("user clicks on the Message")
    public void userClicksOnTheMessage() {
        messagePage.messageMenuOption.click();
    }

    @And("then user clicks on the upload icon")
    public void thenUserClicksOnTheUploadIcon() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(messagePage.uploadIcon));
        messagePage.uploadIcon.click();
        System.out.println( System.getProperty("user.dir") + "/" + ConfigurationReader.getProperty("pdf_file_path"));


    }

    @When("user uploads {string}")
    public void user_uploads(String supportedFileType) {

/*
        String filePath = ConfigurationReader.getProperty(supportedFileType + "_file_path"); //getting file path
        String projectPath=System.getProperty("user.dir"); //getting user details
        String fullPath=projectPath+"/"+filePath;
        messagePage.uploadButton.sendKeys(fullPath);

       */


        switch (supportedFileType) {
            case ".pdf":
                String fullPath = "/Users/vladabazel/IdeaProjects/project-Sprint2-B32G12/src/test/resources/files_and_pictures/TestPDFfile.pdf";
                messagePage.uploadButton.sendKeys(fullPath);
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
        Assert.assertTrue(messagePage.uploadSuccess.isDisplayed());
    }

    @When("user clicks on insert in text button")
    public void user_clicks_on_insert_in_text_button() {
        messagePage.insertInTextButton.click();
    }

    @Then("user sees file or images as part of text")
    public void user_sees_file_or_images_as_part_of_text() {
        Driver.getDriver().switchTo().frame(messagePage.messageBody);
        Assert.assertTrue(messagePage.fileInText.isDisplayed());
    }

    @When("user clicks on X icon to remove image or file")
    public void user_clicks_on_x_icon_to_remove_image_or_file() {
        Driver.getDriver().switchTo().parentFrame();
        messagePage.removeAttachmentButton.click();
    }
    @Then("user sees file or images are removed from the message")
    public void user_sees_file_or_images_are_removed_from_the_message() {



/*
        boolean isRemoved;
        try {
            isRemoved = !messagePage.uploadSuccess.isDisplayed();
        } catch (NoSuchElementException e) {
            isRemoved = true;
        }
        Assert.assertTrue(isRemoved);
*/
    }





}
