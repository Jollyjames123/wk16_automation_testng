package com.automationpractice.testsuite;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.OurStoresPage;
import com.automationpractice.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OurStoresTest extends TestBase {
    HomePage homePage;
    OurStoresPage ourStoresPage;

    @BeforeMethod(groups = {"smoke","sanity", "regression"})
    public void init(){
        homePage = new HomePage();
        ourStoresPage = new OurStoresPage();
    }
    @Test(groups = {"smoke", "regression"})
    public void userShouldBeAbleToDragTheMapAndTakeScreenshot() {
        //Clicking on our stores link from the homepage
        homePage.selectFromInformationFooter("Our stores");
        //accept the alert
        ourStoresPage.acceptTheGooglePopUpAlert();
        //moving the map
        ourStoresPage.scrollMapToSeeWestPalmBeach();
        //scrolling down the page for screenshot
        ourStoresPage.scrollPageDown();
        //taking screenshot
        ourStoresPage.takeScreenshot();
    }
}
