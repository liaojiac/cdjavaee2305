package day07.arr;
import java.util.Iterator;
import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	/*int sum = 0;
	int average =0;
	double[] s = new double[5];
	for (int i = 0; i < s.length; i++) {
		System.out.println("请输入第"+(i+1)+"个学生成绩");
		double score = input.nextDouble();
		s[i]= score;
		sum +=s[i];
	}
	
	average =sum/s.length;
	System.out.println("平均分是"+average);
		 if(average<60) {
			 for (int i = 0; i < s.length; i++) {
				 s[i]+=5;
				 System.out.println("加分之后成绩是"+Arrays.toString(s));
			 }
		 }*/
	    int n = input.nextInt();
		int[] a= new int[]{1,3,5,7,3,8,9};
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			if(n==a[i]) {//判断n在数组内是第几位
				System.out.println("位置是"+i);	
				flag =true;
				break;
			}
			}
		if(!flag) {
			System.out.println("不在数组内");
		}
		}
}
