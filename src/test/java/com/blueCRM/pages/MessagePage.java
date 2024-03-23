package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagePage {

    public MessagePage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[1]")
    public WebElement activityStream;

    @FindBy(xpath = "//span[*='Message']")
    public WebElement messageMenuOption;


    @FindBy(xpath = "(//span[@class='feed-add-post-form-but feed-add-file'])[1]")
    public WebElement uploadIcon;

    @FindBy(xpath = "//span[*='Insert in text']")
    public WebElement insertInTextButton;

    @FindBy(xpath = "//span[@class='del-but']")
    public WebElement removeAttachmentButton;


}
