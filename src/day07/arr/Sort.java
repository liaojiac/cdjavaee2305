package day07.arr;

import java.util.Arrays;
import java.util.Iterator;

public class Sort {
	public static void main(String[] args) {
		int[] nums= new int[700000000];
		for(int i=0;i<nums.length;i++) {
			nums[i]=(int)(Math.random()*100+1);
	
		}
		 
		long time1 =System.currentTimeMillis();//系统当前时间
		//bubbleSort(nums);
		countingSort(nums);
		//System.out.println(Arrays.toString(nums));
		long time2 =System.currentTimeMillis();//系统当前时间
		System.out.println(time2-time1);
	}
	public static int[] bubbleSort(int[] nums) {
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = 0; j < nums.length-1-i; j++) {
				if(nums[j]>nums[j+1]) {
					int temp = nums[j+1];
					nums[j+1]=nums[j];
					nums[j]=temp;
				}
			}
		}
		return nums;
	}
	public static int[] countingSort(int [] nums) {
		int length = getMax(nums)+1;
		int[] count =new int[length];
		int index =0;
		for (int i = 0; i < nums.length; i++) {
			count[nums[i]]++;
		}
		for (int i = 0; i < count.length; i++) {
			for (int j = 0; j < count[i]; j++) {
				nums[index++]=i;
			}
		}
		return nums;
	}
	public static int getMax(int[] nums) {
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if(max<nums[i]) {
				max =nums[i];
			}
		}
		return max;
	}
	
}
