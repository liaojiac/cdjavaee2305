package day25.testutil;

import day25.util.TestJson;

public class Mytest {
public static void main(String[] args) {
	User u =new User("理塘丁真", 21);
	User u2 =new User("王源", 25);
	System.out.println(TestJson.toJSON(u));
	System.out.println(TestJson.toJSON(u2));
	
}
}
