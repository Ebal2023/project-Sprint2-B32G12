package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfilePage {

    public  ProfilePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = "#profile-menu-filter a")
    public List<WebElement> profileElements;

    @FindBy(xpath = "//a/span[.='My Profile']")
    public WebElement profilePagebutton;

    @FindBy(xpath = "//*[@id=\"user-block\"]")
    public WebElement mainProfile;
}
