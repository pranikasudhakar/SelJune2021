package week3.day2;

public class Desktops implements Softwares, HardWare
{
	
	public void desktopModel()
	{
		System.out.println("This is Desktop Model");
	}

	public void hardwareResources() {
		System.out.println("This is Desktop Model - Hardware Resources");
		
	}

	public void softwareResources() {
		System.out.println("This is Desktop Model - Software Resources");
		
	}
	
	public static void main(String[] args) {
		Desktops desk = new Desktops();
		desk.desktopModel();
		desk.hardwareResources();
		desk.softwareResources();
	}

}
