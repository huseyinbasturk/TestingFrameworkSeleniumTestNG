package org.powercoders.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
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



  @FindBy(xpath = "//p[contains(text(),'Program Manager')]/strong")
  public WebElement programManagersName;

  public WebElement findPerson(String position) {
    WebElement name = Driver.getDriver().findElement(
        new ByXPath("//p[contains(text(),'"+ position + "')]/strong"));

    return name;
  }
}
