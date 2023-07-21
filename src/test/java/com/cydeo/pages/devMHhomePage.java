package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

public class devMHhomePage {

    public devMHhomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//nav[@id='primary'])[2]/ul/li")
    public List<WebElement> actNavbar;

@FindBy(xpath ="(//nav[@id='primary'])[2]/ul/li[2]/a")
    public WebElement account;

    @FindBy(xpath ="(//nav[@id=\"primary\"])[1]//li//a[1]")
    public WebElement home;

}

// (//nav[@id="primary"])[1]//li//a