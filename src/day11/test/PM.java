package day11.test;

//项目经理
public class PM  extends Employee{
	
	private int base;
	private int prize;
	private int projectPrize;//项目奖
	public PM(String name, int year, int base, int prize,int projectPrize) {
		super(name, year);
		this.base = base;
		this.prize = prize;
		this.projectPrize = projectPrize;
	}
	
	public void calcSalary() {
		setSalary(base+prize+projectPrize+getYear()*10);
	}
	

}
