package org.powercoders.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.powercoders.utilities.Driver;

public class HomePage {

  public HomePage(){

    PageFactory.initElements(Driver.getDriver(),this);
  }

  @FindBy(xpath = "(//a[.='Participants'])[1]")
  public WebElement participants;

  @FindBy(xpath = "(//a[.='Companies'])[1]")
  public WebElement companies;

  @FindBy(xpath = "(//a[.='Volunteers'])[1]")
  public WebElement volunteers;

  @FindBy(xpath = "(//a[.='About'])[1]")
  public WebElement about;

  @FindBy(xpath = "(//a[.='Press'])[1]")
  public WebElement press;

  @FindBy(xpath = "(//a[.='Donate'])[1]")
  public WebElement donate;



  //go to https://powercoders.org/
  //click participants
  //verify the title



}
