package com.Codecharge.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author Yamini Menta
 Class reads base settings from the config.properties file
**/

public class ConfigReader {
	Properties pro;

	public ConfigReader() {

		try {
			File src=new File("C:\\Users\\yamini\\eclipse-workspace\\CodeCharge-Cucumber\\Configuration\\config1.property");
			FileInputStream fis=new FileInputStream(src);

			pro=new Properties();

			pro.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is" + e.getMessage());
		}

	}
	/**
	 * Method to get the path to chrome profile
	 * @return chromepath
	 */
	public String getchromepath() {
		String chromepath=pro.getProperty("chromeDriver");
		return chromepath;
	}
	/**
	 * Method to get the path to Firefox profile
	 * @return firefoxPath
	 */

	public String getfirefoxpath() {
		String firefoxpath=pro.getProperty("firefoxDriver");
		return firefoxpath;
	}
	/**
	 * Method to get the URL
	 * @return URL
	 */

	public String getApplicationURL() {
		return pro.getProperty("URL");
	}
	/**
	 * Method to get the path to excel profile
	 * @return excelpath
	 */
	public String getExcelpath() {
		String Excelpath =pro.getProperty("Excelpath");
		return Excelpath;
	}
	/**
	 * Method to get the URL1
	 * @return URL1
	 */
	public String getApplicationURL1() {
		return pro.getProperty("URL1");
	}
}
