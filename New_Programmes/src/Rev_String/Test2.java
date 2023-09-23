package Rev_String;

public class Test2 
{
	public static void main(String[] args)
	{
		int a=25;
		int b=45;
		
		System.out.println("First Number:" +a);
		System.out.println("Second Number:" +b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Swapped First Number:" +a);
		System.out.println("Swapped Second Number:" +b);
		
	}
	

}
