package Abstract_Class;

public class Sample3 extends Sample2
{
	//complete Method
	public void m3()
	{
		System.out.println("Good Morning");
	}
	public void m4()
	{
		System.out.println("Good Afternoon");
	}



public static void main(String[]args)
{
	Sample3 S3=new Sample3();
	S3.m1();
	S3.m2();
	S3.m3();
	S3.m4();
}
}




