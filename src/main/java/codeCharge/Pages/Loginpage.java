package codeCharge.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Yamini Menta
 class for logging into website with valid credentials
**/

public class Loginpage {
	WebDriver driver;
  /**
   * Selecting the Administration using the Locator-CSS Selector
   **/
	@FindBy(how=How.CSS,using="tbody:nth-child(1) tr:nth-child(2) td:nth-child(3) a:nth-child(1) > img:nth-child(1)")
	@CacheLookup
	WebElement clickadmin;
	/**
	 * locating username using NAME
	 */
	@FindBy(how=How.NAME,using="login")
	@CacheLookup
	WebElement username;
	/**
	 * locating password using NAME
	 */
	@FindBy(how=How.NAME,using="password")
	@CacheLookup
	WebElement password;
	/**
	 * locating Logib_button using NAME
	 */
	@FindBy(how=How.NAME,using="DoLogin")
	@CacheLookup
	WebElement button;
	
	public void administration() {
	  /**
	   * Click on adminstration button
	   **/
		clickadmin.click();
	}
	/**
	 * method for Initializing the Objects
	 * @param driver
	 */
	public Loginpage(WebDriver driver) {
	this.driver=driver;
}
	/**
	 * method for Specifiying email and psswd
	 * @param userid
	 * @param pass
	 */
	public void typeUserNameAndPassword(String userid,String pass) {
	  /*
	   * Entering input values such as username and password in textbox using Sendkeys
	   */
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		username.sendKeys(userid);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		password.sendKeys(pass);
	}
	 /**
		 * method for Clicking on Login button
		 */
	public void clickOnLoginButton() {
		   /*
		    * Click on Loginbutton
		    */
			 button.click();
	}
}
