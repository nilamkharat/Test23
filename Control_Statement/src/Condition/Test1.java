package Condition;

public class Test1 
{
  public static void main(String[]args)
  {
	 String UN="pqr";
	 String PSW="mno";
	 
	if("abc"==UN)
	{
		System.out.println("Correct UN");
		if("xyz"==PSW)
		{
			System.out.println("Correct Password");
		}
		else
		{
			System.out.println("Wrong Password:Login Failed");
		}
	}
	else
	{
		System.out.println("Wrong UN:Login Failed");
	
	}
}
}
	
	 
  
  
  
  
  
  

