



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




public class Experiment3 
{

	public static void main(String[] args) throws MalformedURLException 
	{
			// FireFox
		
		  WebDriver driver;
		  DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		
	      capabilities.setCapability(FirefoxDriver.BINARY,new File("C:/Program Files (x86)/Mozilla Firefox/firefox.exe").getAbsolutePath());
	      capabilities.setCapability("marionette", false);
	      driver = new RemoteWebDriver(new URL("http://192.168.0.12:5566/wd/hub"), capabilities);
	     // driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);	
		  
		  
	   //  driver.manage().window().maximize();
	     driver.get("http://google.com");
	     System.out.println(driver.getTitle());
	     
	     
	     
	     
	    //  MO - Another Method
	     
	     
	  // We have to mention browser which we want to use for test execution
	     DesiredCapabilities cap=DesiredCapabilities.firefox();
	      
	     // Set the platform where we want to run our test- we can use MAC and Linux and other platforms as well
	     cap.setPlatform(Platform.WINDOWS);
	      
	     // Here you can use hub address, hub will take the responsibility to execute the test on respective node
	     URL url=new URL("http://localhost:4444/wd/hub");
	      
	     // Create driver with hub address and capability
	     driver = new RemoteWebDriver(url, cap);
	      
	     // start application
	     driver.get("http://learn-automation.com/");
	      
	     // get the title and print the same
	     System.out.println("Blog title is "+driver.getTitle());
	      
	     driver.close();
	     
	     
	     
	     
	     

	
	}
	
	
	
}
	
	
	
	
	
	

	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	


