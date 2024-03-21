package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.css.CSSPageRule;

import javax.management.modelmbean.ModelMBeanInfoSupport;
import java.util.List;

public class CompanyPage {

    public CompanyPage() {

        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(partialLinkText = "Company")
    public WebElement companyLink;


    @FindBy(css = ".main-buttons-item-link" )
    public List<WebElement>  modulesActualList;

}


