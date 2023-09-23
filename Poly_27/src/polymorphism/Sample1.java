package polymorphism;

public class Sample1 
{
    public static void main(String[]args)
    {
    	//create object of Son Class
    	Son S1=new Son();
    			S1.Bike();
    			S1.Car();
    			S1.Home();
    			S1.Money();
    	//create object of Father class
    			{
    				Father F1=new Father();
    				F1.car();
    				F1.Money();
    				F1.Home();
    			}
    			
    }
}

