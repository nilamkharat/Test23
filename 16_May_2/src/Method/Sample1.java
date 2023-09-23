package Method;

public class Sample1
{
	public static void main(String[] args)
	{
		//static regular method call from same class
		m1();
		
		//non static regular method call from same class
		
		Sample1 S1=new Sample1();
		
		S1.m2();
		
		//static regular method call from different class
		
		Sample2.m3();
		
		//non static regular method call from different class
		
		Sample2 S2=new Sample2();
		
		S2.m4();
		
		
	}
	 
	public static void m1()
	{
		System.out.println("Method m1 is running from same class");
		
	}
	public void m2()
	{
		System.out.println("Method m2 is running from same class");
	}

}
