package org.test;

import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Workspace\\Monu\\src\\test\\resources\\New\\New.Feature",glue="org.step",plugin= {"pretty","rerun:target/rerun.txt"})

public class TestRunner2 {

}
