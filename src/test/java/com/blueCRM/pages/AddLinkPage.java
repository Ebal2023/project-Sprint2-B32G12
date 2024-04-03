package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
public class AddLinkPage extends ActivityStreamPage{




    public AddLinkPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}
@FindBy(xpath = "//*[@id=\"feed-add-post-form-tab-message\"]/span")
public WebElement messageModule;

@FindBy(xpath = "//*[@id=\"bx-b-link-blogPostForm\"]/span/i")
public WebElement linkIcon;

@FindBy(xpath = "//*[@id=\"linkidPostFormLHE_blogPostForm-text\"]")
public WebElement linkTextBox;

@FindBy(xpath = "//*[@id=\"linkidPostFormLHE_blogPostForm-href\"]")
public WebElement LinkUrlBox;

@FindBy(xpath = "//*[@id=\"undefined\"]")
public WebElement saveButton;

@FindBy(xpath = "//*[@id=\"blog-submit-button-save\"]")
public WebElement sendButton;
@FindBy(xpath = "//body/a")
public WebElement attachedLink;

    @FindBy(className = "bx-editor-iframe")
    public WebElement frameName;

@FindBy(xpath = "(//*[contains(@id,'blog_post_body')]/a)[1]")
public WebElement lastLinkInFeed;


    public void navigateToModule(String moduleName) {
        WebElement moduleAsElement = Driver.getDriver().findElement(By.partialLinkText(moduleName));
        try {
            moduleAsElement.click();
        } catch (NoSuchElementException e) {
            leftMenuMoreDropDown.click();
            moduleAsElement=Driver.getDriver().findElement(By.partialLinkText(moduleName));
            moduleAsElement.click();
        }
    }
    public static void verifyURLContains(String expectedInURL){
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInURL));
    }
    }