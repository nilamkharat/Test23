package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test5 
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
		 
		 String S2=driver.getCurrentUrl();//https://www.facebook.com/
		 
		 System.out.println(S2);
		 
		 
	}

}
