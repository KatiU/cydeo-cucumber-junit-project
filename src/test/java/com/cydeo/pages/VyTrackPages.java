package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackPages {

    public VyTrackPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

      @FindBy(id="prependedInput")
      public  WebElement username;

      @FindBy(id="prependedInput2")
       public  WebElement userpassword;


       @FindBy(id="_submit")
       public WebElement loginBtn;

    }

