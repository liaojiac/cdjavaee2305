package day25.util;

import java.lang.reflect.Array;

public class ArrayReflectTest<E> {
		Class<E> clazz;
	public ArrayReflectTest(Class<E> clazz) {
			this.clazz = clazz;
		}
	
	public  <E>E test() {//这个定义的泛型和类上的泛型是不一致的 
		return  (E) Array.newInstance( clazz, 10);//明天问
	}
	
	public static <T> T grow(T array,int length){//使用反射完成任意类型的数组扩容
		Class<? extends Object> arr = array.getClass();//获取类对象
		Class<?> cType = arr.getComponentType();//获取数组元素的类对象
		@SuppressWarnings("unchecked")
		T newArray = (T) Array.newInstance(cType, length);
		for (int i =0;i<Array.getLength(array);i++) {
			Array.set(newArray, i, Array.get(array, i));
		}
		return  newArray;
	}
}
