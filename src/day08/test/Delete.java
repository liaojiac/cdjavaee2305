package day08.test;
import java.util.Arrays;
import java.util.Scanner;
public class Delete {
	public static void main(String[] args) {
		int [] nums= {1,2,5,8,9,10,11,12};
		Scanner input =new Scanner(System.in);
		System.out.println("请输入需要删除的数");
		int num =input.nextInt();
		int index =Arrays.binarySearch(nums, num);
		
		System.out.println(Arrays.toString(deleteArr(nums,index)));
	}
	public static int[] deleteArr(int[] nums,int index) {
		
		if(index>=0){
			for (int i = index; i < nums.length-1; i++) {
				nums[i]=nums[i+1];//将需要删除的数覆盖掉
			}
			nums[nums.length-1]=0;
			nums=Arrays.copyOf(nums, nums.length-1);//将数组的长度减一
		}
		return nums;
	}
}
