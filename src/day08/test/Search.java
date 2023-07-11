package day08.test;

import java.util.Arrays;

public class Search {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,6,6,7,8,9};
		
	System.out.println(binarySearch(nums,10));
	System.out.println(Arrays.binarySearch(nums,10));
}

	private static int binarySearch(int[] nums,int n) {
		int start =0,end =nums.length-1,mid;
		while(start<=end) {
			mid = (start+end)/2;//中间下标
			if(nums[mid]==n) {
				return mid;
			}else if(nums[mid]>n) {
				end = mid-1;
			}else {
				start =mid +1;
			}  
		}
		return -1;
	}
	
}
