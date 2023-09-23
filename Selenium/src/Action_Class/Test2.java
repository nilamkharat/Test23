package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Test2 
{

	public static void main(String[]args) throws InterruptedException
	{
		 ChromeOptions CO=new ChromeOptions();
		 CO.addArguments("-remote-allow-Origin=*","ignore-certificate-errors");
		 WebDriver driver=new ChromeDriver(CO);
		 
		 driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		 Thread.sleep(2000);
		 
		 WebElement S1=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		 
		 Actions act=new Actions(driver);
		 
		 act.doubleClick(S1).perform();
		 
	}
}

