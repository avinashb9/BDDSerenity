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
		oLoginPageStepDef.enter_valid_credentials();
	}

	@When("^User clicked on SignIn button$")
	public void user_clicked_on_SignIn_button() {
		oLoginPageStepDef.click_SignIn();
	}

	@Then("^User should see Home Page$")
	public void user_should_see_Home_Page() {
		oLoginPageStepDef.validate_Home_Page_Title();
	}

	@Then("^User should log out of the Application$")
	public void user_should_log_out_of_the_Application() {
		oLoginPageStepDef.logout_from_App();
	}
	
	@When("^User logged in with valid credentials$")
	public void user_logged_in_with_valid_credentials() {
		oLoginPageStepDef.enter_valid_credentials();
		oLoginPageStepDef.click_SignIn();
	}

	@Then("^validate the Headers displayed$")
	public void validate_the_Headers_displayed() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}
	
	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" in LoginPage$")
	public void user_enters_and_in_LoginPage(String arg1, String arg2) {
		oLoginPageStepDef.login_to_App_with_credentials(arg1,arg2);
	}

	@Then("^User should see Home Page \"([^\"]*)\"$")
	public void user_should_see_Home_Page(String arg1) {
		oLoginPageStepDef.validate_Home_Page_Title(arg1);
	}

}
