package Launch_Browser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test13 
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
		 
		 //Create Object of Point Class
		 Point P1=new Point(100,200);//X Y
		 
		 //To change Position of the Browser
		 driver.manage().window().setPosition(P1);//X  Y
		 

}
}