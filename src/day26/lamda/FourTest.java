package day26.lamda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FourTest {
public static void main(String[] args) {
	//消费型接口
	Consumer<String> c =System.out::println;
	c.accept("辛<。)#)))≦");
	//供给型接口
	Supplier<Student> s = Student::new;
	//函数型
	Function<Student, String> f = u->u.getName();
	String str = f.apply(new Student("张三"));
	System.out.println(str);
	//断言型
	Predicate<String> p = t -> t.length()>0;
	System.out.println(p.test(str));
}
}
