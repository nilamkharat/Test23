package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Test6 
{
	public static void main(String[]args) throws InterruptedException
	{
		 ChromeOptions CO=new ChromeOptions();
		 CO.addArguments("-remote-allow-Origin=*","ignore-certificate-errors");
		 WebDriver driver=new ChromeDriver(CO);
		 
		 driver.get("https://www.facebook.com");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		 
		 
		 Thread.sleep(2000);
		 
		 WebElement Month=driver.findElement(By.id("month"));
		 
		 Actions act=new Actions(driver);
		 
		 act.click(Month).perform();
		 
		 Thread.sleep(2000);
		 
		 act.sendKeys(Keys.END).perform();
		 
		 for(int i=1; i<=7; i++)
		 {
			 Thread.sleep(1000);
			 
			 act.sendKeys(Keys.ARROW_UP).perform();
		 }
		 
		 Thread.sleep(2000);
		 
		 act.sendKeys(Keys.ENTER).perform();

}
}