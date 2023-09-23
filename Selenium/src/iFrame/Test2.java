package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test2 
{
	public static void main(String[]args) throws InterruptedException

{
	ChromeOptions CO=new ChromeOptions();
	 CO.addArguments("-remote-allow-Origin=*","ignore-certificate-errors");
	 WebDriver driver=new ChromeDriver(CO);
	 
	 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	 Thread.sleep(2000);
	 
	 driver.switchTo().frame("iframeResult");
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//button[@type='button']")).click();
	 
	 //wait
	 Thread.sleep(2000);
	 
	 //click Home Icon
	 driver.switchTo().defaultContent();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//a[@id='tryhome']")).click();
}

	 

}

