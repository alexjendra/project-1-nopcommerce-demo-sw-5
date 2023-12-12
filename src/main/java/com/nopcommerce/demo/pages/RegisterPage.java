package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {
    /******************************** All Elements' Path on Register page ***********************************************/

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationConfirmationMessage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement firstNameRequiredMessage;

    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement lastNameRequiredMessage;

    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement emailRequiredMessage;

    @CacheLookup
    @FindBy(id = "Password-error")
    WebElement passwordRequiredMessage;

    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement confirmPasswordRequiredMessage;

    @CacheLookup
    @FindBy(id = "gender-male")
    WebElement maleGenderRadioButton;

    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement femaleGenderRadioButton;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dayDropDownInDateOfBirth;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthDropDownInDateOfBirth;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearDropDownInDateOfBirth;

    /******************************** All Elements' Action Methods on Register page *************************************/

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void sendDataToFirstNameField (String fName){
        sendTextToElement(firstNameField, fName);
    }

    public void sendDataToLastNameField (String lName){
        sendTextToElement(lastNameField, lName);
    }

    public void sendDataToEmailField (String email){
        sendTextToElement(emailField, email);
    }

    public void sendDataToPasswordField (String password){
        sendTextToElement(passwordField, password);
    }

    public void sendDataToConfirmPasswordField (String cPassword){
        sendTextToElement(confirmPasswordField, cPassword);
    }

    public void clickOnRegisterButton () {
        clickOnElement(registerButton);
    }

    public String getDataFromConfirmationMessage () {
        return getTextFromElement(registrationConfirmationMessage);
    }

    public void clickOnContinueButton () {
        clickOnElement(continueButton);
    }

    public String getFirstNameRequiredMessage() {
        return getTextFromElement(firstNameRequiredMessage);
    }

    public String getLastNameRequiredMessage() {
        return getTextFromElement(lastNameRequiredMessage);
    }

    public String getEmailRequiredMessage() {
        return getTextFromElement(emailRequiredMessage);
    }

    public String getPasswordRequiredMessage() {
        return getTextFromElement(passwordRequiredMessage);
    }

    public String getConfirmPasswordRequiredMessage() {
        return getTextFromElement(confirmPasswordRequiredMessage);
    }

    public void clickOnMaleGenderRadioButton() {
        clickOnElement(maleGenderRadioButton);
    }

    public void clickOnFemaleGenderRadioButton() {
        clickOnElement(femaleGenderRadioButton);
    }

    public void selectDate(String date){
        selectByVisibleTextFromDropDown(dayDropDownInDateOfBirth, date);
    }

    public void selectMonth(String month){
        selectByVisibleTextFromDropDown(monthDropDownInDateOfBirth, month);
    }

    public void selectYear(String year){
        selectByVisibleTextFromDropDown(yearDropDownInDateOfBirth, year);
    }
}
