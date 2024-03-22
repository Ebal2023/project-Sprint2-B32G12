package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class EmployeePage {

    public EmployeePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
