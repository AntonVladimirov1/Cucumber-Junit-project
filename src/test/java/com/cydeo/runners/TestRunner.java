package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "pretty",       // pretty in console
                "html:target/cucumber-reports.html",   // generating HTML reports
                 "rerun:target/rerun.txt",
                 "me.jvt.cucumber.report.PrettyReports:target/cucumber"     // generating pretty reports
        },
        publish = true,                                // creating public link to report
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        //dryRun = false                               // by default will execute everything, including Java code and generate missing snippets
        //dryRun = true                                // will generate only missing snippets and will not execute the code
        dryRun = false,
       // monochrome = true, - just color of the reports in console
        tags = ""


)
                // mvn test -Dcucumber.filter.tags=@webTableLogin3

public class TestRunner {

}
