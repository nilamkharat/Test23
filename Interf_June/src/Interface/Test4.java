package Interface;

public class Test4 implements Test3
{
	public void m1()
	{
		System.out.println("Hi");
	}
	public static void main(String[]args)
	{
		Test4 T4=new Test4();
		T4.m1();
	}



}
