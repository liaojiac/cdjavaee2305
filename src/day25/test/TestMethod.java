package day25.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestMethod {
public static void main(String[] args) {
	try {
		Class<?> clazz=Class.forName("day25.test.User");
		Object obj = clazz.newInstance();
		Method m1 = clazz.getMethod("method01");
		m1.invoke(obj);
		Method m2 =clazz.getMethod("method02",int.class,int.class);
		int result=(int) m2.invoke(obj, 1,2);
		System.out.println(result);
//		System.out.println("获取所有的方法");
//		Method[] ms = clazz.getMethods();
//		for(Method m:ms) {
//			System.out.println(m);
//		}
		Method m3 = clazz.getDeclaredMethod("method03",int.class,int.class);
	m3.setAccessible(true);
		System.out.println(m3);
	int result2=(int) m3.invoke(obj,3,2);
	System.out.println(result2);
	clazz.getMethod("method04");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (NoSuchMethodException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalArgumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvocationTargetException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
