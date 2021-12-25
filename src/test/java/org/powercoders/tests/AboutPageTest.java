package org.powercoders.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.powercoders.pages.AboutPage;
import org.powercoders.pages.HomePage;
import org.powercoders.utilities.ConfigurationReader;
import org.powercoders.utilities.Driver;
import org.testng.annotations.Test;

public class AboutPageTest {

  HomePage homePage = new HomePage();
  AboutPage aboutPage = new AboutPage();

  // go to web site
  // click the "About" page
  // scroll down the mouse
  //choose "Team Zurich" from dropdown
  // verify the program manager name is Linus Murbach

  @Test
  public void programManagerTest() {

    Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    homePage.about.click();

    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    jse.executeScript("scroll(0,2000);");
    aboutPage.dropdown.click();
    aboutPage.teamZurich.click();
    String actualName = aboutPage.findPerson("Program Manager").getText();
    String expectedName = "Linus Murbach";
    System.out.println(actualName);
    assertEquals(actualName, expectedName, "Names do not match");

    Driver.closeDriver();

  }
}
