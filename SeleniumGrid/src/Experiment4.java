



import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
 


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;




public class Experiment4 
{

	public static void main(String[] args) throws MalformedURLException 
	{
		
	     
	     
	     
	     
			// Selenium Third Method
		
		
			// 1. define Des Cop: 
	    

	    	 DesiredCapabilities cap = new DesiredCapabilities();
	    	  cap.setBrowserName("chrome");
	    	  cap.setPlatform(Platform.MAC); 
	    	  
	    	 //2. Chrome Options definition: 

	    	 ChromeOptions options = new ChromeOptions();
	    	 options.merge(cap); 
	    	 
	    	 String hubUrl = "http://192.168.0.102:4444/wd/hub"; 
	    	 WebDriver driver = new RemoteWebDriver(new URL(hubUrl),cap); 
	    	 driver.get("http://www.freecre.cow"); 
	    	 System.out.println(driver.getTitle());

	
	}
	
	
	
}
	
	
	
	
	
	

	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	


