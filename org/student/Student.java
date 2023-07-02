package org.student;

import org.department.Department;

public class Student extends Department  {
	
	public void studentName() {
		
		System.out.println("Student Name is Aji");
	}
public void studentDept(){
	
	System.out.println("Student Depatment is Maths");
}

public void studentId() {
	
	System.out.println("Student Id is two");
	
}
public static void main(String[] args) {
	Student stu = new Student();
	
	stu.collegeName();
	stu.collegeCode();
	stu.collegeRank();
	stu.deptName();
	stu.studentName();
	stu.studentDept();
	stu.studentId();
	
	
}


}
