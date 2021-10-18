package com.sprint;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/ASUS/eclipse-workspace/Demo/src/test/java/com/sprint/Login.feature",
glue= {"com.sprint"}, plugin = {"json:target/reports/report.json","junit:target/reports/report.xml"}
,monochrome=true)
public class TestrunnerLogin {

}
