package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {

    By addCustomerTab = By.xpath("//button[@ng-click = 'addCust()']");
    By openAccount = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]");

    //This method is to click on add customer tab
    public void clickOnCustomerTab() {
        Reporter.log("Click on To add Customer Tab " + addCustomerTab + "<br>");
        implicitWait(10);
        clickOnElement(addCustomerTab);
    }

    //This method click on open account by account manager
    public void clickOnOpenAccount() {
        Reporter.log("click on open account by account manager " + openAccount + "<br>");
        implicitWait(10);
        clickOnElement(openAccount);
    }
}
