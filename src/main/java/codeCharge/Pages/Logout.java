package codeCharge.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Menta Yamini
 *class for logout from the website
**/

public class Logout {
   WebDriver driver;
   /**
  	 * locating admnstration using  CSS Selector
  	 */
   @FindBy(how=How.CSS,using="tbody:nth-child(1) tr:nth-child(2) td:nth-child(3) a:nth-child(1) > img:nth-child(1)")
   @CacheLookup
   WebElement admnstration;
   /**
  	 * locating logout using  LINK_TEXT
  	 */
   @FindBy(how=How.LINK_TEXT,using="Logout")
   @CacheLookup
   WebElement off;
   /**
	 * method for Initializing the Objects
	 * @param driver
	 */
   public Logout(WebDriver driver) {
	   this.driver=driver;
   }
   /**
	 * method for Clicking on Logout button
	 */

   public void admn() {
	   admnstration.click();
	   off.click();
   }
}
