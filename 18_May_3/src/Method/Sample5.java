package Method;

public class Sample5 
{
	public static void main(String[] args)
	{
		studentinfo("Virat",20,'A',80.25f);
		
		studentinfo("Rohit",10,'B',50.45f);
		
	}
	
	//static regular method-with 4 argument/parameter
	
	public static void studentinfo(String studentname,int studentrollno,char studentgrade,float studentpercentage)
	{
		System.out.println(studentname);
		System.out.println(studentrollno);
		System.out.println(studentgrade);
		System.out.println(studentpercentage+"%");
		
	}
	
	
}


