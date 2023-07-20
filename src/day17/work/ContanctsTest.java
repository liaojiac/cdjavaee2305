package day17.work;

import java.util.Arrays;
import java.util.List;

public class ContanctsTest {

	public static void main(String[] args) {
		//解释一下这个添加和删除为啥报错？
		String[] strs = {"aaa","bbb","ccc"};
		List<String> list = Arrays.asList(strs);
		System.out.println(list);
		//list.add("ddd");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		list.remove(0);
	}
}
