package day25.testutil;

import java.lang.reflect.Array;
import java.util.Arrays;

import day25.util.ArrayReflectTest;

public class TestArray {
public static void main(String[] args) {
	

	//反射操作数组
	int[] arr=(int[]) Array.newInstance(int.class, 3);//反射创建数组
//	
//	System.out.println(Array.getLength(arr));
	Array.set(arr, 0, 1000);//反射改变数组的值
//	System.out.println(Arrays.toString(arr));
//	System.out.println(Array.get(arr, 0));//获取值
	int[] newArray =ArrayReflectTest.grow(arr, 10);
	//System.out.println(Arrays.toString(newArray));
	ArrayReflectTest<Integer> arrayReflectTest = new ArrayReflectTest<Integer>(Integer.class);
	Integer[] a = arrayReflectTest.test();
	System.out.println(a);
}
}
