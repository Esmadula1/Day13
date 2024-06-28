package Demo;

public class Student {
	//instance variables
	public String name;
	public int idno;
	public int age;
	public char grade;
	
	//instance method
	public void assign(String name,int idno,int age,char grade) {
		this.name=name;
		this.idno=idno;
		this.age=age;
		this.grade=grade;
	}
	
	//instance method
	public void display() {
		System.out.println("Student name = "+name);
		System.out.println("Student idno = "+idno);
		System.out.println("Student age = "+age);
		System.out.println("Student grade = "+grade);
	}

}
