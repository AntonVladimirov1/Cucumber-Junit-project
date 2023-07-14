package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {

    public static void sleep(int second){
        second*= 1000;
        try{
            Thread.sleep(second);
        }catch (InterruptedException e){
        }
    }

    public static void hover(WebElement element){
        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    public static void switchWindowAndVerify(String expectedInURL, String expectedTitle){
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowHandles) {
            Driver.getDriver().switchTo().window(each);
            System.out.println("Current URL: "+ Driver.getDriver().getCurrentUrl());
            if (Driver.getDriver().getCurrentUrl().contains(expectedInURL)){
                break;
            }
        }
        String actTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actTitle.contains(expectedTitle));
    }

    public static void verifyTitle(String expectedTitle){
        Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle);
    }

    public static void verifyTitleContains(String expInTitle){
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expInTitle));
    }

    public static void verifyURLContains(String expInURL){
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expInURL));
    }

    public static WebElement waitForClickable(WebElement element,int duration){
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(duration));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitInvisibility(WebElement target,int duration){
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.invisibilityOf(target));
    }

    public static void waitVisibility(WebElement target,int duration){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.visibilityOf(target));
    }

    public static WebElement waitVisibility(By locator, int duration){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(duration));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitTitleElement(String title) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains(title));
    }

    public static List<String> getElementText(List<WebElement> list){
        List<String> elementText= new ArrayList<>();
        for (WebElement element : list) {
            elementText.add(element.getText());
        }
        return elementText;
    }

    public static List<String> dropdown_as_STRING(WebElement dropdownElement){
        Select object = new Select(dropdownElement);
        List<WebElement> actObjects = object.getOptions(); // Storing all the ACTUAL option into a List of WebElement
        List<String> actObjects_as_STRING = new ArrayList<>(); // Creating an Empty list of String to store ACTUAL <option> as String
        // Looping through the List<WebElement>, getting all options text, and storing them into List<String>
        for (WebElement each : actObjects) {
            actObjects_as_STRING.add(each.getText());
        }
        return actObjects_as_STRING;
    }

    public static void clickRadioButtons(List<WebElement> radioButtons,String attributeValue){
        for (WebElement each : radioButtons) {
            if (each.getAttribute("value").equals(attributeValue)){
                each.click();
            }
        }
    }

    public static void selectDay(int day){
        String locator = "//td[.='"+day+"']";
        Driver.getDriver().findElement(By.cssSelector("#datepicker")).click();
        Driver.getDriver().findElement(By.xpath(locator)).click();
    }

}
