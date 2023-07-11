package day09.test;

public class School {
	String name;
	String address;
	int size;
	public School() {
		
	}
public School(String name,String address,int size) {
		this.name =name;
		this.address=address;
		this.size=size;
	}
	public void show() {
		System.out.println(name+"坐落在"+address+"占地"+size);
		
		
				
	}
}
