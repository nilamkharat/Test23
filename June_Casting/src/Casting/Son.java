package Casting;

public class Son extends Father
{
   //car  //Home   //Money
	
	
	
	public void Mobile()
   {
	   System.out.println("Samsung A50");
   }


    public static void main(String[]args)
    {
    	Father S1=new Son();
    	S1.Car();
    	S1.Home();
    	S1.Money();
    }
    	
    }
