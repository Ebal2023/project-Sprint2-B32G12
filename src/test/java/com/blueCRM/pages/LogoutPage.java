package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    public LogoutPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }




    @FindBy(id="user-name")
    public WebElement profileIcon;


    @FindBy(xpath = "(//*[@class='menu-popup-item-text'])[5]")
    public WebElement logoutOption;


}
