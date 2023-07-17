package day16.listtest;

import javax.print.attribute.standard.MediaSize.Other;

public class Worker {
	private String name;
	private int age;
	private int salary;
	public Worker(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public Worker() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public  String toString() {
		return "名字:"+name+"\t"+"年龄"+age+"\t"+"工资"+salary;
	}
	public void work() {
		System.out.println(name+"在工作");
		
	}
	   public boolean equals(Object obj) {
	   if(this==obj) {
		   return true;
		   }
	   if(obj==null||getClass()!=obj.getClass()) {
		   return false;
	   }
	   Worker other = (Worker)obj;
	return name.equals(other.name)&&age==other.age&&salary==other.salary;
	   }
}
