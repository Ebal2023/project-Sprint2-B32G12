package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage2 {

    public ProfilePage2(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"content-table\"]/table/tbody/tr[1]/td/div/div[1]/div/div/div[1]/a")
    public WebElement emailText;

}
