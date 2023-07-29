package day25.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

public class MyClassTest {
public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//	 Class d1=MyClassTest.class;
//	 Class d2= new MyClassTest().getClass();
//	 Class d3= Class.forName("day25.test.MyClassTest");
//	 System.out.println(d1==d2);
//	 System.out.println(d2==d3);
	 Class<User> calzz=User.class;
	 //获取构造
	 Constructor<User> c1= calzz.getConstructor();//根据指定参数获取指定的构造
//	 System.out.println(c1);
//	 User user = c1.newInstance();
//	 System.out.println(user);
	 Constructor<User> c2 = calzz.getDeclaredConstructor(int.class);
//	 c2.setAccessible(true);//打开私有的访问权限
//	 User user = c2.newInstance(3);
	 Constructor<User>[] dcs = (Constructor<User>[]) calzz.getDeclaredConstructors();
	for (Constructor<User> ctr : dcs) {
		System.out.println(ctr);
		//获取构造的参数个数
//		int count =ctr.getParameterCount();
//		System.out.println(count);
//		//获取普通类型的参数
//		Parameter[] pts = ctr.getParameters();
//		for (Parameter pt : pts) {
//			System.out.println(pt.getType());
//		}
		//获取泛型参数
		Type[] gpts = ctr.getGenericParameterTypes();
		for (Type t:gpts) {
			if(t instanceof ParameterizedType) {
				//System.out.println(t);
				ParameterizedType pt = (ParameterizedType) t;
				System.out.println(pt.getRawType()+"----"+Arrays.toString(pt.getActualTypeArguments()));
			}else {
				System.out.println(t.getTypeName());
			}
		}
	}
	 
}
}
