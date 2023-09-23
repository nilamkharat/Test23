package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 
{
	public static void main(String[]args) throws InterruptedException 
	{
		 ChromeOptions CO=new ChromeOptions();
			
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 
		
		//To enter URL
		 driver.get("https://www.facebook.com/");
		 
		 //wait
		 Thread.sleep(2000);
		 //To get current URL of the webpage
		 
		 //enter Username
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nilukharat3388@gmail.com");
		 

}
}

