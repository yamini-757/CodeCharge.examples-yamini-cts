package com.Codecharge.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Yamini Menta
initialize the requested browser for the test i.e., chromedriver, firefoxdriver.
**/

public class Browserfactory {
	public WebDriver driver;
	

	public WebDriver startBrowser(String browserName, String url) {
		
		ConfigReader config = new ConfigReader();
		
		if(browserName.equalsIgnoreCase("chrome")) {
		
			System.setProperty("webdriver.chrome.driver", config.getchromepath() );

			 driver = new ChromeDriver();
			
		}
		
		
		else if(browserName.equalsIgnoreCase("firefox")){
			
			System.setProperty("webdriver.gecko.driver", config.getfirefoxpath());

			 driver = new FirefoxDriver();
			
		}
		
		 /**
		 * Method to maximize window
		 */
		
		driver.manage().window().maximize();
		driver.get(config.getApplicationURL());
		return driver;
}
}
