package Collection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Left1 
{
	public static void main(String[]args) throws InterruptedException
	{
		 ChromeOptions CO=new ChromeOptions();
		 CO.addArguments("-remote allow Origin=*","ignore-certificate-errors");
		 WebDriver driver=new ChromeDriver(CO);
		 
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
}
}
