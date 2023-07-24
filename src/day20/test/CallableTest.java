package day20.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
	int length = 10000;
	int count = 4;
	int[] arr = new int[length];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=i+1;
	}
	List<FutureTask<Integer> > li = new ArrayList<>();
	for (int i = 0; i < count; i++) {
		int[] sub = new int[length/count];
		for (int j = 0; j < sub.length; j++) {
			sub[j]=arr[j+i*length/count];
		}
		Call ct = new Call(sub);
		FutureTask<Integer> ft = new FutureTask<>(ct);
		Thread t = new Thread(ft);
		t.start();
		li.add(ft);
	}
	int sum = 0;
	for (int i = 0; i < li.size(); i++) {
		sum += li.get(i).get();
	}
	System.out.println(sum);
}
}
