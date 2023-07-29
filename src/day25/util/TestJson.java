package day25.util;

import java.lang.reflect.Field;

public class TestJson {
	public static String toJSON(Object obj) {
		String json = "{";
		Class<? extends Object> clazz = obj.getClass();
		Field[] dfs = clazz.getDeclaredFields();
		
			try {
				for (int i=0;i<dfs.length;i++) {
					Field f = dfs[i];
				f.setAccessible(true);
					json+="\""+f.getName()+"\":\""+f.get(obj)+"\"";
					if(i!=dfs.length-1) {
						json+=",";
					}
				}
				json+="}";
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		
		
		return json;
		
		
	}
}
