package Launch_Browser;
import org.Openqa.selenium.Dimension;
public class Test3
{
	public static void main(String[]args)
	{
		ChromeOptions CO=new ChromeOptions();
		CO.addArguments("-remote-allow-Origins*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(CO);
	}
	
}
