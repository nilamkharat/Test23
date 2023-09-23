
package Rev_String;

public class Test1 
{
	public static void main(String[] args)
	{
		String str1="Shreyasi";
		String Rev="";
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			Rev=Rev+str1.charAt(i);
			
		}
	  System.out.println(Rev);
	}
	
	
	
}
