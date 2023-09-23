package Method;

public class Sample3 
{
	public static void main(String[]args)
	{
		addition();
		addition();
		addition(30,40);
		addition(50,60);
		
	}
   //static regular method-zero parameter/arguments
	
	public static void addition()
	{
		int a=10;
		int b=20;
		int sum=a+b;//30
		System.out.println(sum);//30
	}
	
	//static regular method-with 2 int parameter/arguments
	
	public static void addition(int c,int d)
	{
		int sum1=c+d;
		System.out.println(sum1);
	}
}
		
	
	
	
	
	
	
	
	
	

