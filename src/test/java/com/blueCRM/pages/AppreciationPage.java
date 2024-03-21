package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AppreciationPage extends ActivityStreamPage {
    public AppreciationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//span[contains(@id, 'bxid')]")
    public WebElement newlyInsertedFile;

    @FindBy(xpath = "//span[@class='feed-add-post-loading']")
    public WebElement fileUploadLoadingBar;

    @FindBy(xpath = "//span[@class='del-but']")
    public WebElement removeFileIcon;
    @FindBy(xpath ="(//span[.='Insert in text'])[2]")
    public WebElement insertInTextBtn;
    @FindBy(tagName = "body")
    public WebElement appreciationEditor;

    @FindBy(xpath = "(//span[@title='Upload files'])[1]")
    public WebElement uploadFileIcon;

    @FindBy(xpath = "(//input[@type='file'])[1]")
    public WebElement uploadFilesAndImageInput;

    @FindBy(xpath = "//span[@title='Click to insert file']")
    public List<WebElement> uploadedFilesList;

    @FindBy(id="blog-submit-button-save")
    public WebElement sendButton;



}
