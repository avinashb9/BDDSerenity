package project.features.steps.definitions;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import project.pageobjects.LoginPage;
import project.utilities.ProjectVariables;

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
	
	@Step
	public void enter_valid_credentials(){
		oLoginPage.enterCredentials();
	}

	@Step
	public void click_SignIn(){
		oLoginPage.clickSignIn();
	}
	
	@Step
	public void validate_Home_Page_Title(){
		String sActTitle = oLoginPage.getTitle();
		Assert.assertTrue("Title is not as expected. Expected: "+ProjectVariables.Homepage_Title+" Actual: "+sActTitle, sActTitle.equals(ProjectVariables.Homepage_Title));
	}
	
	@Step
	public void logout_from_App(){
		oLoginPage.LogOutFromApp();
	}
	
	@Step
	public void login_to_App_with_credentials(String arg1, String arg2){
		oLoginPage.loginToAppWithInputCredentials(arg1, arg2);
	}
	
	@Step
	public void validate_Home_Page_Title(String sTitleText){
		String sActTitle = oLoginPage.getTitle();
		Assert.assertTrue("Title is not as expected. Expected: "+sTitleText+" Actual: "+sActTitle, sActTitle.equals(sTitleText));
	}
}
