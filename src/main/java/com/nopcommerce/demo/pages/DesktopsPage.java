package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {
    /******************************** All Elements' Path on Desktops page ***********************************************/

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortByFilterPath;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerLink;


    /******************************** All Elements' Action Methods on Desktops page *************************************/

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void sortByFilter(String sortByOption) {
        selectByVisibleTextFromDropDown(sortByFilterPath, sortByOption);
    }

    public void clickOnBuildYourOwnComputerLink () {
        clickOnElement(buildYourOwnComputerLink);
    }
}
