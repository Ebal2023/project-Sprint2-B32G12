package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage {

    public CompanyPage() {

        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(partialLinkText = "Company")
    public WebElement companyLink;

}
