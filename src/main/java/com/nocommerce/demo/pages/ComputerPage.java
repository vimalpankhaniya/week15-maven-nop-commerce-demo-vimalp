package com.nocommerce.demo.pages;

import com.nocommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[@href='/computers']")
    WebElement computerPage;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='title']//a")
    WebElement desktopMenu;

    @CacheLookup
    @FindBy(xpath = "//select[@name='products-orderby']")
    WebElement selectByValue;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement verifyBuildYourOwn;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement selectProcessor;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;

    @CacheLookup
    @FindBy(xpath = "//label[text()='400 GB [+$100.00]']")
    WebElement selectHDD;

    @CacheLookup
    @FindBy(xpath = "//label[text()='Vista Premium [+$60.00]']")
    WebElement selectOS;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement selectSoftware;

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement verifyTotal;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement verifyCartMsg;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement closeMsg;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement mouseHover;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement verifyShoppingCartMessage;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement mouseHoverOnShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 cart-button']")
    WebElement clickOnGoToCart;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement verifyMessageShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement clearText;

    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement sendTextToQuantity;

    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement clickOnUpdateShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    WebElement verifyTotal1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement clickOnCheckbox;

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement clickOnCheckout;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement VerifyTextWelcome;


    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement clickOnCheckoutAsGuest;

    @CacheLookup
    @FindBy(xpath = "BillingNewAddress_FirstName")
    WebElement sendTextToFirstName;

    @CacheLookup
    @FindBy(xpath = "BillingNewAddress_LastName")
    WebElement sendTextToLastName;

    @CacheLookup
    @FindBy(xpath = "BillingNewAddress_Email")
    WebElement sendTextToEmail;

    @CacheLookup
    @FindBy(xpath = "BillingNewAddress_Company")
    WebElement sendTextToCompany;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement sendTextToCity;

    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Address1")
    WebElement sendTextToAddress1;

    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Address2")
    WebElement sendTextToAddress2;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement sendTextToPostalCode;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement sendTextToPhoneNumber;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
    WebElement clickOnContinue;
    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_1']")
    WebElement clickOnNextDayAir;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]")
    WebElement clickOnContinueTab;

    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement clickOnCreditCard;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement clickOnMasterCard;

    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderName;

    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;

    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCode;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButton2;
    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']/span[2]")
    WebElement verifyText1;

    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']//span[2]")
    WebElement verifyText2;

    @CacheLookup
    @FindBy(xpath = "//tr[@class='order-total']/td[2]/span/strong")
    WebElement verifyText3;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 confirm-order-next-step-button']")
    WebElement confirm;

    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']/h1")
    WebElement verifyText4;

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement verifyText5;

    @CacheLookup
    @FindBy(css = "div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.checkout-page.order-completed-page div.page-body.checkout-data div.section.order-completed div.buttons > button.button-1.order-completed-continue-button")
    WebElement continueButton3;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement verifyText6;


    public void clickOnComputer() {
        Reporter.log("clickOnComputer"+ computerPage.toString());
        clickOnElement(computerPage);
    }

    public void clickOnDesktop() {
        Reporter.log("clickOnDesktop"+ desktopMenu.toString());
        clickOnElement(desktopMenu);
    }

    public void getSelectByValue(String value) {
        Reporter.log("getSelectByValue"+ selectByValue.toString());
        selectByValueFromDropDown(selectByValue, value);
    }

    public void clickOnAddToCart() {
        try {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        } catch (StaleElementReferenceException e) {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        }
        clickOnElement(addToCart);
    }

    public String getVerifyBuildYourOwn() {
        Reporter.log("getVerifyBuildYourOwn"+ verifyBuildYourOwn.toString());
        return getTextFromElement(verifyBuildYourOwn);
    }

    public void selectProcessorByValue(String value) {
        Reporter.log("selectProcessorByValue"+ selectProcessor.toString());
        selectByValueFromDropDown(selectProcessor, value);
    }

    public void selectRamByValue(String value) {
        Reporter.log("selectRamByValue"+ selectRam.toString());
        selectByValueFromDropDown(selectRam, value);
    }

    public void clickOnHDD400GB() {
        Reporter.log("clickOnHDD400GB"+ selectHDD.toString());
        clickOnElement(selectHDD);
    }

    public void clickOnOsVistaPremium() {
        Reporter.log("clickOnOsVistaPremium"+ selectOS.toString());
        clickOnElement(selectOS);
    }

    public void clickOnSoftwareTotalCommander() {
        clickOnElement(selectOS);
    }

    public String verifyTotalPrice() {
        return getTextFromElement(verifyTotal);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public String verifyCaryMessage() {
        return getTextFromElement(verifyCartMsg);
    }

    public void closeMessageBar() {
        clickOnElement(closeMsg);
    }

    public void mouseHoverOnShoppingCart() {
        mouseHoverToElementAndClick(mouseHover);
    }

    public void mouseHoverOnElementShoppingCart() {
        mouseHoverToElement(mouseHoverOnShoppingCart);
    }

    public void clickOnGoToCart() {
        clickOnElement(clickOnGoToCart);
    }

    public void clearTextInQuantityField() {
        Actions actions = new Actions(driver);
        WebElement quantity = driver.findElement((By) clearText);
        quantity.clear();
    }

    public void sendTextToQuantityField() {
        sendTextToElement(sendTextToQuantity, "2");
    }

    public void clickOnUpdateShoppingCartButton() {
        clickOnElement(clickOnUpdateShoppingCart);
    }

    public void clickOnCheckBoxIAgreeWithTermsAndCondition() {
        clickOnElement(clickOnCheckbox);
    }

    public void clickOnCheckOutButton() {
        clickOnElement(clickOnCheckout);
    }

    public void clickOnCheckOutAsGuest() {
        clickOnElement(clickOnCheckoutAsGuest);
    }

    public void sendTextToFirstNameField(String name) {
        sendTextToElement(sendTextToFirstName, name);
    }

    public void sendTextToLastNameField(String lastName) {
        sendTextToElement(sendTextToLastName, lastName);
    }

    public void sendTextToEmailField(String email) {
        sendTextToElement(sendTextToEmail, email);
    }

    public void sendTextToCompanyField(String company) {
        sendTextToElement(sendTextToCompany, company);
    }

    public void selectCountryFromDropDownList() {
        selectByValueFromDropDown(By.xpath("//select[@id='BillingNewAddress_CountryId']"), "158");
    }

    public void sendTextToCityField(String city) {
        sendTextToElement(sendTextToCity, city);
    }

    public void sendTextToAddressLine1(String address) {
        sendTextToElement(sendTextToAddress1, address);
    }

    public void sendTextToAddressLine2(String address) {
        sendTextToElement(sendTextToAddress2, address);
    }

    public void sendTextToPostcode(String postcode) {
        sendTextToElement(sendTextToPostalCode, postcode);
    }

    public void sendTextToPhoneNumberField(String number) {
        sendTextToElement(sendTextToPhoneNumber, number);
    }

    public void clickOnContinueButton() {
        clickOnElement(clickOnContinue);
    }

    public void clickOnNextDayAirButton() {
        clickOnElement(clickOnNextDayAir);
    }

    public void clickOnContinueButtonAgain() {
        clickOnElement(clickOnContinueTab);
    }

    public void clickOnCreditCardButton() {
        clickOnElement(clickOnCreditCard);
    }

    public void selectClickOnContinue1() {
        clickOnElement(continueButton);
    }

    public void selectMasterCardFromCreditCardDropdown(String value) {
        selectByValueFromDropDown(clickOnMasterCard, value);
    }

    public void sendTextTOCardHolderName(String name) {
        sendTextToElement(cardHolderName, name);
    }

    public void sendTextTOCardNumber(String num) {
        sendTextToElement(cardNumber, num);
    }

    public void selectMonthAndYearForCreditCardExpireData() {
        selectByValueFromDropDown(By.id("ExpireMonth"), "5");
        selectByValueFromDropDown(By.id("ExpireYear"), "2024");
    }

    public void sendTextToCardCode(String code) {
        sendTextToElement(cardCode, code);
    }

    public void clickOnContinueButton2() {
        clickOnElement(continueButton2);
    }

    public String getVerifyText1() {
        return getTextFromElement(verifyText1);
    }

    public String getVerifyText2() {
        return getTextFromElement(verifyText2);

    }

    public String getVerifyText3() {
        return getTextFromElement(verifyText3);
    }

    public void clickOnConformButton() {
        clickOnElement(confirm);
    }

    public String getVerifyText4() {
        return getTextFromElement(verifyText4);
    }

    public String getVerifyText5() {
        return getTextFromElement(verifyText5);
    }

    public void clickOnContinueButton3() {
        clickOnElement(continueButton3);
    }

    public String getVerifyText6() {
        return getTextFromElement(verifyText6);

    }


}





























































































