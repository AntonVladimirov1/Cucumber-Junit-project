package com.cydeo.step_definitions;

// "Pre" and "Post" conditions

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //@Before (order = 1)
    public void setUp(){
        System.out.println("--->@Before: - running before each SCENARIO");
    }

   // @Before (value = "@login", order = 2)
    public void login_scenario(){
        System.out.println("--->@Before: - running before each SCENARIO");
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        System.out.println("--->@After: - running after each SCENARIO");
        BrowserUtils.sleep(2);
        Driver.closeDriver();
    }

   // @BeforeStep
    public void setupStep(){
        System.out.println("->@BeforeStep: - running before each STEP");
    }

   // @AfterStep
    public void tearDownStep(){
        System.out.println("->@AfterStep: - running after each STEP");
    }

}
