package week3.day2;

public class College extends University 
{
	
	@Override
	public void ug() {
		System.out.println("Unimplement Method - Implemented in College class");
		
	}

	public static void main(String[] args) {
		College college = new College();
		college.ug();
		college.pg();

	}


	

}
