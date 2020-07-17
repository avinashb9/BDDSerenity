package project.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import project.utilities.GenericUtils;
import project.utilities.ProjectVariables;

public class LoginPage extends PageObject{
	
	@FindBy(name="username")
	WebElementFacade userName;
	
	@FindBy(name="password")
	WebElementFacade passWord;
	
	@FindBy(xpath="//input[@class='btn btn-small']")
	WebElementFacade signInBtn;
	
	@FindBy(xpath="(//i[@class='fa fa-sign-out icon-2x'])")
	WebElement sLogout;
	
	
	
	public void navigateToAppUrl(){
//		getDriver().navigate().to(URL);
		open();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void enterCredentials(){
		enterUserName();
		enterPassword();
	}
	
	public void enterUserName(){
		userName.sendKeys(ProjectVariables.USER_NAME);
	}
	
	public void enterPassword(){
		passWord.sendKeys(GenericUtils.decode(ProjectVariables.PASS_WORD));
	}
	
	public void clickSignIn(){
		signInBtn.click();
	}
	
	public String getTitle(){
		return getDriver().getTitle();
	}
	
	public void LogOutFromApp(){
		getDriver().switchTo().frame("mainpanel");
		System.out.println("Switched to FRAME");
		sLogout.click();
	}
	
	public void loginToAppWithInputCredentials(String sUserName, String sPassword){
		userName.sendKeys(sUserName);
		passWord.sendKeys(sPassword);
		clickSignIn();
	}
	
}
