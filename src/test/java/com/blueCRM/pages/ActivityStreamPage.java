package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    public void navigateToActivityTabs(String tabName) {
        String locator = "//span[.='" + tabName + "']/span";
        Driver.getDriver().findElement(By.xpath(locator)).click();
    }

    public void navigateToActivityMoreMenuOptions(String menuName) {
        String locator = "(//span[.='" + menuName + "'])[2]";
        Driver.getDriver().findElement(By.xpath(locator)).click();
    }


}
