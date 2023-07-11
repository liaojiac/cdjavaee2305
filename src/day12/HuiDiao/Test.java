package day12.HuiDiao;

public class Test {
public static void main(String[] args) {
	Employee e = new Employee();
	e.setCallBack(new Boss());
	e.doSome();
}
}
