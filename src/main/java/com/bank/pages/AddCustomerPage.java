package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {

    By entrFirstName = By.xpath("//input[@placeholder = 'First Name']");
    By entrLastName = By.xpath("//input[@placeholder = 'Last Name']");
    By entrPostcode = By.xpath("//input[@placeholder = 'Post Code']");
    By addCustomerButton = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]");


    //This method is to Enter First Name to add customer
    public void enterFirstName(String firstName) {
        Reporter.log("Enter FirstName To Add Customer :" + firstName + " " + entrFirstName + "<br>");
        implicitWait(10);
        sendTextToElement(entrFirstName, firstName);
    }

    //This method is to Enter Last Name to add customer
    public void enterLastName(String lastName) {
        Reporter.log("Enter FirstName To Add Customer " + lastName + " " + entrLastName + "<br>");
        implicitWait(10);
        sendTextToElement(entrLastName, lastName);
    }

    //This method is to enter Postcode to add customer
    public void enterPostcode(String postcode) {
        Reporter.log("Enter Postcode to add customer " + postcode + " " + entrPostcode + "<br>");
        implicitWait(10);
        sendTextToElement(entrPostcode, postcode);
    }

    //This method click on add customer tab
    public void clickOnAddCustomerButton() {
        implicitWait(10);
        clickOnElement(addCustomerButton);
    }


}
