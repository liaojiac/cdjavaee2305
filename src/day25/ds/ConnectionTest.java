package day25.ds;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class ConnectionTest {
	public static void main(String[] args) {
		InputStream is = ConnectionTest.class.getClassLoader().getResourceAsStream("ds.properties");
		Properties p = new Properties();
		
			
				try {
					p.load(is);
					String className = p.getProperty("ds");
					System.out.println(className);
					Class<?> clazz= Class.forName(className);
					DataSource ds = (DataSource) clazz.newInstance();
					ds.getConnectin();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

		
	}
}
