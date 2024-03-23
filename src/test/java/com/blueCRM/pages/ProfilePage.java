package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfilePage {

    public void ProfilePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[contains(@class,'menu-popup-item-text')]")
    public List<WebElement> profileElements;

    @FindBy(xpath = "//a[.='My Profile']")
    public WebElement profilePagebutton;


    @FindBy(xpath = "//td[.='E-Mail:']/..//a")
    public WebElement emailText;

    @FindBy(xpath = "//div[@onclick='showUserMenu()']")
    public WebElement userProfileDropdown;

}
