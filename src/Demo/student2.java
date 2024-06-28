package Demo;

public class student2 {

	public static void main(String[] args) {
		// creating objects
		
		Student std1 = new Student();
		std1.assign("Esmadula", 101, 21, 'A');
		std1.display();
		
		System.out.println();
		
		//second object
		Student std2 = new Student();
		std2.assign("John", 102, 32, 'B');
		std2.display();
		
		System.out.println();
		
		//third object
		Student std3 = new Student();
		std3.assign("David", 103, 45, 'C');
		std3.display();
		
	}

}
