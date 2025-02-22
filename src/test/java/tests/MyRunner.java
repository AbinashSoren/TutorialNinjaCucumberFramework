package tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html:target/cumumber_html_report.html","pretty",
		"junit:target/CucumberReport.xml",
		 "json:target/CucumberReport.json"},
				 tags="@all")
public class MyRunner {

	
}
