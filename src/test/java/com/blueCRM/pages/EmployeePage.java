package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EmployeePage {

    public EmployeePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[*= 'Company Structure']")
    public WebElement companyStructureModule;

    @FindBy(xpath = "//span[*= 'Find Employee']")
    public WebElement findEmployeeModule;
    @FindBy(xpath = "//span[*= 'Telephone Directory']")
    public WebElement telephoneDirectoryModule;
    @FindBy(xpath = "//span[*= 'Staff Changes']")
    public WebElement staffChangesModule;
    @FindBy(xpath = "//span[*= 'Efficiency Report']")
    public WebElement efficiencyReportModule;

    @FindBy(xpath = "//span[*= 'Honored Employees']")
    public WebElement honoredEmployeesModule;

    @FindBy(xpath = "//span[*= 'Birthdays']")
    public WebElement birthdaysModule;

    @FindBy(xpath = "//span[*= 'New Page']")
    public WebElement newPageModule;

    @FindBy(id = "pagetitle-star")
    public  WebElement pagetitleStarModule;

    @FindBy(xpath = "//span[@class=\"main-buttons-item-text-title\"]")
    public List<WebElement> modules;





    @FindBy(xpath = "//span[*= 'More']")
    public WebElement moreButton;

}
