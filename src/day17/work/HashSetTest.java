package day17.work;

import java.util.HashSet;

public class HashSetTest {
public static void main(String[] args) {
	 HashSet<Student> ha=new HashSet<Student>();
	 ha.add(new Student("张三",156845623));
	 ha.add(new Student("李斯",215845626));
	 ha.add(new Student("赵高",1524856));
	 ha.add(new Student("张三",156845623));
	 System.out.println(ha);
	
}
}
