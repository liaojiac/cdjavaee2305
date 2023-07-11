package day10.singleton;

public class Student {
	private Student() {
		
	}
	private static Student stu=new Student();
public static Student getInstanse() {
	//if(stu==null) {
		//stu =new Student();
	//}
	return stu;
}
}
