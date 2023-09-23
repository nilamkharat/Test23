package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test8
{
	
	public static void main(String[]args)
	{
		 ChromeOptions CO=new ChromeOptions();
			
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		
		//To enter URL
		 driver.get("https://www.Amazon.com/");		
	}
	

	



	}


