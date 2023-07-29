package day25.test;

import java.lang.reflect.Field;

public class TestFiled {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		Class<?> clazz = Class.forName("day25.test.User");
		Object obj = clazz.newInstance();
		Field f1 = clazz.getDeclaredField("name");
		f1.setAccessible(true);
		f1.set(obj, "丁真");
		System.out.println(f1.get(obj));
		Field[] dfs = clazz.getDeclaredFields();
		for (Field f : dfs) {
			System.out.println(f.getName()+","+f.getType().getName());
		}
}
}
