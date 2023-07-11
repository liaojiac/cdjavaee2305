package day09.work;

public class Person {
	int age ;
	char gender ;
	String name;
	KitchenKnife knife;
	Vegetable vegetable;
	public Person(){
		
	}
	public Person(int age,char gender,String name){
		this.age =age;
		this.gender= gender;
		this.name=name;
		
		
	}
	  public void cut(KitchenKnife knife,Vegetable vegetable) {
	    	System.out.println(name+"正在使用"+knife.Material+"切"+vegetable.dishes);
	    }
}
