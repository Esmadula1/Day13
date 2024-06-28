package Demo;

public class AnimalInfo {

	public static void main(String[] args) {
		// creating animal objects
		
		//first object
		Animal ani1 = new Animal();
		ani1.assign("Jazpa", "White", 5);
		ani1.display();
		
		System.out.println();//this will create a gap between the objects
		
		//second object
		Animal ani2 = new Animal();
		ani2.assign("Tom", "Gray", 3);
		ani2.display();
		
		System.out.println();
		
		//third object
		Animal ani3 = new Animal();
		ani3.assign("Meow", "Carpeti", 10);
		ani3.display();

	}

}
