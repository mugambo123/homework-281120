package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class CustomersPage extends Utility {
    By selectCustomer = By.xpath("//select[@id='userSelect']");

    //This method select created customer to login
    public void searchCreatedCustomerFromDropDown(String name, int index) {
        Reporter.log("Select Created Customer to Login " + selectCustomer + "<br>");
        implicitWait(10);
        clickOnElement(selectCustomer);
        implicitWait(10);
        selectByIndexFromDropDown(selectCustomer, index);
    }
}
