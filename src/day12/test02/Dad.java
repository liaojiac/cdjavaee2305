package day12.test02;

public interface Dad{
   default void method() {
	   System.out.println("这是Dad的默认方法");
   }
}
