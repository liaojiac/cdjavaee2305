package day11.test;

public class Sale extends Employee{
	private int base;
	private int prize;
	private int commission;
	public Sale(String name, int year, int base, int prize, int commission) {
		super(name, year);
		this.base = base;
		this.prize = prize;
		this.commission = commission;
	}
	public void calcSalary() {
		setSalary(base+prize+commission+getYear()*10);
	}
	
}
