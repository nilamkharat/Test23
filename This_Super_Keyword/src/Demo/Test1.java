package Demo;

public class Test1 extends Test2
{
	int a=20;
	int b=30;
	
    public void m1()
    {
    	int b=50;
    	
    	System.out.println(a);
    	System.out.println(a);
    	System.out.println(this.a);
    	System.out.println(b);
    	System.out.println(b);
    	System.out.println(this.a);
    	System.out.println(super.a);
    }
    
    public static void main(String[]args)
    {
    	Test1 T1=new Test1();
    			T1.m1();
    }
}

    	
    
    	
    	
    	
    

