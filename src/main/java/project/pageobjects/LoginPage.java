package project.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.util.EnvironmentVariables;
import project.utilities.GenericUtils;
import project.utilities.ProjectVariables;

public class LoginPage extends PageObject{
	
	private EnvironmentVariables environmentVariables;
	
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
//		open();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*switch(sEnv){
		case "QA":
			getDriver().navigate().to(ProjectVariables.APP_URL_QA);
			break;
		case "UAT":
			getDriver().navigate().to(ProjectVariables.APP_URL_UAT);
		}*/
		
		String sAPP_URL = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("webdriver.base.url");
		String sDB_CONNECTION_URL = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("DB_CONNECTION_URL");
		getDriver().navigate().to(sAPP_URL);
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
	
	public void navigateEnvURL(){
		String sAPP_URL = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("webdriver.base.url");
		String sDB_CONNECTION_URL = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("DB_CONNECTION_URL");
		System.out.println("APP_URL: "+sAPP_URL);
		System.out.println("DB_CONNECTION: "+sDB_CONNECTION_URL);
		
		Serenity.recordReportData().withTitle("APLICATION URL").andContents(sAPP_URL);
		Serenity.recordReportData().withTitle("DB URL").andContents(sDB_CONNECTION_URL);
	}
	
}
