package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 
{
	public static void main(String[]args) throws InterruptedException
	{
		 ChromeOptions CO=new ChromeOptions();
		 CO.addArguments("-remote-allow-Origin=*","ignore-certificate-errors");
		 WebDriver driver=new ChromeDriver(CO);
		 
		 driver.get("http://omayo.blogspot.com/");
		 Thread.sleep(2000);
		 
		 List<WebElement> Allrowaddresses=driver.findElements(By.xpath("//table[@id='table1']//tr"));
		   int S1 = Allrowaddresses.size();
		 System.out.println(S1);
		 
		 

}
}
