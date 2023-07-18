package day17.maptest;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Maptest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("11a", "这是1");
		map.put("22b", "这是2");
		map.put("33c", "这是3");
		map.put("44d", "这是4");
		//循环键
		for (String key :map.keySet()) {
			System.out.println(key+"---"+map.get(key));
		}
		System.out.println("----------");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+"----"+map.get(key));
		}
		System.out.println("----------");
		//循环值
		for(String value :map.values()) {
			System.out.println(value);
		}
		Iterator<String> it1 = map.values().iterator();
		while(it1.hasNext()){
			String value = it1.next();
			System.out.println(value+"-----");
		}
		System.out.println("----------");
		//循环键值对
		for(Entry<String,String> kv: map.entrySet()) {
			System.out.println(kv.getKey()+"----"+kv.getValue());
		}
		Iterator<Entry<String,String>> it2 = map.entrySet().iterator();
		while(it2.hasNext()) {
			Entry<String,String> kv =it2.next();
			System.out.println(kv.getKey()+"----"+kv.getValue());
		}
	}
}
