package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class devMHloginPage {

    public devMHloginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="Username")
    public WebElement usernameInput;

    @FindBy(id ="Password")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButton;


    public void login(String username,String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submitButton.click();
    }

}


