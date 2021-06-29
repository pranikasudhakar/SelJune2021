package org.system;

public class Desktop extends Computer
{
	
	public void desktopSize() 
	{
		System.out.println("This is desktop size method");

	}

	public static void main(String[] args) 
	{
		Desktop desk = new Desktop();
		desk.desktopSize();
		desk.computerModel();
	}

}
