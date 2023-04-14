package org.suite;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/resources",
glue = "org.Stepdefinetion",
monochrome = true,
dryRun = false,
snippets = SnippetType.UNDERSCORE,
plugin = {"html:Report_1","junit:Report_1\\junitReport.xml","json:Report_1\\jsonReport.json"},
strict = true)
//tags = "@feature_1")

public class suiteclass {

	
}
