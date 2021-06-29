package org.student;

import org.department.Department;

public class Student extends Department
{
	
	public void studentName()
	{
		System.out.println("Student Name: Mr. JamesBond");
	}

	public void studentDept()
	{
		System.out.println("Student Department: ECE");
	}
	
	public void studentId()
	{
		System.out.println("Student ID is: 1001");
	}
	
	public static void main(String[] args) 
	{
		Student stud = new Student();
		stud.studentId();
		stud.studentDept();
		stud.studentName();
		stud.deptName();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();

	}

}
