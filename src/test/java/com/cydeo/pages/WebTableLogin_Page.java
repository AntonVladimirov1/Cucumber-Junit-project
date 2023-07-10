package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLogin_Page {

    public WebTableLogin_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "username")
    public WebElement inputUsername;
    @FindBy(name = "password")
    public WebElement inputPassword;
    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;


    public void login(String username,String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }
}


