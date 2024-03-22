package com.blueCRM.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = "com/blueCRM/step_definitions",
  B32G12-61_Logout_Masoom
        dryRun = false,
        tags = "@masoom",

        dryRun =false,
        tags = "@wip_amiri",

        publish = true //generating a report with public link
)
public class CukesRunner {}


