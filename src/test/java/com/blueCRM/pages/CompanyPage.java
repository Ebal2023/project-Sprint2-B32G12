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


    @FindBy(xpath = "//span[*= 'Official Information']")
    public WebElement OfficialInformationModule;

    @FindBy(xpath = "//span[*= 'Our Life']")
    public WebElement OurLifeModule;

    @FindBy(xpath = "//span[*= 'About Company']")
    public WebElement AboutCompanyModule;

    @FindBy(xpath = "//span[*= 'Photo Gallery']")
    public WebElement PhotoGalleryModule;

    @FindBy(xpath = "//span[*= 'Video']")
    public WebElement VideoModule;

    @FindBy(xpath = "//span[*= 'Career']")
    public WebElement CareerModule;

    @FindBy(xpath = "//span[*= 'Business News (RSS)']")
    public WebElement BusinessNewsModule;

    @FindBy(xpath = "//span[.= 'More']")
    public WebElement MoreModule;

    @FindBy(xpath = "//*[@id=\"bx_left_menu_menu_about_sect\"]/a/span")
    public WebElement Company;




}


