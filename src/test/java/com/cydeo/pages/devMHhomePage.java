package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class devMHhomePage {

    public devMHhomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "primary")
    public List<WebElement> actNavbar;
}
