package org.powercoders.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.powercoders.utilities.Driver;

public class DonatePage {

  public DonatePage(){

    PageFactory.initElements(Driver.getDriver(),this);
  }


  @FindBy(css = "input#donation_custom_amount")
  public WebElement customAmount;

  @FindBy(css = "button.dw-btn.mdl-button.mdl-js-button.step-3.basic-color-background")
  public WebElement nextButton;

  @FindBy(css = "input#donation_first_name")
  public WebElement firstName;

  @FindBy(css = "input#donation_last_name")
  public WebElement lastName;

  @FindBy(css = "div#info-error")
  public WebElement errorMessage;
}
