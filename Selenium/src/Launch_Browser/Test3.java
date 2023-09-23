package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test3 
{
	public static void main(String[]args) throws InterruptedException
	{
		 ChromeOptions CO=new ChromeOptions();
			
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver driver=new ChromeDriver(CO); 
		
		//To enter URL
		 driver.navigate().to("https://www.instagram.com/");
		 
		 //Wait
		 Thread.sleep(2000);  
		 
		 //To Move Backward
		 driver.navigate().back();//facebook
		 
		 //Wait
		 Thread.sleep(2000);
		 
		//To Move Forward
		 driver.navigate().forward();
		 
		 //Wait
		 Thread.sleep(2000);
		 
		 //To refresh webpage
		 driver.navigate().refresh();
		 
		 
		
		 
		 
		 
		 
		 
		 
		 
}
	
}
