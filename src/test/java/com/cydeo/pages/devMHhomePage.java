package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class devMHhomePage {

    public devMHhomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // LOCATORS--->

    @FindBy(xpath = "(//nav[@id='primary'])[2]")
    public List<WebElement> navbar;

    @FindBy(xpath = "(//nav[@id='primary'])[2]/ul/li")
    public List<WebElement> actNavbar;

    @FindBy(xpath ="(//a[.='Home'])[2]")
    public WebElement home;

    @FindBy(xpath ="(//nav[@id=\"primary\"])[1]//li//a[1]")
    public WebElement home2;

}
