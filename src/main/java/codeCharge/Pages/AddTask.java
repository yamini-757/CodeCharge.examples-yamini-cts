package codeCharge.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Yamini menta
 Selecting AddTask and entering task details to add the task
**/

public class AddTask {
	WebDriver driver;
  /**
   * locating Task using XPATH
   **/
    @FindBy(how=How.XPATH,using="//td[2]//a[1]//img[1]")
    @CacheLookup
    WebElement Task;
  /**
   *  locating name using NAME
   **/
    @FindBy(how=How.NAME,using="task_name")
    @CacheLookup
    WebElement name;
  /**
   *locating description using NAME
   **/
    @FindBy(how=How.NAME,using="task_desc")
    @CacheLookup
    WebElement description;
  /**
   * locating date using NAME
   **/
    @FindBy(how=How.NAME,using="task_start_date")
    @CacheLookup
    WebElement date;
  /**
   *  locating  date1 using NAME
   **/
    @FindBy(how=How.NAME,using="task_finish_date")
    @CacheLookup
    WebElement date1;
  /**
   * locating insrt using CSS Selector
  **/
    @FindBy(how=How.CSS,using="table.Record tbody:nth-child(1) tr.Bottom:nth-child(10) td:nth-child(1) > input:nth-child(1)")
    @CacheLookup
    WebElement insrt;

    public AddTask(WebDriver driver) {
	  this.driver=driver;
    }
    public void task() {
    	/**
    	 * method for Clicking on Task button
    	 **/
	  Task.click();
    }

    public void TaskaddingNameandDescrp(String name1,String Descrp) {
    	/**
    	 * method for Specifiying name and description
	 * @param name1
	 * @param Descrp
    	 **/
	  name.sendKeys(name1);
	  description.sendKeys(Descrp);
    }

    public void writingdate(String D1,String D2) {
    	 /**
    	  *method for Specifiying  date and  date1
	 * @param D1
	 * @param D2
    	  **/
	  date.sendKeys(D1);
	  date1.sendKeys(D2);
    }

    public void add() {
    	/**
    	 * method for Clicking on insrt button
    	 **/
	insrt.click();
}

}
