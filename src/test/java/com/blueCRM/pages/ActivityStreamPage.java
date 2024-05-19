package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivityStreamPage {
    public ActivityStreamPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//div[contains(@id, 'blog_post_body')])[1]")
    public WebElement lastPostInFeed;

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement activityMenuMoreDropDown;

    @FindBy(className = "bx-editor-iframe")
    public WebElement editorIframe;

    @FindBy(id="left-menu-more-btn")
    public WebElement leftMenuMoreDropDown;



    @FindBy(id="feed-add-post-form-tab-message")
    public WebElement messageModule;

    @FindBy(id="feed-add-post-form-tab-tasks")
    public  WebElement taskModule;

    @FindBy(id="feed-add-post-form-tab-calendar")
    public  WebElement eventModule;

    @FindBy(id="feed-add-post-form-tab-vote")
    public  WebElement pollModule;

    @FindBy(id="feed-add-post-form-link-more")
    public  WebElement moreModule;

    @FindBy(css = ".menu-popup-item-text")
    public List<WebElement> allOptionsOfMoreDropdown;









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


    public void navigateToActivityMoreMenuOptions(String menuName) {
        String locator = "(//span[.='" + menuName + "'])[2]";
        Driver.getDriver().findElement(By.xpath(locator)).click();
    }





}
