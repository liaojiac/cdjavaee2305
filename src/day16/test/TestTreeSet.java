package day16.test;

import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		TreeSet<Student> stus = new TreeSet();
		/*stus.add(1);
		stus.add(100);
		stus.add(200);
		stus.add(9);
		System.out.println(stus);*/
		
		Student s1 = new Student("张三",99);
		Student s2 = new Student("李斯",66);
		Student s3 = new Student("网往",55);
		Student s4 = new Student("阳江",1999);
		Student s5 = new Student("江",99);
		stus.add(s1);
		stus.add(s2);
		stus.add(s3);
		stus.add(s4);
		stus.add(s5);
		System.out.println(stus);
	}
	
}
