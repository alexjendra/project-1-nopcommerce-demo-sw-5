package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {
    /******************************** All Elements' Path on Computers page ***********************************************/

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement welcomeText;

    @FindBy(xpath = "//li[@class='active last']//a[normalize-space()='Desktops']")
    WebElement desktopsMenuLink;

    /******************************** All Elements' Action Methods on Computers page *************************************/

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void clickOnDesktopsLink() {
        clickOnElement(desktopsMenuLink);
    }
}
