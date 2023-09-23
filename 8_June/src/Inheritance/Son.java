package Inheritance;

public class Son extends Father 
{
	
	public void Mobile()
	{
		System.out.println("Samsung A50");
	}

public static void main(String[]args)
{

	Son S1=new Son();
	S1.Car();
	S1.Money();
	S1.Home();
	S1.Mobile();
	
}

}

