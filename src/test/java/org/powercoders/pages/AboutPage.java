package org.powercoders.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.powercoders.utilities.Driver;

public class AboutPage {

  public AboutPage(){

    PageFactory.initElements(Driver.getDriver(),this);
  }

  @FindBy(css = "input.select-dropdown.dropdown-trigger")
  public WebElement dropdown;

  @FindBy(xpath = "//span[.='Team Zurich']")
  public WebElement teamZurich;
}
