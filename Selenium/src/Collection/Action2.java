package Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Action2
{
	public static void main(String[]args) throws InterruptedException
	{
		 ChromeOptions CO=new ChromeOptions();
		 CO.addArguments("-remote allow Origin=*","ignore-certificate-errors");
		 WebDriver driver=new ChromeDriver(CO);
		 
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
		 WebElement S2=driver.findElement(By.xpath("//a[@class='_3SkBxJ']"));
		 
		 Actions act=new Actions(driver);
		 
		 Thread.sleep(2000);
		 
		 act.contextClick(S2).perform();
		 
		 
		
	}

}
