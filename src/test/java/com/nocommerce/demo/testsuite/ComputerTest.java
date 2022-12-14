package com.nocommerce.demo.testsuite;

import com.nocommerce.demo.pages.ComputerPage;
import com.nocommerce.demo.pages.HomePage;
import com.nocommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ComputerTest extends BaseTest {
    HomePage homePage;
    ComputerPage computerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
    }

    @Test (groups = {"sanity","regression"})
    public void verifyProductAddedToShoppingCartSuccessFully() throws StaleElementReferenceException, InterruptedException {
        computerPage.clickOnComputer();
        computerPage.clickOnDesktop();
        computerPage.getSelectByValue("5");
        computerPage.clickOnAddToCart();
        Assert.assertEquals(computerPage.getVerifyBuildYourOwn(), "Build your own computer", "Error message not displayed");

        computerPage.selectProcessorByValue("1");
        computerPage.selectRamByValue("5");
        computerPage.clickOnHDD400GB();
        computerPage.clickOnOsVistaPremium();
        computerPage.clickOnSoftwareTotalCommander();
        computerPage.clickOnAddToCartButton();
        Assert.assertEquals(computerPage.verifyCaryMessage(), "The product has been added to your shopping cart", "Error message not displayed");

        computerPage.closeMessageBar();
        computerPage.mouseHoverOnElementShoppingCart();
        computerPage.clickOnGoToCart();
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[contains(text(),'Shopping cart')]")), "Shopping cart");
        computerPage.mouseHoverOnElementShoppingCart();
        computerPage.clickOnGoToCart();
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[contains(text(),'Shopping cart')]")), "Shopping cart");
        computerPage.clearTextInQuantityField();
        computerPage.sendTextToQuantityField();
        computerPage.clickOnUpdateShoppingCartButton();
        computerPage.clickOnCheckBoxIAgreeWithTermsAndCondition();
        computerPage.clickOnCheckOutButton();
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]")), "Welcome, Please Sign In!");
        computerPage.clickOnCheckOutAsGuest();
        computerPage.sendTextToFirstNameField("Vimal");
        computerPage.sendTextToLastNameField("Pankhniya");
        computerPage.sendTextToEmailField("test123@gmail.com");
        computerPage.sendTextToCompanyField("Password1234");
        computerPage.selectCountryFromDropDownList();
        computerPage.sendTextToCityField("London");
        computerPage.sendTextToAddressLine1("London Road");
        computerPage.sendTextToAddressLine2("London");
        computerPage.sendTextToPostcode("NW9 0PY");
        computerPage.sendTextToPhoneNumberField("07868454545");
        computerPage.clickOnContinueButton();
        computerPage.clickOnNextDayAirButton();
        computerPage.clickOnContinueButtonAgain();
        computerPage.clickOnCreditCardButton();
        computerPage.selectClickOnContinue1();
        computerPage.selectMasterCardFromCreditCardDropdown("MasterCard");
        computerPage.sendTextTOCardHolderName("V Pankhaniya");
        computerPage.sendTextTOCardNumber("1111222233334444");
        computerPage.selectMonthAndYearForCreditCardExpireData();
        computerPage.sendTextToCardCode("486");
        computerPage.clickOnContinueButton2();
        Thread.sleep(2000);
        Assert.assertEquals(computerPage.getVerifyText1(), "Credit Card", "Error Message not displayed");
        Assert.assertEquals(computerPage.getVerifyText2(), "Next Day Air", "Error Message not displayed");
        computerPage.clickOnConformButton();
        Assert.assertEquals(computerPage.getVerifyText4(), "Checkout", "Error Message not displayed");
        Assert.assertEquals(computerPage.getVerifyText5(), "Your order has been successfully processed!", "Error Message not displayed");
        computerPage.clickOnContinueButton3();
        Thread.sleep(2000);

    }
}









