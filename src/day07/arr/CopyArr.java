package day07.arr;

import java.util.Arrays;
import java.util.Scanner;
public class CopyArr {
	public static void main(String[] args) {
		/*int[] nums = {1,2,3};
		nums =grows(nums);
		System.out.println(Arrays.toString(nums));
	}*/
		int[] nums = {7,99,99,55,99,44};
		int index = getMax(nums);
		
		int[] arr =getAllMax(nums,index);
		System.out.print(Arrays.toString(arr));
	}
	public static int[] grows(int[] nums) {
		Scanner input =new Scanner(System.in);
		int n = input.nextInt();
		int[] newNums = new int[n];
		for (int i = 0; i < nums.length; i++) {
			newNums[i]= nums[i];
	
		}
		return newNums;
	}
	public static int getMax(int[] nums) {
		int max = nums[0];
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>max) {
				max = nums[i];
				index = i;
			}
		}
		return index;
	}
	public static int[] getAllMax(int[] nums,int index) {
		
		int[] arr = {};
		for (int i = 0; i < nums.length; i++) {
			if(nums[index]==nums[i]) {
				arr = grows(arr);
				arr[arr.length-1] = i;
			}
		}
		return arr;
		
	}
}

