package day11.test;

//普通程序员
public class SE extends Employee {
	
	private int base;//基本工资
	private int prize;//奖金

	public SE(String name, int year,int base,int prize) {
		super(name, year);
		this.base = base;
		this.prize = prize;
	}
	
	public void calcSalary() {
		setSalary(base+prize+getYear()*10);
	}
	

}