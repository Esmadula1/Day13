package Demo;

public class carDemo {

	public static void main(String[] args) {
		// first object
		cars car1 = new cars();
		car1.assign("Hyundai", "Ionique", "White", "2018", 5, 2000.50f);
		car1.display();
		
		System.out.println();
		
		//second object
		cars car2 = new cars();
		car2.assign("Nesan", "Cashqay", "Silver", "66", 6, 30000);
		car2.display();
		
		System.out.println();
		//third object
		cars car3 = new cars();
		car3.assign("Merc", "C", "White", "19", 6, 10000);
		car3.display();

	}

}
