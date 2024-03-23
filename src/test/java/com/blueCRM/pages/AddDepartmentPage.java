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
    public WebElement dropDown;

    @FindBy(xpath = "//option[contains(text(),'Cyber Vet')]")
    public WebElement dropDownList;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement addButton;

    @FindBy(xpath = "//a[@data-role='department_name']")
    public List<WebElement>  listOfDepartment;

    @FindBy(xpath = "//a[@title='English']")
    public WebElement addeddept;

    public void selectParentDept(String department){
        Select select = new Select(dropDownList);
        select.selectByVisibleText(department);


    }

}
