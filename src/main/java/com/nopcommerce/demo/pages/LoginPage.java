package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    /******************************** All Elements' Path on Login page ***********************************************/

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement loginUnsuccessfulMessage;

    /******************************** All Elements' Action Methods on Login page *************************************/

    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }

    public void sendDataToEmailField (String emailId) {
        sendTextToElement(emailField, emailId);
    }

    public void sendDataToPasswordField (String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public void loginToTheApplication(String emailID, String password) {
        sendDataToEmailField(emailID);
        sendDataToPasswordField(password);
        clickOnLoginButton();
    }

    public String getLoginUnsuccessfulMessage() {
        return getTextFromElement(loginUnsuccessfulMessage);
    }
}
