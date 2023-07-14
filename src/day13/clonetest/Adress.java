package day13.clonetest;

public class Adress implements Cloneable{
	@Override
	public String toString() {
		return "Adress [number=" + number + ", name=" + name + "]";
	}
	int number;
	String name;
	public Adress(int number, String name) {
		super();
		this.number = number;
		this.name = name;
		
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Adress clone() throws CloneNotSupportedException {
		return (Adress) super.clone() ;
		
	}
}
