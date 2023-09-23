package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Launch_Browser.ChromeDriver;

public class Test2
{
	
	
	  public static void main(String[]args)throws InterruptedException
	{
	ChromeOptions CO=new ChromeOptions();
	CO.addArguments("-remote allow Origins=*","ignore-certificate errors");
ChromeDriver driver=new ChromeDriver();

	driver.get("https://profile.w3schools.com/");

	Thread.sleep(2000);


	((WebDriver) driver).findElement(By.xpath("//input[@class='EmailInput_input_field__6t4Ux undefined']")).sendKeys("nilam123@gmail.com");

	//driver.findElement(By.xpath("----------------------")).sendKeys("nilam1234");

	//driver.findElement(By.xpath("//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']")).click();
	}
	}



