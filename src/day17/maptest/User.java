package day17.maptest;

public class User{
	String name;
	int age;
	int salary;
	public User(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public User() {
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
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

/*	@Override
	public int compareTo(User o) {
		if(this.age-o.age!=0) {
		return o.age-this.age;
		}else {return o.getSalary()-this.salary;}
		
	}*/
	
}
