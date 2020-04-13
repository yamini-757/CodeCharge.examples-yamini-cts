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

public class EmployeesList {
	WebDriver driver;
  /**
   * locating emp using LINK_TEXT
   **/
	@FindBy(how=How.LINK_TEXT,using="Employees")
	@CacheLookup
	WebElement emp;
  /**
   * locating add employee using  LINK_TEXT
   **/
	@FindBy(how=How.LINK_TEXT,using="Add New Employee")
	@CacheLookup
	WebElement add;
	/**
	 * locating empname using NAME
	 */
	@FindBy(how=How.NAME,using="full_name")
	@CacheLookup
	WebElement empname;
	/**
	 * locating empmail using  NAME
	 */
	@FindBy(how=How.NAME,using="email")
	@CacheLookup
	WebElement empmail;
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
	 * locating submit_button using NAME
	 */
	@FindBy(how=How.NAME,using="Insert")
	@CacheLookup
	WebElement submit_button;
	/**
	 * locating button using LINK_TEXT
	 */
	@FindBy(how=How.LINK_TEXT,using="Next")
	@CacheLookup
	WebElement button;
	/**
	 * method for Initializing the Objects
	 * @param driver
	 */
	public EmployeesList(WebDriver driver) {
	this.driver=driver;
       }
	public void clickOnEmployees() {
		/**
		 * method for Clicking on Employees_button
		 */
	    emp.click();
	    /**
		 * method for Clicking on Add button
		 */
        add.click();
	}
	
	public void EmployeeFullnameAndMail(String name,String mail) {
		/**
		 * method for Specifiying empname and empmail
		 * @param name
		 * @param mail
		 */ 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		empname.sendKeys(name);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		empmail.sendKeys(mail);
		}

	public void typeUserNameAndPassword(String userid,String pass) {
		/**
		 * method for Specifiying username and password
		 * @param userid
		 * @param pass
		 */
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		username.sendKeys(userid);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		password.sendKeys(pass);
		}

	public void clickOnLoginButton() {
		 /**
		 * method for Clicking on submit_button
		 */
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		submit_button.click();
		}
	
	public void next() { 
		/**
		 * method for Clicking on Add button
		 */
		button.click();
	}
}