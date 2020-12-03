package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class AccountPage extends Utility {
    By deposit = By.xpath("//button[@ng-click = 'deposit()']");
    By enterAmount = By.xpath("//input[@ng-model = 'amount']");
    By submitDeposit = By.xpath("//button[@type = 'submit' and contains(text(),Deposit)]");
    By depositSuccessfulMessage = By.xpath("//span[contains(text(),'Deposit Successful')]");
    By withdrawl = By.xpath(" //button[@ng-click = 'withdrawl()']");
    By submitWithdraw = By.xpath("//button[@type = 'submit' and contains(text(),Withdraw)]");
    By transactionSuccessfulMessage = By.xpath("//span[contains(text(),'Transaction successful')]");

    //This method to click on deposit
    public void clickOnDepositTab() {
        implicitWait(10);
        Reporter.log("Click on Deposit Tab " + deposit + "<br>");
        clickOnElement(deposit);
    }

    //This method is for entering deposit amount
    public void enterAmount(String amount) {

        implicitWait(10);
        sendTextToElement(enterAmount, amount);
    }

    //This method is to submit deposit
    public void submitDeposit() {
        Reporter.log("Submit Deposit Button " + submitDeposit + "<br>");
        implicitWait(10);
        clickOnElement(submitDeposit);
    }

    //This method is to get deposit message successful
    public String getDepositSuccessfulMessage() {
        Reporter.log("Get successful deposit message " + depositSuccessfulMessage + "<br>");
        implicitWait(10);
        return getTextFromElement(depositSuccessfulMessage);
    }

    //This method is to click on Withdrawl button
    public void clickOnWithdrawlButton() {
        Reporter.log("Click on withdrawl button " + withdrawl + "<br>");
        implicitWait(10);
        clickOnElement(withdrawl);
    }

    //This method to submit Withdraw
    public void submitWithdraw() {
        Reporter.log("To submit Withdraw " + submitWithdraw + "<br>");
        implicitWait(10);
        clickOnElement(submitWithdraw);
    }

    //This method is to get "Transaction Successful" message
    public String getTransactionSuccessfulMessage() {
        Reporter.log("Get successful Transaction Successful message " + transactionSuccessfulMessage + "<br>");
        implicitWait(10);
        return getTextFromElement(transactionSuccessfulMessage);
    }
}


