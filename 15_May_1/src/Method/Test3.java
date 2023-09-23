package Method;

public class Test3 
{
	public static void main(String[] args)
	
	{
		//create object of same class
	Test3 S3=new Test3();
		//call the method
		S3.m1();
		S3.m2();
		S3.m3();
		
		
		
	}
	
	public void m1()
	{
		System.out.println("Running method m1 from same class");
	}
	public void m2()
	{
		System.out.println("Running method m2 from same class");
		
	}
	public static void m3()
	{
		System.out.println("Running method m3 from same class");
	}
	


}
