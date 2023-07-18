package day17.maptest;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeTest {
    public static void main(String[] args) {
    	TreeMap<String,String> map1 = new TreeMap<String, String>();
		map1.put("cn","中国");
		map1.put("us","美国");
		map1.put("jp","日本");
		map1.put("ru","俄罗斯");
		map1.put("uk","英国");
		map1.put("e","欧洲");
		map1.put("a","aa");
		System.out.println(map1);
        TreeMap<User, Integer> map = new TreeMap<>(new Comparator<User>() {
            public int compare(User u1, User u2) {
                if (u1.getAge() != u2.getAge()) {
                    return u1.getAge() - u2.getAge();
                } else if (u1.getSalary() != u2.getSalary()) {
                    return u1.getSalary() - u2.getSalary();
                }
                return u1.hashCode() - u2.hashCode();
            }
        });
        User user1 = new User("张三", 100, -3000);
        map.put(user1, user1.getSalary());
        User user2 = new User("李斯", 50, 9000);
        map.put(user2, user2.getSalary());
        User user3 = new User("神", 1000, 1000000);
        map.put(user3, user3.getSalary());
        User user4 = new User("网无", 50, 10000);
        map.put(user4, user4.getSalary());
        System.out.println(map);
    }
}

	

