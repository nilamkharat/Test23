package Rev_String;

public class Demo1 
{
	public static void main(String[]args)
	{
	
	String org="Nilam";
	String Rev="";
	for(int i=org.length()-1;i>=0;i--)
	{
		Rev=Rev+org.charAt(i);

	}
	System.out.println(Rev);

}
}
