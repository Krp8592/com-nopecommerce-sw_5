package com.nopecommerce.testsuite;

import com.nopecommerce.customlisteners.CustomListeners;
import com.nopecommerce.pages.ElectronicsPage;
import com.nopecommerce.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class TopMenuTest extends BaseTest {

    ElectronicsPage electronicsPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        electronicsPage = new ElectronicsPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyPageNavigation() {
        String menuName = "Electronics";
        String expectedMessage = "Electronics";
        electronicsPage.selectMenu(menuName);
        String actualMessage = electronicsPage.getElectronicsHeaderText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to click on");
    }
}
