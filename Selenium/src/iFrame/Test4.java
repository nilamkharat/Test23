package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test4 
{
	public static void main(String[]args) throws InterruptedException

	{
		ChromeOptions CO=new ChromeOptions();
		 CO.addArguments("-remote-allow-Origin=*","ignore-certificate-errors");
		 WebDriver driver=new ChromeDriver(CO);
		 
		 driver.get("https://www.flipkart.com/search?q=mobile+redmi&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&as-pos=1&as-type=HISTORY");
          
          String 
          S1=driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]")).getText();
          System.out.println(S1);
}
}
