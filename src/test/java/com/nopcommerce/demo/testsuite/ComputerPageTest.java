package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.resources.testsdata.TestData;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class ComputerPageTest extends BaseTest {

    HomePage homePage;
    ComputerPageTest computerPageTest;
    DesktopsPage desktopPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;
    private static String welcomeText;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        computerPageTest = new ComputerPageTest();
        desktopPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully(){
        homePage.clickOnComputersMenu();
        String expectedMessage = "Computers";
        String actualMessage = ComputerPageTest.getWelcomeText();
        Assert.assertEquals(actualMessage, expectedMessage, "Computers page not displayed");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homePage.clickOnComputersMenu();
        computerPageTest.clickOnElement();
        String expectedMessage = "Desktops";
        String actualMessage = desktopPage.getWelcomeText();
        Assert.assertEquals(actualMessage, expectedMessage, "Desktops page not displayed");
    }

    private void clickOnElement() {
    }

    @Test(dataProvider = "builtYourOwnComputer", dataProviderClass = TestData.class, groups = {"regression"})
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software){
        homePage.clickOnComputersMenu();
        computerPageTest.clickOnDesktopsLink();
        desktopPage.clickOnBuildYourOwnComputerLink();
        buildYourOwnComputerPage.optionsToBuiltYourOwnComputer(processor, ram, hdd, os, software);
        buildYourOwnComputerPage.clickOnAddToCart();
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = buildYourOwnComputerPage.getAddToCartSuccessfulMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "Product is not added successfully");
    }

    private void clickOnDesktopsLink() {
    }


    public static String getWelcomeText() {
        return welcomeText;
    }

    public void setWelcomeText(String welcomeText) {
        this.welcomeText = welcomeText;
    }
}