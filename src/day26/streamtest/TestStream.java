package day26.streamtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		addAll(users);
		//集合生成流
		//Stream<User> stream = users.stream();
		//中间操作：filter过滤、limit 限制、skip 跳过、distinct 去掉重复、sorted排序
		//(1)filter过滤
		//users.stream().filter(u->u.getAge()>30).forEach(System.out::println);
		//(2)limit限制
		//users.stream().limit(5).forEach(System.out::println);
		//(3) skip跳过
		//users.stream().skip(3).forEach(System.out::println);//跳过3个
		//(4)distinct去重复
		//users.stream().distinct().forEach(System.out::println);
		//(5)sorted排序
		/*users.stream().sorted((o1, o2) ->{
			System.out.println("执行排序");
			if(o1.getSalary()!=o2.getSalary()) {
				return o1.getSalary()-o2.getSalary();
			}
			if(o1.getAge()!=o2.getAge()) {
				return o1.getAge()-o2.getAge();
			}
			return o1.hashCode()-o2.hashCode();
		}).forEach(System.out::println);
		long count = users.stream().count();
		System.out.println(count);
		*/
		//map,生成新的流
		//users.stream().map(e->e.getName()).forEach(System.out::println);
		// parallel 采用多线程 效率高
		//users.parallelStream().forEach(System.out::println);
//		ArrayList<String> list=new ArrayList<>();
//		for(int i=0;i<5000000;i++) {
//			list.add(UUID.randomUUID().toString());
//		}
//		//串行：10秒  并行：7秒
//		long start=System.currentTimeMillis();
//        //long count=list.stream().sorted().count();
//        long count=list.parallelStream().sorted().count();
//        System.out.println(count);
//        long end =System.currentTimeMillis();
//        System.out.println(end-start);
		//终止操作forEach,min,max,count,reduce,collect
		//min
		//Optional<User> min = users.stream().min((o1, o2) ->o1.getSalary()-o2.getSalary());
		//System.out.println(min);
		//reduce 规约
		Optional<Integer> sum = users.stream().map(u->u.getSalary()).reduce((x,y)->x+y);
		System.out.println(sum.get());
		//collect收集
		//获取所以人的名字，封装成集合
		List<String> c = users.stream().map(u->u.getName()).collect(Collectors.toList());
		for (String string : c) {
			System.out.println(string);
		}
	}

	private static void addAll(List<User> users) {
		users.add(new User("张",1000,10));
		users.add(new User("林",5000,10));
		users.add(new User("月",7000,50));
		users.add(new User("鹤",8000,60));
		users.add(new User("猴",8000,10));
		users.add(new User("神",9000,50));
		User u = new User("火", 9999, 99);
		users.add(u);
		users.add(u);
		
	}
	
}
