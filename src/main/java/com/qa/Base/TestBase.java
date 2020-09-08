package com.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.Utility.TestUtil;



public class TestBase extends TestUtil{
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	//here TestBase is constructor
	public TestBase(){
		
		try {
			prop = new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\CHALAMA\\eclipse-workspace\\MOH\\src\\main\\java\\com\\qa\\Config\\config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		
	}
	public static void initalization() {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "F:\\Selenium Drivers\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "F:\\server driver\\geckoDriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
	
	public static void MoHPortal() {
		driver.get(prop.getProperty("MoHurl"));
	}
	
	
	

}
