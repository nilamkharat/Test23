package Collection;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Action1 
{
	
public static void main(String[]args) throws InterruptedException
{
  ChromeOptions CO=new ChromeOptions();
  CO.addArguments("-remote-allow-origins=*", "ignore-certificate-errors");
  WebDriver driver=new ChromeDriver(CO);
  
  driver.get("https://demo.automationtesting.in/Frames.html");
  Thread.sleep(2000);
  
  WebElement S1=driver.findElement(By.xpath("//a[text()='SwitchTo']"));
  
  Actions act=new Actions(driver);
 
  act.moveToElement(S1).perform();
 
  Thread.sleep(2000);
  
  driver.findElement(By.xpath("//a[text()='Windows']")).click();
  
  
  
  
  
  
  
		  
  
  
  
}
}