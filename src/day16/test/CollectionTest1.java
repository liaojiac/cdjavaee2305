package day16.test;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest1 {
	public static void main(String[] args) {
		/*ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(1);
		list.add(2);
	/*	for (Object n : list) {
			list.remove((ArrayList)n);
			
		}
		for (int i = 0; i < list.size();) {
			list.remove(i);
		}
		System.out.println(list);*/
		ArrayList<String> li = new ArrayList();
		
		li.add("张三");
		li.add("三张");
		li.add("李斯");
		li.add("张三锋");
		li.add("法外张三");
		li.add("杀杀三");
		li.add("唐三");
		for (int i =li.size()-1; i >=0;i--) {
			if(li.get(i).contains("张三")) {
				li.remove(i);
				
			}
			
		}
		System.out.println(li);
	}
	
	
}
