package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.Objects;

public class BuildYourOwnComputerPage extends Utility {
    /******************************** All Elements' Path on BuildYourOwnComputer page ***********************************************/

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Build your own computer']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorFieldDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement RAMFieldDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement HDD320GBRadioButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement HDD400GBRadioButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement OSVistaHomeRadioButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement OSVistaPremiumRadioButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement softwareMicrosoftOfficeCheckBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    WebElement softwareAcrobatReaderCheckBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement softwareTotalCommanderCheckBox;

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement totalPriceText;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement cartAddMessage;

    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement cartAddMessageCloseButton;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement shoppingCartTab;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Go to cart']")
    WebElement goToCartOption;


    /******************************** All Elements' Action Methods on BuildYourOwnComputer page *************************************/

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void selectProcessorFieldDropDownOption(String option) {
        selectByVisibleTextFromDropDown(processorFieldDropDown, option);
    }

    public void selectRAMFieldDropDownOption(String option) {
        selectByVisibleTextFromDropDown(RAMFieldDropDown, option);
    }

    public void clickOnHDD320GBRadioButton() {
        clickOnElement(HDD320GBRadioButton);
    }

    public void clickOnHDD400GBRadioButton() {
        clickOnElement(HDD400GBRadioButton);
    }

    public void clickOnOSVistaHomeRadioButton() {
        clickOnElement(OSVistaHomeRadioButton);
    }

    public void clickOnOSVistaPremiumRadioButton() {
        clickOnElement(OSVistaPremiumRadioButton);
    }

    public void clickOnSoftwareMicrosoftOfficeCheckBox() {
        clickOnElement(softwareMicrosoftOfficeCheckBox);
    }

    public void clickOnSoftwareAcrobatReaderCheckBox() {
        clickOnElement(softwareAcrobatReaderCheckBox);
    }

    public void clickOnSoftwareTotalCommanderCheckBox() {
        clickOnElement(softwareTotalCommanderCheckBox);
    }

    public String getTotalPrice() {
        return getTextFromElement(totalPriceText);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCartButton);
    }

    public String getAddToCartSuccessfulMessage() {
        return getTextFromElement(cartAddMessage);
    }

    public void clickOnClose() {
        clickOnElement(cartAddMessageCloseButton);
    }

    public void mouseHoverOnShoppingCart() {
        mouseHoverToElement(shoppingCartTab);
    }

    public void clickOnGoToCart() {
        clickOnElement(goToCartOption);
    }

    public void optionsToBuiltYourOwnComputer(String processor, String ram, String hdd, String os, String software) {
        selectProcessorFieldDropDownOption(processor);
        selectRAMFieldDropDownOption(ram);

        if (Objects.equals(hdd, "320 GB")) {
            clickOnHDD320GBRadioButton();
        } else {
            clickOnHDD400GBRadioButton();
        }

        if (Objects.equals(os, "Vista Home [+$50.00]")) {
            clickOnOSVistaHomeRadioButton();
        } else {
            clickOnOSVistaPremiumRadioButton();
        }

        clickOnSoftwareMicrosoftOfficeCheckBox();

        if (Objects.equals(software, "Microsoft Office [+$50.00]")) {
            clickOnSoftwareMicrosoftOfficeCheckBox();
        } else if (Objects.equals(software, "Acrobat Reader [+$10.00]")) {
            clickOnSoftwareAcrobatReaderCheckBox();
        } else {
            clickOnSoftwareTotalCommanderCheckBox();
        }
    }
}