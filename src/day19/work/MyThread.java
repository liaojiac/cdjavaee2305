package day19.work;

public class MyThread extends Thread{
	private int[] arr;
	private int startIndex;
	private int endIndex;
	private int result;
	@Override
	
	public void run() {
		for(int i =startIndex;i<endIndex;i++) {
			result +=arr[i];
		}
		
	}
	public MyThread(int[] arr, int startIndex, int endIndex) {
		this.arr = arr;
		this.startIndex = startIndex;
		this.endIndex = endIndex;
	}
	public int getResult() {
		return result;
	}
  
}
