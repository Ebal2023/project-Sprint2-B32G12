package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AddDepartmentPage extends CompanyStructurePage {

    public AddDepartmentPage(){
        PageFactory.initElements(Driver.getDriver(),this);




    }

    @FindBy(id ="NAME")
    public WebElement inputDept;

    @FindBy(id ="IBLOCK_SECTION_ID")
    public WebElement dropDownList;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement addButton;

    @FindBy(xpath = "//a[@data-role='department_name']")
    public List<WebElement>  listOfDepartment;

    public void selectParentDept(String department){
        Select select = new Select(dropDownList);
        select.selectByVisibleText(department);


    }

}
