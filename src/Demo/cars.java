package Demo;

public class cars {
	//instance variables
	
	public String make;
	public String model;
	public String color;
	public String year;
	public int gear;
	public float price;
	public double vat = price * 0.20;
	
	public void assign(String make, String model,String color,String year,int gear,float price) {
		this.make=make;
		this.model=model;
		this.color=color;
		this.year=year;
		this.gear=gear;
		this.price=price;
	}
	
	public void display() {
		System.out.println("Make  "+make);
		System.out.println("Model "+model);
		System.out.println("Color "+color);
		System.out.println("Year  "+year);
		System.out.println( +gear+" gear");
		System.out.println("Price  " +price);
	}

}

