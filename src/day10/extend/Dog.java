package day10.extend;

public class Dog extends Pet {
	

	String gender;

	public Dog(String name, String variety, String color, String gender) {
		super(name, variety, color);
		this.gender = gender;
	}
	
}
