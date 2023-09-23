package Launch_Browser;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test11 
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
		 
		//Create object of Dimension Class
		 Dimension D1=new Dimension(400,700);//width height
		 
		 //To set size of browser
		 driver.manage().window().setSize(D1);//width height
}
}


