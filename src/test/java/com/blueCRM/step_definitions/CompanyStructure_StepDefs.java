package com.blueCRM.step_definitions;

import com.blueCRM.pages.AddDepartmentPage;
import com.blueCRM.pages.CompanyStructurePage;
import com.blueCRM.utilities.BrowserUtils;
import com.blueCRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class CompanyStructure_StepDefs {

    CompanyStructurePage companyPage = new CompanyStructurePage();
    AddDepartmentPage departmentPage = new AddDepartmentPage();




    @When("the user navigates to the Company Structure under the Employee menu")
    public void the_user_navigates_to_the_company_structure_under_the_employee_menu() {

        companyPage.employeeTab.click();


    }


    @Then("the {string} should be displayed")
    public void theShouldBeDisplayed(String arg0) {

        String actualTitle = companyPage.mainHeader.getText();

        BrowserUtils.verifyTitleContains(actualTitle);

    }



    @When("the user attempts to add a department")
    public void theUserAttemptsToAddADepartment() {
        companyPage.addDepartment.click();

    }






    @When("the user enter {string} in popup-window")
    public void the_user_enter_in_popup_window(String string) {

        departmentPage.inputDept.sendKeys(string);


    }



    @And("the user select {string} from popup-window")
    public void theUserSelectFromPopupWindow(String department) {
        //departmentPage.selectParentDept(department);


    }

    @And("the user click add button")
    public void theUserClickAddButton() {
        departmentPage.addButton.click();
    }

    @Then("the {string} should be added successfully")
    public void the_should_be_added_successfully(String string) {
        //BrowserUtils.dropdownOptions_as_STRING((WebElement) departmentPage.listOfDepartment).contains(string);
        Assert.assertTrue(BrowserUtils.dropdownOptions_as_STRING(departmentPage.dropDownList).contains(string));



    }


}
