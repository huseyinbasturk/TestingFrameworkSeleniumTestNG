package org.powercoders.pages;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.powercoders.utilities.Driver;

public class PressPage {

  public PressPage(){

    PageFactory.initElements(Driver.getDriver(),this);
  }

  public WebElement getYear(int index) {
    WebElement year = Driver.getDriver().findElement(
        new ByXPath("((//div[@*='row'])[3]/div)[" + index + "]/h3"));

    return year;
  }
}
