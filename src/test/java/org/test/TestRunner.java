package org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Workspace\\Monu\\src\\test\\resources\\New\\New.Feature",glue="org.step",monochrome=true)

public class TestRunner {

}