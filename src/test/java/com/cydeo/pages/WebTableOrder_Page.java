package com.cydeo.pages;

import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTableOrder_Page extends WebTableBasic_Page {

    public WebTableOrder_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "product")
    public WebElement productDropdown;

    @FindBy(xpath = "//input[@value='Visa']")
    public WebElement visa;
    @FindBy(xpath = "//input[@value='MasterCard']")
    public WebElement master;
    @FindBy(xpath = "//input[@value='American Express']")
    public WebElement amex;

    @FindBy(name = "card")
    public List<WebElement> cardType;

    @FindBy(name= "quantity")
    public WebElement quantity;
    @FindBy(xpath = "//button[.='Calculate']")
    public WebElement calculateButton;
    @FindBy(name= "name")
    public WebElement name;
    @FindBy(name = "street")
    public WebElement street;
    @FindBy(name = "city")
    public WebElement city;
    @FindBy(name = "state")
    public WebElement state;
    @FindBy(name = "zip")
    public WebElement zip;
    @FindBy(name = "cardNo")
    public WebElement cardNo;
    @FindBy(name = "cardExp")
    public WebElement cardExp;
    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement precessButton;

    @FindBy(xpath = "//table[@class='table is-fullwidth']/tbody/tr[1]/td[1]")
    public WebElement orderName;

}
