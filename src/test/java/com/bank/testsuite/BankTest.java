package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends TestBase {
    HomePage homePage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    AccountPage accountPage = new AccountPage();
CustomersPage customersPage = new CustomersPage();

    // This method will add customer and get pop up(alert) message
    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {

        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.clickOnCustomerTab();
        addCustomerPage.enterFirstName("AAAAA");
        addCustomerPage.enterLastName("AAAAA");
        addCustomerPage.enterPostcode("W01 1WW");
        addCustomerPage.clickOnAddCustomerButton();
        alertHandle();
    }

    //With  this method Bank Manager can open Account after adding Customer successfully
    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {

        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.clickOnOpenAccount();
        openAccountPage.searchCreatedCustomer("AAAAA AAAAA", 1);
        openAccountPage.selectCurrencyForCreatedCustomer();
        openAccountPage.clickOnProcess();
        alertHandle();
    }

    //With this method customer should be able to log in ,log out and verify name
    @Test
    public void customerShouldLoginAndLogoutSuccessfully() {

        homePage.clickOnCustomerLogin();
        customersPage.searchCreatedCustomerFromDropDown("AAAAA AAAAA", 1);
        customerLoginPage.isLogoutDisplayed();
        customerLoginPage.logout();
        String expectedNameText = "AAAAA AAAAA";
        String actualNameText = customerLoginPage.yourNamText();
        Assert.assertEquals(expectedNameText, actualNameText);
    }

    // This method is to deposit money successfully and verify deposit successful message by customer
    @Test
    public void customerShouldDepositMoneySuccessfully() {
        homePage.clickOnCustomerLogin();
        customersPage.searchCreatedCustomerFromDropDown("AAAAA AAAAA", 1);
        customerLoginPage.clickOnCustomerLoginButton();
        accountPage.clickOnDepositTab();
        accountPage.enterAmount("100");
        accountPage.submitDeposit();
        String expectedDepositMessage = "Deposit Successful";
        String actualDepositMessage = accountPage.getDepositSuccessfulMessage();
        Assert.assertEquals(expectedDepositMessage, actualDepositMessage);
    }

    //This method is to verify customer should withdraw money successfully
    @Test
    public void customerShouldWithdrawMoneySuccessfully() {
        homePage.clickOnCustomerLogin();
        customersPage.searchCreatedCustomerFromDropDown("AAAAA AAAAA", 1);
        customerLoginPage.clickOnCustomerLoginButton();
        accountPage.clickOnWithdrawlButton();
        accountPage.enterAmount("50");
        accountPage.submitWithdraw();
        String expectedTransactionSuccessfulMessage = "Transaction successful";
        String actualTransactionalSuccessfulMessage = accountPage.getTransactionSuccessfulMessage();
        Assert.assertEquals(expectedTransactionSuccessfulMessage, actualTransactionalSuccessfulMessage);
    }

}
