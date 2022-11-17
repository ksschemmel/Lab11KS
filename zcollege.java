package Lab_11;

public class zcollege {
String name;
String address;
Student student;
Department department; 

zcollege(String name, String address, Student student, Department department){
	this.name = name;
	this.address = address;
	this.student = student;
	this.department = department;
}
public static void main(String[] args) {
	Student student = new Student ("Kailey","2001 Newburg Rd Louisville, KY 40205", "Criminal Justice",19);
	Department department = new Department("Criminal Justice", "Kaitlyn Selman");
	zcollege college1 = new zcollege("Bellarmine University","2001 Newburg Rd Louisville, KY 40205", student, department);
	System.out.println("------College Details------");
	System.out.println("College name: "+ college1.name);
	System.out.println("College address: "+ college1.address);
	System.out.println("------Student Details------");
	System.out.println("Student name: "+ college1.student.sname);
	System.out.println("Student address: "+ college1.student.saddress);
	System.out.println("Student department: "+ college1.student.sdepartment);
	System.out.println("Student age: "+ college1.student.sage);
	System.out.println("------Department Details------");
	System.out.println("Department name: "+ college1.department.dname);
	System.out.println("Department chair: "+ college1.department.dchair);
	
}
}
