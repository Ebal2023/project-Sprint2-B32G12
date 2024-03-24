package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyStructurePage {

    public CompanyStructurePage(){
        PageFactory.initElements(Driver.getDriver(),this);



    }

    @FindBy(xpath = "//span[@class='pagetitle-item']")
    public WebElement mainHeader;

    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[10]")
    public WebElement employeeTab;

    @FindBy(xpath = "//a[@class='webform-small-button webform-small-button-blue webform-small-button-add']")
    public WebElement addDepartment;

    public boolean isDisplayed(WebElement addDepartment){
        try{
            return (!addDepartment.isDisplayed());

        }catch (NoSuchElementException e){
            return false;
        }


    }



}
