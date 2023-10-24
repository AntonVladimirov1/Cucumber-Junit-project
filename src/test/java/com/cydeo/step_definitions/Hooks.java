package com.cydeo.step_definitions;

// "Pre" and "Post" conditions

import com.cydeo.utility.BrowserUtils;
import com.cydeo.utility.ConfigReader;
import com.cydeo.utility.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUpDriver(){
        System.out.println("--->@Before: ");
       // Driver.getDriver().get(ConfigReader.getProperty("devMHLogin"));
    }

   // @Before (value = "@login", order = 2)
    public void login_scenario(){
        System.out.println("--->@Before: ");
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        System.out.println("--->@After: - running after each SCENARIO");
        BrowserUtils.sleep(2);
        //Driver.closeDriver();
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
