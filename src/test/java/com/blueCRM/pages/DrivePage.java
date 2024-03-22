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
    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[11]")
    public WebElement topManagementDocumentsModule;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[12]")
    public WebElement driveCleanupModule;
    @FindBy(id = "top_menu_id_docs_more_button")
    public WebElement moreButton;





}
