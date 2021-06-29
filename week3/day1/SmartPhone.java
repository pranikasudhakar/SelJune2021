//Method Overriding
package week3.day1;

public class SmartPhone extends AndroidPhone
{
		
	public void connectWhatsApp()
	{
		System.out.println("This is SmartPhone - Whatsapp");
	}
	
	
	//parent class has the same method name and no difference in arguments
	public void takeVideo() 
	{
		System.out.println("Child Class Take the Video");
	}

	public static void main(String[] args)
	{
		SmartPhone mySmartPhone = new SmartPhone();
		mySmartPhone.takeVideo();
		mySmartPhone.connectWhatsApp();
	}
}
