package project.pageobjects;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject{

	public void navigateToAppUrl(){
//		getDriver().navigate().to(URL);
		open();
		WebDriver driver = getDriver();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
