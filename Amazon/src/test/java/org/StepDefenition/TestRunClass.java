package org.StepDefenition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",glue = "org.StepDefenition.",monochrome = true,snippets = SnippetType.UNDERSCORE,strict = true)

public class TestRunClass {

}
