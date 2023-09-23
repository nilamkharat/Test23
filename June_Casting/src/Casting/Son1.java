package Casting;

public class Son1 extends Father1 
{
	public void Mobile()
	{
		System.out.println("Samsung A50");
	}
	public void Car()
	{
		System.out.println("Kia Seltos");
	}
	public void Home()
	{
		System.out.println("3 BHK");
	}
	public void Money()
	{
		System.out.println("3 Lakhs");
	}
	

public static void main(String[]args)
{
	Father1 S1=new Son1();
	S1.Car();
	S1.Home();
	S1.Money();
}
}

