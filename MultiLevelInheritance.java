package com.multilevel.inheritance;



//Subclass inheriting the property of super class and that super class inhriting the property from
//  another super class 

class whatsapp1 
{
	public void SendMesaage()
	{
		System.out.println("SendMessage() of Whatsapp1 class ");
	}

}

class whatsapp2 extends whatsapp1
{
	public void SendVoiceMessage()
	{
		System.out.println("SendVoiceMessage() of Whatsap2 class");
	}
}

public class MultiLevelInheritance extends whatsapp2
{
	public void VideoCall()
	{
		System.out.println("VideoCall() of Whatsap2 class");
	}

	public static void main(String[] args)
	{
		MultiLevelInheritance multile=new MultiLevelInheritance();
		multile.VideoCall();
		System.out.println("");
		multile.SendMesaage();
		System.out.println("");
		multile.SendVoiceMessage();
		
	}


}
