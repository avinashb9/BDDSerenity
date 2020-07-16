package project.features.steps.definitions;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import project.pageobjects.LoginPage;

public class LoginPageStepDef extends ScenarioSteps{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	LoginPage oLoginPage;
	
	@Step
	public void navigate_to_app(){
		oLoginPage.navigateToAppUrl();
	}

}
