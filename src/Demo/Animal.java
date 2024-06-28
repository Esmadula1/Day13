package Demo;

public class Animal {
	//instance variables
	public String catName;
	public String catColour;
	public int catAge;
	
	//instance method
	public void assign(String catName,String catColour,int catAge) {
		this.catName=catName;
		this.catColour=catColour;
		this.catAge=catAge;
	}
	
	//instance method
	
	public void display() {
		System.out.println("Your cat name is "+catName);
		System.out.println("Your cat colour is "+catColour);
		System.out.println("and your cat age is "+catAge);
	}
	

}
