package org.powercoders.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.powercoders.pages.HomePage;
import org.powercoders.pages.PressPage;
import org.powercoders.utilities.ConfigurationReader;
import org.powercoders.utilities.Driver;
import org.testng.annotations.Test;

public class PressPageTest {

  HomePage homePage = new HomePage();
  PressPage pressPage = new PressPage();

  // go to web site
  // click the "Press" page
  // scroll down the mouse
  //verify the news are in chronological order(


  @Test
  public void chronologicalOrderTest() {

    Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    homePage.press.click();

    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    jse.executeScript("scroll(0,200);");

    int checkingValue = 2025;
    int year = 0;

    for(int i=1; i<12 ; i++) {

      if (i % 2 == 1) {
        year = Integer.parseInt(pressPage.getYear(i).getText());
        //System.out.println(year);
      }
    }
      assertTrue(checkingValue>year,"News are not listed chronogically");

    Driver.closeDriver();

  }
}
