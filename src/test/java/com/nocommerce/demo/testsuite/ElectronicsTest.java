package com.nocommerce.demo.testsuite;

import com.nocommerce.demo.pages.ElectronicsPage;
import com.nocommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    ElectronicsPage electronics;
    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        electronics = new ElectronicsPage();

    }
    @Test (groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {

        electronics.mouseHoverOnElectronics();
        electronics.mouseHoverOnCellPhonesAndClick();
        electronics.verifyTextCellPhones();
    }
    @Test (groups = {"smoke","regression"})
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        electronics.mouseHoverOnElectronics();
        electronics.mouseHoverOnCellPhonesAndClick();
        Assert.assertEquals(electronics.verifyTextCellPhones(), "Cell phones", "Error message not displayed");
        electronics.clickOnListViewTab();
        Thread.sleep(3000);
        electronics.clickOnProductNameNokia();
        Assert.assertEquals(electronics.verifyTextNokiaLumia(), "Nokia Lumia 1020", "Error message not displayed");
        Assert.assertEquals(electronics.verifyNokiaPrice(), "$349.00", "Error message not displayed");
        electronics.clearQuantity();
        Thread.sleep(4000);
        electronics.changeQuantityTo2("2");
        Thread.sleep(3000);
        electronics.clickOnAddToCart();
        electronics.clickOnGreenBar();
        electronics.mouseHoverOnShoppingCart();
        electronics.hoverAndClickOnGoToCart();
        Assert.assertEquals(electronics.verifyMessageShoppingCart(), "Shopping cart", "Error message not displayed");
        Assert.assertEquals(electronics.verifyQuantity(), "(2)", "Error message not displayed");
        Assert.assertEquals(electronics.verifyTotal(), "$698.00", "Error message not displayed");
        electronics.clickOnCheckbox();
        electronics.clickOnCheckout();
        Assert.assertEquals(electronics.verifyTextWelcomePlease(), "Welcome, Please Sign In!", "Error message not displayed");
        electronics.clickOnRegister();
        Assert.assertEquals(electronics.verifyTextRegister(), "Register", "Error message not displayed");
        Thread.sleep(2000);

        electronics.sendTextToFirstNameField("Vimal");
        electronics.sendTextToLastNameField("Pankhaniya");
        electronics.sendTextToEmailField("test123@gmail.com");
        electronics.sendTextToPasswordField("Kingsbury12345");
        electronics.sendTextToConfirmPasswordField("Kingsbury12345");

        electronics.clickOnRegister1();
        Assert.assertEquals(electronics.verifyMessageYourRegistrationCompleted(), "Your registration completed", "Error message not displayed");
        electronics.clickOnContinue();
        Assert.assertEquals(electronics.verifyTextShoppingCart(), "Shopping cart", "Error message not displayed");
        electronics.clickOnCheckbox1();
        electronics.clickOnCheckout1();
        electronics.countryByVisibleText("United Kingdom");
        electronics.sendTextToCity("London");
        electronics.sendTextToAddress("Kingsbury");
        electronics.sendTextToPostelCode("NW9 0PY");
        electronics.sendTextToPhoneNumber("07868111555");

        electronics.clickOnContinue1();
        electronics.clickOn2ndDayAir();
        electronics.clickOnContinue2();
        electronics.clickOnCreditCard();
        electronics.clickOnContinueTab();
        electronics.clickOnSelectCreditCard();
        electronics.sendTextToCardholderName("V Pankhaniya");
        electronics.sendTextToCardNumber("1111222233334444");

        electronics.sendTextToExpirationMonth("10");
        electronics.sendTextToExpirationYear("2027");
        electronics.sendTextToCardCode("684");
        electronics.clickOnContinue3();

        Assert.assertEquals(electronics.verifyPaymentMethod(), "Credit Card", "Error message not displayed");
        Assert.assertEquals(electronics.verifyShoppingMethod(), "2nd Day Air", "Error message not displayed");
        Assert.assertEquals(electronics.verifyTotalPrice(), "$698.00", "Error message not displayed");

        electronics.clickOnConfirm();
        Assert.assertEquals(electronics.verifyTextThankYou(), "Thank you", "Error message not displayed");
        Assert.assertEquals(electronics.verifySuccessfully(), "Your order has been successfully processed!", "Error message not displayed");

        electronics.clickOnContinue4();
        Assert.assertEquals(electronics.verifyWelcomeToOurStore(), "Welcome to our store", "Error message not displayed");
        electronics.clickOnLogout();
        Assert.assertEquals(electronics.verifyCurrentUrl(), "https://demo.nopcommerce.com/");
    }
}
