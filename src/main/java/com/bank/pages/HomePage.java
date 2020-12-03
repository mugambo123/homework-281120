package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage extends Utility {
    By customerLogin = By.xpath("//button[contains(text(),'Customer Login')]");
By bankManagerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");

// This method click on customer login

    public void clickOnCustomerLogin(){
        Reporter.log("Click on Customer Login "+ customerLogin + "<br>");
        implicitWait(10);
        clickOnElement(customerLogin);
    }
    //This method click on Bank Manager Login
    public void clickOnBankManagerLogin(){
        Reporter.log("Click on Bank manager Login " + bankManagerLogin + "<br>");
        implicitWait(10);
        clickOnElement(bankManagerLogin);
    }
}
