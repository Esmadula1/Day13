package Demo;

public class Car {

	public String make;
	public String model;
	public int year;
	
	public Car(String make,String model, int year) {
		this.make = make;
		this.model = model;
		this.year=year;
	}
	public void checkCarYear() {
		if(year > 2010) {
			System.out.println("This car is manufactured after 2010");
			
		}else {
			System.out.println("This car is manufactured in or before 2010");
		}
	}

}
