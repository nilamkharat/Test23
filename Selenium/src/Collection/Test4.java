package Collection;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test4 
{
	public static void main(String[]args)throws InterruptedException,IOException
	{
		ChromeOptions CO=new ChromeOptions();
		CO.addArguments("-remote-allow-origins", "ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(CO);
		
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		Thread.sleep(2000);
		
		Set<String> IDs=driver.getWindowHandles();
		System.out.println(IDs);
		
		ArrayList<String>al=new ArrayList<String>(IDs);
	
		String MPID=al.get(0);
		System.out.println(MPID);
		
		String WPID=al.get(1);
		System.out.println(WPID);
		Thread.sleep(2000);
		
		driver.switchTo().window(WPID);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		Thread.sleep(2000);
		
		
		driver.switchTo().window(MPID);
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//input[@value='New Window']")).click();
	
	

		
		
		
		
	
		
		
		
		
	}
}
