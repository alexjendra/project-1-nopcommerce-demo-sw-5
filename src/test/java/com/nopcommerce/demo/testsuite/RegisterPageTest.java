package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Random;

@Listeners(CustomListeners.class)
public class RegisterPageTest extends BaseTest {
    HomePage homePage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        registerPage = new RegisterPage();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        homePage.clickOnRegisterLink();
        String expectedMessage = "Register";
        String actualMessage = registerPage.getWelcomeText();
        Assert.assertEquals(actualMessage, expectedMessage, "Register page not displayed");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {
        homePage.clickOnRegisterLink();
        registerPage.clickOnRegisterButton();

        String expectedFirstNameRequiredMessage = "First name is required.";
        String actualFirstNameRequiredMessage = registerPage.getFirstNameRequiredMessage();
        Assert.assertEquals(actualFirstNameRequiredMessage, expectedFirstNameRequiredMessage, "FirstName error message not displayed");

        String expectedLastNameRequiredMessage = "Last name is required.";
        String actualLastNameRequiredMessage = registerPage.getLastNameRequiredMessage();
        Assert.assertEquals(actualLastNameRequiredMessage, expectedLastNameRequiredMessage, "LastName error message not displayed");

        String expectedEmailRequiredMessage = "Email is required.";
        String actualEmailNameRequiredMessage = registerPage.getEmailRequiredMessage();
        Assert.assertEquals(actualEmailNameRequiredMessage, expectedEmailRequiredMessage, "Email error message not displayed");

        String expectedPasswordRequiredMessage = "Password is required.";
        String actualPasswordRequiredMessage = registerPage.getPasswordRequiredMessage();
        Assert.assertEquals(actualPasswordRequiredMessage, expectedPasswordRequiredMessage, "Password error message not displayed");

        String expectedConfirmPasswordRequiredMessage = "Password is required.";
        String actualConfirmPasswordRequiredMessage = registerPage.getConfirmPasswordRequiredMessage();
        Assert.assertEquals(actualConfirmPasswordRequiredMessage, expectedConfirmPasswordRequiredMessage, "Confirm Password error message not displayed");
    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully() {
        homePage.clickOnRegisterLink();
        registerPage.clickOnRegisterButton();
        registerPage.clickOnFemaleGenderRadioButton();
        registerPage.sendDataToFirstNameField("Abcd");
        registerPage.sendDataToLastNameField("Xyz");
        registerPage.selectDate("1");
        registerPage.selectMonth("March");
        registerPage.selectYear("2023");
        Random random = new Random();
        registerPage.sendDataToEmailField("abcd" + random.nextInt() + "@gmail.com");
        registerPage.sendDataToPasswordField("abcd123");
        registerPage.sendDataToConfirmPasswordField("abcd123");
        registerPage.clickOnRegisterButton();
        String expectedMessage = "Your registration completed";
        String actualMessage = registerPage.getDataFromConfirmationMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "Register completed message not displayed");
    }
}
