package Screenshot;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.Port.Info;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v112.io.IO;
import org.openqa.selenium.io.FileHandler;

public class Test1 
{
	//How to capture Screenshot of Webpage
	    public static void main(String[]args)throws InterruptedException,IOException
	    
	    
	    
	    {
	    	ChromeOptions CO=new ChromeOptions();
	    	CO.addArguments("-remote-allow-Origins=*",    "ignore-certificate-errors");
	    	
	        WebDriver driver=new ChromeDriver(CO);
	       
	    	//To enter URL/Open an Application
	    	driver.get("https://kite.zerodha.com");
	    	
	    	//wait
	    	Thread.sleep(2000);
	    	//Typecasting/Downcasting/Convert
	    	
	    	
	    
	    	
	    	

	 
	 File Source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    	System.out.println(Source);
	    	
	    	File Destination=new File("C:\\Users\\nilam\\OneDrive\\Desktop\\Nilam\\Sanu.jpg");
	    	FileHandler.copy(Source, Destination);
	    	
	    }
}

	    	
	    	
	    	
	    
	    

	    
	    
	


