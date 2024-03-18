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
