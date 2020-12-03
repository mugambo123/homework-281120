package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {


By selectCustomer = By.xpath("//select[@id='userSelect']");
By clickCurrency = By.xpath("//select[@id='currency']");
By selectCurrencyFromDropDown = By.xpath("//option[contains(text(),'Pound')]");
By process = By.xpath("//button[contains(text(),'Process')]");

   //This method will select recently created customer
    public void searchCreatedCustomer(String name, int index){
        Reporter.log("Select recently created customer to open account "+ selectCustomer + "<br>");
        clickOnElement(selectCustomer);
        implicitWait(10);
        selectByIndexFromDropDown(selectCustomer,index);
    }
    //This method will select currency for recently created customer
    public void selectCurrencyForCreatedCustomer() {
        implicitWait(10);
        Reporter.log("Select Currency for recently created customer to open account " + selectCurrencyFromDropDown + "<br>");
        clickOnElement(clickCurrency);
        implicitWait(10);
        clickOnElement(selectCurrencyFromDropDown);
    }

    public void clickOnProcess(){
        waitFor(10);
        clickOnElement(process);
    }




}
