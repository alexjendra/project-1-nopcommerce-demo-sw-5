package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    /******************************** All Elements' Path on Homepage ***********************************************/


    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Welcome to our store']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computersPageLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement electronicsPageLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']")
    WebElement apparelPageLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']")
    WebElement digitalDownloadsPageLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Books']")
    WebElement booksPageLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']")
    WebElement jewelryPageLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']")
    WebElement giftCardsPageLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement nopCommerceLogo;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li/a")
    WebElement listOfTopMenu;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']")
    WebElement cellPhoneSubMenuLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logoutLink;

    /******************************** All Elements' Action Methods on Homepage *************************************/

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

//    public List<WebElement> getListOfTopMenu() {
//       return getListOfElement(listOfTopMenu);
//    }

    public void clickOnComputersMenu () {
        clickOnElement(computersPageLink);
    }

    public void mouseHoverOnElectronicsMenu () {
        mouseHoverToElement(electronicsPageLink);
    }

    public void mouseHoverAndClickOnCellPhoneSubMenu() {
        mouseHoverToElementAndClick(cellPhoneSubMenuLink);
    }

    public void clickOnElectronicsMenu () {
        clickOnElement(electronicsPageLink);
    }

    public void clickOnApparelMenu () {
        clickOnElement(apparelPageLink);
    }

    public void clickOnDigitalDownloadsMenu () {
        clickOnElement(digitalDownloadsPageLink);
    }

    public void clickOnBooksMenu () {
        clickOnElement(booksPageLink);
    }

    public void clickOnJewelryMenu () {
        clickOnElement(jewelryPageLink);
    }

    public void clickOnGiftCardsMenu () {
        clickOnElement(giftCardsPageLink);
    }

    public void clickOnLogout() {
        clickOnElement(logoutLink);
    }

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public boolean isLoginLinkAvailable() {
        System.out.println("LoginLink: " + loginLink.getText());
        return verifyThatElementIsDisplayed(loginLink);
    }

    public boolean isLogoutLinkAvailable() {
        return verifyThatElementIsDisplayed(logoutLink);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public boolean verifyNopCommerceLogoDisplay() {
        return verifyThatElementIsDisplayed(nopCommerceLogo);
    }

    public void explicitWait(int time) {
        waitUntilVisibilityOfElementLocated(By.className("ico-login"), time);
    }
}
