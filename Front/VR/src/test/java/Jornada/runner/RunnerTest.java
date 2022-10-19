package Jornada.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		    tags = {"@vr"},
	        features = {"src"},
	        snippets = SnippetType.CAMELCASE,
	        plugin = {"json:target/reports/CucumberReport.json"},
					 
	        monochrome = true,
	        dryRun = false,
	        glue = {""})


public class RunnerTest {
	 

	    }
