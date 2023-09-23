package costructore;

public class Test1
{
	//variable Declaration
	int X;
	int Y;
	String studentname;
	
	//Variable Initialization
	
	Test1()
	{
		X=20;
		Y=40;
		
	}
	Test1(int a,int b)
	{
		X=a;
		Y=b;
	}
		Test1(String Sname)	
	{
	studentname=Sname;
	
	}
		public void addition()
		{
			int add1=X+Y;
			System.out.println(add1);
		}
		
		public void m1()
		{
			System.out.println(studentname);
		}
		
		public static void main(String[]args)
		{
			Test1 T1=new Test1();
			T1.addition();
			
			Test1 T2=new Test1(50,60);
			T2.addition();
			
			Test1 T3=new Test1("Virat");
			T3.m1();
		}
		
	
	
	
		
	
	
	 
}
	