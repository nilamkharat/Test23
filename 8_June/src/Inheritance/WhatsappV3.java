package Inheritance;

public class WhatsappV3 extends WhatsappV2 
{
	public void VideoCalling()
	{
		System.out.println("VideoCalling");
		
	}



public static void main(String[]args)
{
	WhatsappV3 V3=new WhatsappV3();
	V3.AudioCalling();
	V3.Textmsg();
	V3.VideoCalling();
	
	
	
	
}
	
}
