package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;



public class Test2 
{
	public static void main(String[]args)throws InterruptedException,IOException
    
    
    
    {
    	ChromeOptions CO=new ChromeOptions();
    	CO.addArguments("-remote-allow-Origins=*", "ignore-certificate-errors");
    	
        WebDriver driver=new ChromeDriver();
       
    	//To enter URL/Open an Application
    	driver.get("https://www.amazon.in/stores/page/7613B800-61FF-4320-8DEF-4A3711D5E41C?ingress=0&visitId=d974cbb4-f77c-4e30-afe2-ce72db1c83c6&lp_slot=auto-sparkle-hsa-tetris&store_ref=SB_A043691735OQHXI0GI7SC&ref_=sbx_be_s_sparkle_lsi4d_ls");
    	driver.manage().window().maximize();
    	driver.findElement(By.xpath("//img[@Class='s-image']"));
    	
    	
    	File Source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
  
    	
    	File Destination=new File("C:\\Users\\nilam\\OneDrive\\Desktop\\Nilam\\piyu.jpg");
    	FileHandler.copy(Source,Destination);
    	
    }
}

  


