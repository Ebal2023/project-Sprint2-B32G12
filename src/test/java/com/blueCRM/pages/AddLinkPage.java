package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddLinkPage {


    public AddLinkPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

@FindBy  (xpath = "//span[@class='feed-add-post-form-link feed-add-post-form-link-active']")
public WebElement MessageTab;

   @FindBy (xpath = "//input[@value='Save']")
   public WebElement linkIcon;

    @FindBy(id="linkidPostFormLHE_blogPostForm-href")
    public WebElement LinkUrlBox;

    @FindBy(xpath = "//input[@name='undefined']")
    public WebElement saveButton;

    @FindBy(id="blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(id="linkidPostFormLHE_blogPostForm-text")
    public WebElement LinkTextBox;

}
