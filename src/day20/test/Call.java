package day20.test;

import java.util.concurrent.Callable;

public class Call implements Callable<Integer>{
	private int[] arr;

	
	public int[] getArr() {
		return arr;
	}


	public Call(int[] arr) {
		this.arr = arr;
	}




	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
}
