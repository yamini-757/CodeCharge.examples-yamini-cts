package codeCharge.stepDefination;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.Codecharge.utility.Browserfactory;
import com.Codecharge.utility.ConfigReader;
import com.Codecharge.utility.ExcelDataConfig;
import com.Codecharge.utility.Screenshot;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import codeCharge.Pages.AddTask;
import codeCharge.Pages.EmployeesList;
import codeCharge.Pages.Loginpage;
import codeCharge.Pages.Logout;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author  Yamini Menta
 class created to write test cases for login,navigating to url,adding Employee_details,adding Add_task details and logout.
**/

public class ValidLogin {
	 ConfigReader config=new ConfigReader();
     WebDriver driver;
   //Create object  for Loginpage
     Loginpage page = new Loginpage(driver);
   //Create object  for EmployeesList
     EmployeesList page2=new EmployeesList(driver);
   //Create object  for ExcelDataConfig
     ExcelDataConfig configExcel=new ExcelDataConfig(config.getExcelpath());
   //Create object  for screenshot
     Screenshot scrn=new Screenshot();
   //Create object  for AddTask
     AddTask page3=new AddTask(driver);
   //Create object  for Logout
     Logout page4=new Logout(driver);
     
     Logger logger;
   /**
    * method to get extent reports
    */
     public static ExtentReports report = new ExtentReports("ExtentReport.html");
 	 ExtentTest test = report.startTest("logInTest");
    
 	@Given("^Open chrome and start application$")
 	/**
	 * method to open browser
	 * @throws Throwable
	 */
     public void open_chrome_and_start_application() throws Throwable {
 		//Create object  for Browserfactory
    	 Browserfactory browser=new Browserfactory();
    	 logger=Logger.getLogger("ValidLogin");
    	 PropertyConfigurator.configure("log4j.properties");
    	 driver=browser.startBrowser("chrome", config.getApplicationURL());
    	 logger.info("Chrome Opened"); 
     }
     @When("^I enter valid \"([^\"]*)\"$")
     /**
 	 * method to enter username and password for login
 	 * @param usernameNumber
 	 * @throws Throwable
 	 */
     public void i_enter_valid(String  arg1) throws Throwable {
    	 page=PageFactory.initElements(driver, Loginpage.class);
    	 Thread.sleep(2000);
    	 page.administration();
    	 Object[][] data=configExcel.passData();
    	 String username="";
    	 String password="";
    	 if(null!= arg1 ) {
    		 int userCount = Integer.parseInt(arg1.trim());
    		 username = (String )data[userCount][0];
    		 password = (String )data[userCount][1];
           }
    	 page.typeUserNameAndPassword(username, password);   	 
     }
     @When("^user should be able to login$")
     /**
 	 * method to successfull login
 	 */
     public void user_should_be_able_to_login() throws Throwable {
    	 Thread.sleep(2000);
    	 page.clickOnLoginButton();
    	 test.log(LogStatus.PASS, "Authentication sucessfully");
    	 logger.info("By entering valid credentials it loggined successfully");
     }

     @When("^selecting the employees$")
     /**
 	 * method to enter Employee_details
 	 * @throws Throwable
 	 */
     public void selecting_the_employees() throws Throwable {
    	 page=PageFactory.initElements(driver, Loginpage.class);
    	 page2=PageFactory.initElements(driver, EmployeesList.class);
    	 page2.clickOnEmployees();
    	 logger.info("Select the addanemployee");
    	 
    	 page2.EmployeeFullnameAndMail("Yam", "yam12@gmail.com");
    	 page2.typeUserNameAndPassword("yam1", "1234y");
    	 Select drpemployee=new Select(driver.findElement(By.name("security_group_id")));
    	 drpemployee.selectByVisibleText("Admin");
    	 page2.clickOnLoginButton();
    	 page2.next();
    	 test.log(LogStatus.PASS, "Employee Details were added Successfully");
    	 logger.info("employee details entered successfully");
    	 scrn.getScreenshot(driver);
    	 test.log(LogStatus.PASS, "Done with the successful screenshot");
    	 logger.info("Screenshot taken successfully");
     }
  
    @When("^selecting the tasklist$")
    /**
	 * method to enter Add_task details
	 * @throws Throwable
	 */
     public void selecting_the_tasklist() throws Throwable {
    	 page=PageFactory.initElements(driver, Loginpage.class);
    	 page3=PageFactory.initElements(driver,AddTask.class);
    	 page3.task();
    	 
    	 driver.findElement(By.name("login")).sendKeys("admin");
    	 driver.findElement(By.name("password")).sendKeys("admin");
    	 page.clickOnLoginButton();
    	 
    	 page3.TaskaddingNameandDescrp("Finishing My Project", "Adding the employee details and writing the reports for the issues found in the project of an employee");    	
    	 Select drpprjct=new Select(driver.findElement(By.name("project_id")));
    	 drpprjct.selectByValue("1");
    	 
    	 Select drppriority=new Select(driver.findElement(By.xpath("//select[@name='priority_id']")));
    	 drppriority.selectByVisibleText("Normal");
    	 
    	 Select drpstatus=new Select(driver.findElement(By.name("status_id")));
    	 drpstatus.selectByVisibleText("On hold");
    	 
    	 Select drpType=new Select(driver.findElement(By.xpath("//select[@name='type_id']")));
    	 drpType.selectByValue("1");
    	 
    	 Select drpAssignedTo=new Select(driver.findElement(By.name("user_id_assign_to")));
    	 drpAssignedTo.selectByValue("9");
    	 
    	 page3.writingdate("04/08/20", "04/12/20");
    	 page3.add();
    	 scrn.getScreenshot(driver);
    	 test.log(LogStatus.PASS, "Task Details were added sucessfully");
    	 logger.info("Task details entered successfully");
     }
  
     @When("^it's time to logouot$")
     /**
 	 * method to Logout
 	 * @throws Throwable
 	 */
     public void it_s_time_to_logouot() throws Throwable {
    	 page4=PageFactory.initElements(driver,Logout.class);
    	 page4.admn();
    	 test.log(LogStatus.PASS, "sucessfully Logged off from the website");
    	 logger.info("Loggedout successfully");
     }
   
     @Then("^appplication should be closed$")
     /**
 	 * method to close applicaton
 	 * @throws Throwable
 	 */
     public void appplication_should_be_closed() throws Throwable {
    	 report.endTest(test);
    	 report.flush();
    	 
     }
}

