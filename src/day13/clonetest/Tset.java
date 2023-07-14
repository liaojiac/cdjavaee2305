package day13.clonetest;

public class Tset {
	public static void main(String[] args) throws CloneNotSupportedException {
	User p = new User("声明",19,new Adress(13,"成都"));
	User p1 =new User();
	p1=p.clone();
	p1.getAdr().setName("ss");
	System.out.println(p);
	System.out.println(p1);
	
}
}
