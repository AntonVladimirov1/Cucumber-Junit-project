package com.cydeo.pages;

import com.cydeo.utility.ConfigReader;
import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class devMHLoginPage {

    public devMHLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="Username")
    public WebElement usernameInput;

    @FindBy(id ="Password")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButton;


    public void login(){
        String username = ConfigReader.getProperty("devUsername");
        String password = ConfigReader.getProperty("devPassword");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submitButton.click();
    }

}


