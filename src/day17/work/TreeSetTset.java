package day17.work;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTset {
public static void main(String[] args) {
	TreeSet<Worker> tree01 = new TreeSet<Worker>(new Comparator<Worker>() {

		@Override
		public int compare(Worker o1, Worker o2) {
			if(o1.getAge()!=o2.getAge()) {
				return o1.getAge()-o2.getAge();
			}else if (o1.getWorkerAge()!=o2.getWorkerAge()) {
				return o2.getWorkerAge()-o1.getWorkerAge();
			}else if(o1.getSalary()!=o2.getSalary()) {
				return o2.getSalary()-o1.getSalary();
			}
			return o1.hashCode()-o2.hashCode();
		}
	});
	tree01.add(new Worker("张三",19,20,9000));
	tree01.add(new Worker("李斯",33,10,1000));
	tree01.add(new Worker("李氏",19,20,10000));
	tree01.add(new Worker("安安非",33,20,9000));
	System.out.println(tree01);
}
}
