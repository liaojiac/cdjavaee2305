package day11.test;

public class Test {
	public static void main(String[] args) {
		Employee p1 =new PM("张三",10,10000,12000,2000);
		Employee p2 =new PM("李斯",9,8000,12000,2000);
		Employee se1= new SE("王", 5, 9000, 8000);
		Employee se2= new SE("岳", 4, 8000, 7000);
		Employee s1= new Sale("黄", 3, 3000, 5000, 10000);
		Employee s2= new Sale("叶", 2, 2000, 5000, 10000);
		Employee[] emp = {p1,p2,se1,se2,s1,s2};
		int sum =0;
		for (int i = 0; i < emp.length; i++) {
			if(emp[i] instanceof PM) {
				PM pm =(PM)emp[i];
				pm.calcSalary();
				System.out.println(pm.getName()+"工资"+pm.getSalary());
				sum +=pm.getSalary();
			}
			if(emp[i] instanceof SE) {
				SE se =(SE)emp[i];
				se.calcSalary();
				System.out.println(se.getName()+"工资"+se.getSalary());
				sum +=se.getSalary();
			}
			if(emp[i] instanceof Sale) {
				Sale se =(Sale)emp[i];
				se.calcSalary();
				System.out.println(se.getName()+"工资"+se.getSalary());
				sum +=se.getSalary();
			}
		}
		System.out.println("所有人总工资:"+sum);
	}
	
}
