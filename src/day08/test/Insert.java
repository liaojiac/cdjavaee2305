package day08.test;
import java.util.Scanner;
import java.util.Arrays;

public class Insert {
	public static void main(String[] args) {
		
	
	Scanner input = new Scanner(System.in);
	int[] nums = {2,4,6,7,8,9};
	int num =input.nextInt();
	int index = Arrays.binarySearch(nums, num);
	if(index<0) {
		index = -(index+1);
	}
	System.out.println("需要插入的位置是"+index);
	//扩容
	nums = Arrays.copyOf(nums, nums.length+1);
	//把插入点后面的所有数据后移一位
	for(int i=nums.length-1;i>index;i--) {
		nums[i]=nums[i-1];
	}
	//插入
	System.out.println(Arrays.toString(nums));
	nums[index]=num;
	}
}
