package org.powercoders.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.powercoders.pages.HomePage;
import org.powercoders.utilities.ConfigurationReader;
import org.powercoders.utilities.Driver;
import org.testng.annotations.Test;

public class HomePageTest {

  HomePage homePage = new HomePage();

  @Test
  public void VerifyTitleTest(){
    //TC #1:Participants Test
    // go to website
    //click participants
    //verify the page title

    Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    homePage.participants.click();
    String expectedTitle = "Participants";
    String actualTitle = Driver.getDriver().getTitle();

    assertTrue(actualTitle.contains(expectedTitle), "Title can not be verified");


  }

  @Test
  public void VerifyUrlTest() {
    //TC #1:Companies Test
    // go to website
    //click companies
    //verify the page url

    Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    homePage.companies.click();
    String expectedTitle = "https://powercoders.org/company/";
    String actualTitle = Driver.getDriver().getCurrentUrl();

    assertEquals(actualTitle, expectedTitle, "Url do not match");

  }

}
