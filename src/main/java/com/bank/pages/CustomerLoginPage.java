package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {

    By customerLogin = By.xpath("//button[contains(text(),'Login')]");
    By logoutButton = By.xpath("//button[contains(text(),'Logout')]");
    By yourNam = By.xpath("//option[contains(text(),'AAAAA AAAAA')]");

    //This method click on Customer Login Button
    public void clickOnCustomerLoginButton() {
        Reporter.log(" Click on Customer Login Button " + customerLogin + "<br>");
        implicitWait(10);
        clickOnElement(customerLogin);
    }

    //This method to verify logout btn
    public By isLogoutDisplayed() {
        Reporter.log("verification of logout btn " + logoutButton + "<br>");
        implicitWait(10);
        return logoutButton;
    }

    //This method logout customer
    public void logout() {
        Reporter.log("Click on Logout Button " + logoutButton + "<br>");
        implicitWait(10);
        clickOnElement(logoutButton);
    }

    //This method to get text of your name
    public String yourNamText() {
        Reporter.log("Get text of Your Name " + yourNam + "<br>");
        implicitWait(60);
        return getTextFromElement(yourNam);
    }
}


