package day10.extend;

import org.openjdk.jol.info.ClassLayout;

public class Test {
	public static void main(String[] args) {
		Cat cat =new Cat(null, null, null, 0);
		cat.color="白色";
		cat.setName("喵");
		
		System.out.println(ClassLayout.parseInstance(cat).toPrintable());
		
	}
}
