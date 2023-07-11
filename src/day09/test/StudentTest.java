package day09.test;

public class StudentTest {
	public static void main(String[] args) {
		School s1 =new School("cd大学","四川",1000);
		
		School s2 =new School();
		s2.address ="四川";
		s2.name = "大学";
		s2.size = 3000;
		Student x1=new Student();
		x1.age=18;
		x1.gender='男';
		x1.school =s2;
		x1.school.show();
		
		x1.test();		
		
	}
}
