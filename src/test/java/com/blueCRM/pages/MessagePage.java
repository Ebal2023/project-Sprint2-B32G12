package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MessagePage extends BasePage{

    public MessagePage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[1]")
    public WebElement activityStream;

    @FindBy(xpath = "//span[*='Message']")
    public WebElement messageMenuOption;


    @FindBy(xpath = "(//*[contains(@id,'bx-b-uploadfile-blogPostForm')])[1]")
    public WebElement uploadIcon;

    @FindBy(xpath = "//span[*='Insert in text']")
    public WebElement insertInTextButton;

    @FindBy(xpath = "//span[@class='del-but']")
    public WebElement removeAttachmentButton;

    @FindBy(xpath = "(//input[@type='file'])[1]")
    public WebElement uploadButton;

    @FindBy(xpath = "//td[@class='files-name']")
    public WebElement uploadSuccess;

    @FindBy(xpath = "//tr[contains(@id,'disk-edit-attachn')]")
    public List<WebElement> uploadedFileList;

    @FindBy (xpath = "//*[contains(@id,'bxid')]")
    public WebElement fileInText;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement messageBody;
}
