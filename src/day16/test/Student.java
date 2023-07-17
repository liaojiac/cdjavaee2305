package day16.test;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
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
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Student() {
	}
	@Override
	public int compareTo(Student o) {
		if(this.age!=o.age) {
		return this.age-o.age;}
		else if(this.name!=o.name) {
			return -1;
		}
		return 0;
	}
	public String toString() {
		return name+age+" ";
		
	}
	
}
