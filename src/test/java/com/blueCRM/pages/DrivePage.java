package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DrivePage {

    public DrivePage() {

        PageFactory.initElements(Driver.getDriver(), this);


    }

    @FindBy(xpath = "//span[*= 'My Drive']")
    public WebElement myDriveModule;

    @FindBy(xpath = "//span[*= 'All Documents']")
    public WebElement allDocumentsModule;
    @FindBy(xpath = "//span[*= 'Company Drive']")
    public WebElement companyDriveModule;
    @FindBy(xpath = "//span[*= 'Sales and Marketing']")
    public WebElement salesAndMarketingModule;
    @FindBy(xpath = "//span[*= 'Top Management's documents']")
    public WebElement topManagementDocumentsModule;

    @FindBy(xpath = "//span[*= 'Drive Cleanup']")
    public WebElement driveCleanupModule;




}
