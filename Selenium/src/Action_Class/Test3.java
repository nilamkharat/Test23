package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Test3 
{
	public static void main(String[]args) throws InterruptedException
	{
		 ChromeOptions CO=new ChromeOptions();
		 CO.addArguments("-remote-allow-Origin=*","ignore-certificate-errors");
		 WebDriver driver=new ChromeDriver(CO);
		 
		 //driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		 
		 driver.get("https://demo.guru99.com/test/drag_drop.html");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 WebElement Source=driver.findElement(By.xpath("//a [text()=' 5000 ']"));
		 
		 WebElement destination=driver.findElement(By.xpath("(//li[@ class='placeholder'])[4]"));
		 
		 Actions act=new Actions(driver);
		 
		 act.dragAndDrop(Source,destination).perform();
				 
		 

		 

}
}
