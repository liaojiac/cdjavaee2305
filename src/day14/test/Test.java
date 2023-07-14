package day14.test;

public class Test {
	public static void main(String[] args) {
		String userString = "{username=zhangsan,age=20,gender=男,password=666}";
		userString=userString.replace("{","").replace("}","");
		String[] filed=userString.split(",");//split方法拆分字符串重给定的符号
		User u =new User();//把字符串拆分并且赋给对象。
		u.setUsername(filed[0].split("=")[1]);
		u.setAge(Integer.parseInt(filed[1].split("=")[1]));
		u.setGender(filed[2].split("=")[1]);
		u.setPassword(filed[3].split("=")[1]);
		System.out.println(u.toString());
		
		
		
	}
}
