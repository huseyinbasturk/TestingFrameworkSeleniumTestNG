package org.powercoders.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import com.github.javafaker.Faker;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.powercoders.pages.DonatePage;
import org.powercoders.pages.HomePage;
import org.powercoders.utilities.BrowserUtils;
import org.powercoders.utilities.ConfigurationReader;
import org.powercoders.utilities.Driver;
import org.testng.annotations.Test;

public class DonatePageTest {

  HomePage homePage = new HomePage();
  DonatePage donatePage = new DonatePage();
  Faker person = new Faker();

  //go to web site
  //click donate button
  //go to new Window Tab
  //enter custom amount as 40 CFH
  //enter first and last name from fake data
  //after clicking next verify the error message isdisplayed
  // then verify the error message "Please fix the errors above."

  @Test
  public void donationTest(){
    Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    homePage.donate.click();

    //String mainHandle= Driver.getDriver().getWindowHandle();
    Set<String> windHandles=Driver.getDriver().getWindowHandles();
    for (String eachTab : windHandles) {
      Driver.getDriver().switchTo().window(eachTab);
      String title=Driver.getDriver().getTitle();

      if (title.contains("New Window")){
        break;
      }
    }
    //JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    //jse.executeScript("scroll(0,200);");

    donatePage.customAmount.click();
    donatePage.customAmount.sendKeys("40");
    donatePage.nextButton.click();
    donatePage.firstName.sendKeys(person.name().firstName());
    donatePage.lastName.sendKeys(person.name().lastName());
    donatePage.nextButton.click();
    assertTrue(donatePage.errorMessage.isDisplayed());

    String expectedErrorMessage = "Please fix the errors above.";
    String actualErrorMessage = donatePage.errorMessage.getText();

    assertEquals(actualErrorMessage, expectedErrorMessage," Error Messages do not match.");

    Driver.closeDriver();


  }

}
