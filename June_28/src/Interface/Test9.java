package Interface;

public class Test9 implements Version_9
{
	public void m1()
	{
		Version_9.super.m1();
		
	}
	public void m2()
	{
		Version_9.super.m2();
		
	}
	
	public static void main(String[]args)
	{
		Test9 T9=new Test9();
	     T9.m1();
		T9.m2();
	}
}
	


