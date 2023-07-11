package day09.Loadingelephants;

public class Icebox {
	String brand;
	double price;
	Person person;
	Elephants elephant;
	public Icebox() {
		
	}
	public Icebox(String brand,double price) {
		this.brand=brand;
		this.price=price;
	}
	public void open(Person person) {
		System.out.println(person.name+"打开了"+this.brand+"冰箱");
	}
	public void zhuang(Person person,Elephants elephant) {
		System.out.println(person.name+"把"+elephant.variety+"装进了冰箱");
	}
	public void close(Person person) {
		System.out.println(person.name+"关闭了冰箱门");
	}
}
