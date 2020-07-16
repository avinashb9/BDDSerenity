package project.features.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import project.features.steps.definitions.LoginPageStepDef;

public class LoginPageSteps {
	
	@Steps
	LoginPageStepDef oLoginPageStepDef;
	
	@Given("^User Navigated to Applicaton$")
	public void user_Navigated_to_Applicaton() {
		oLoginPageStepDef.navigate_to_app();
	}

	@When("^User enter valid credentials$")
	public void user_enter_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}

	@When("^User clicked on SignIn button$")
	public void user_clicked_on_SignIn_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}

	@Then("^User should see Home Page$")
	public void user_should_see_Home_Page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}

	@Then("^User should log out of the Application$")
	public void user_should_log_out_of_the_Application() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}

}
