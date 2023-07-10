package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableBasic_Page {

    public WebTableBasic_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[.='View all products']")
    public WebElement productButton;

    @FindBy(xpath = "//button[.='View all orders']")
    public WebElement allOrdersButton;

    @FindBy(xpath = "//button[.='Order']")
    public WebElement orderButton;

    @FindBy(xpath = "//button[.='Logout']")
    public WebElement logoutButton;


}
