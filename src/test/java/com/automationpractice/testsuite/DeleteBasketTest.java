package com.automationpractice.testsuite;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.ShoppingCartPage;
import com.automationpractice.pages.ShoppingCartSummaryPage;
import com.automationpractice.pages.SummerDressesPage;
import com.automationpractice.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class DeleteBasketTest extends TestBase {
    HomePage homePage;
    SummerDressesPage summerDressesPage;
    ShoppingCartPage shoppingCartPage;
    ShoppingCartSummaryPage shoppingCartSummaryPage;

    @BeforeMethod(groups = {"smoke","sanity", "regression"})
    public void init1() {
        homePage = new HomePage();
        summerDressesPage = new SummerDressesPage();
        shoppingCartPage = new ShoppingCartPage();
        shoppingCartSummaryPage = new ShoppingCartSummaryPage();
    }
    @Test(groups = {"sanity", "regression"},dataProvider = "DeleteBasketTest", dataProviderClass = TestData.class)
public void userShouldBeAblToDeleteProductFromBasket(String selection, String subMenuName, String message){
        // Select Women tab from the main menu
    homePage.selectFromTopMenu(selection);
        // Select Blouses from the sub menu
    homePage.selectFromWomenSubMenu(subMenuName);
        // Add item to cart
    summerDressesPage.addPrintedChiffonDressToCart();
        // close shopping cart window
    shoppingCartPage.closeShoppingCartWindow();
        // verify shopping cart has delete button
    shoppingCartPage.confirmDeleteIconLogoInShoppingCart();
        //Remove item from cart
    shoppingCartPage.removeItemFromCart();
        //Banner must display "Your shopping cart is empty."
    shoppingCartSummaryPage.verifyShoppingCartIsEmptyMessage(message);
}
}
