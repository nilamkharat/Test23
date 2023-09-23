package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Test4 
{

	public static void main(String[]args)
	{
		 ChromeOptions CO=new ChromeOptions();
			
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		
		//To enter URL
		 driver.get("https://www.flipkart.com/");
		 
		 //to get title
		 String S1=driver.getTitle();//Flipkart Login or Sign up
		 
		 System.out.println(S1);
	}

}
