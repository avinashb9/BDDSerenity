package project.features;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		plugin={"html:target/cucumber-html-report"},
		features="Features",
		tags={"@loginFeature"},
		dryRun = false
		)
public class TestRunner {

}
