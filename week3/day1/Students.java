package week3.day1;

public class Students {
	
	public void getStudentInfo(int id)
	{
		System.out.println(id);
	}
	
	public void getStudentInfo(int id, String name)
	{
		System.out.println(id + " " + name);
	}
	
	public void getStudentInfo(String email, String phno)
	{
		System.out.println(email + " " + phno);
	}
	public static void main(String[] args) 
	{
		Students stud = new Students();
		stud.getStudentInfo(1001);
		stud.getStudentInfo(1002, "RajeshNarayanan");
		stud.getStudentInfo("rajesh.narayanan@test.com", "90567783928");
	}

}
