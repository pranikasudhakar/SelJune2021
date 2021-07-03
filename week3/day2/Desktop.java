package week3.day3;


public class Desktop implements Software, Hardwares {
	
	public void desktopMobile()xx {
		System.out.println("THis is desktop Mobile - Desktop Class");
	}
		
		public void hardwareResources() {
			System.out.println("This is the Desktop class - Software Resources");
			
		}

		public void softwareResources() {
			System.out.println("This is desktop class- Hardware Resources");
			
		}

	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.desktopMobile();
		desk.hardwareResources();
		desk.softwareResources();
	}

	

}
