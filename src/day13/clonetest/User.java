package day13.clonetest;

public class User implements Cloneable{
	private String name;
	private int age;
	private Adress adr;//如果是浅度复制，那么new的两个对象p,p1
	//p1复制的p,p1的name和age改变，p不会有影响.但是引用变量发生改变两者都会改变。
	//如果是深度复制，需要把引用变量也重新复制一份，这样两者的引用变量就指向了不同的空间。

	public User(String name, int age, Adress adr) {
		super();
		this.name = name;
		this.age = age;
		this.adr = adr;
	}
	public User() {
		
	}
	public User clone() throws CloneNotSupportedException {
		User u = (User) super.clone();
		u.adr = this.adr.clone();
		return u;
		}
	
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", adr=" + adr + "]";
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
	public Adress getAdr() {
		return adr;
	}
	public void setAdr(Adress adr) {
		this.adr = adr;
	}
	
	
	
}
