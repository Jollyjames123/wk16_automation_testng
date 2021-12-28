package com.automationpractice.testsuite;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.SummerDressesPage;
import com.automationpractice.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class SummerDressesTest extends TestBase {
    HomePage homePage;
    SummerDressesPage summerDressesPage;

    @BeforeMethod(groups = {"smoke", "sanity", "regression"})
    public void init1() {
        homePage = new HomePage();
        summerDressesPage = new SummerDressesPage();
    }

    @Test(groups = {"sanity", "regression"}, dataProvider = "SummerDressesTest", dataProviderClass = TestData.class)
    public void userShouldBeAbleToSelectAndViewSummerDressesFromNavigationMenu(String selection, String subMenuName, String message) {
        //Select Women Category from the main menu
        homePage.selectFromTopMenu(selection);
        //Select summer dresses from the submenu
        homePage.selectFromWomenSubMenu(subMenuName);
        //verify the summer dresses page
        summerDressesPage.verifySummerDressesPageVerificationText(message);
    }
}
