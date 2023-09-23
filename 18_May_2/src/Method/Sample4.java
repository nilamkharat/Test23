package Method;

public class Sample4 
{
	public static void main(String[] args)
	{
		addition(20,30,40);//methodname
		
		Sample4 S1=new Sample4();//create object of same class
		
		S1.addition(50,60); //call the method
		
		
	}


//static regular method with 3 int parameters

  public static void addition(int x,int y,int z)
  {
	  int sum1=x+y+z;
	  
	  System.out.println(sum1);
  }
  
  //non static regular method with 2 parameters
  
  public void addition(int a,int b)
  {
	  int sum2=a+b;
	  
	  System.out.println(sum2);
	  
  }
	  
  }


