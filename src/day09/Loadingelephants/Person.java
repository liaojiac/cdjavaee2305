package day09.Loadingelephants;

public class Person {
	int age ;
	char gender ;
	String name;
	Elephants elephant;
	public Person(){
		
	}
	public Person(int age,char gender,String name){
		this.age =age;
		this.gender= gender;
		this.name=name;	
		
	}
	public void na(Elephants elephant) {
		System.out.println(this.name+"举起了"+elephant.variety);
	}
	  
}
