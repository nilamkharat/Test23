package Types_of_Variable;   //call non static variable in main method,static method and non static method

public class Test1 
{
    int a=20;
	
	public static void main(String[]args)
  {
	Test1 S1=new Test1();
    System.out.println(S1.a);
    m1();
    Test1 S2=new Test1();
    S2.m2();
	
    
    
  }
	 public static void m1()
	 {
		 Test1 S2=new Test1();
		System.out.println(S2.a); 
	 }
	 public void m2()
	 {
		 System.out.println(a);
	 }


}





	
	
		
		

	
		

	  


	 

