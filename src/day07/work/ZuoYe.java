package day07.work;

import java.util.Arrays;
import java.util.Iterator;

public class ZuoYe {
	public static void main(String[] args) {
		int[] x = {6,6,6,5,6};
		//x = rollback(x);
		//System.out.println(Arrays.toString(x));
		//rollback01(x);
		//System.out.println(Arrays.toString(x));
		System.out.println("第二大值下标"+scend(x));
	}
	public static int getMin(int[] arr) {//获取最小值
		int min =arr[0];
		int minIndex=0;
		for (int i = 0; i < arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
				minIndex =i;
			}
		}
		return min;
	}
	public static int getMax(int[] arr) {//最大值及其下标
		int max = arr[0];
		int maxIndex =0;
	for (int i = 0; i < arr.length; i++) {
		if(max<arr[i]) {
			max =arr[i];
			maxIndex =i;
		}
	}
	System.out.println("最大值是"+max+"下标是"+maxIndex);
	return max;
	}
	public static int[] getAverage(int[] arr) {
		int max = getMax(arr);//平均分
		int min = getMin(arr);
		int sum = 0;
	    int[] newArr =new int [arr.length-2];
	    int newIndex =0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=max&&arr[i]!=min) {
				newArr[newIndex++]=arr[i];
				sum +=arr[i];
			}
		}
	    
		int average = sum/8;
		System.out.println("平均分为"+average);
		return newArr;
	}
	public static int[] bubble1(int[] arr) {
		//冒泡排序
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[i]>arr[i+1]) {
					int temp =arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=arr[i+1];
				}
			}
		}
		return arr;
	}
	public static int jocount(int[] arr) {
		int jcount =0;
		int ocount =0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				ocount++;
			}else {
				jcount++;
			}
		}
		System.out.println("奇数"+jcount+"个"+"偶数"+ocount+"个");
		return ocount;
	}
	public static int[] rollback(int[] arr) {//数组逆序
		int start = 0;
		int end =arr.length-1;
		while (start<end) {
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		return arr;
	}
	public static int[] rollback01(int[] arr) {//调换最大值和最小值
		int temp = arr[getMax(arr)];
		arr[getMax(arr)]=arr[getMin(arr)];
		arr[getMin(arr)]=temp;
		return arr;
	}
	public static int scend(int[] arr) {//求第二大数
		int max =getMax(arr);//调用
		int secondMax=arr[0];
		int secondIndex=0;
		for (int i = 0; i < arr.length; i++) {
				if(arr[i]!=max&&(arr[i]>secondMax||secondMax==max)) {
					secondMax=arr[i];
					secondIndex=i;
				}
			}
		
		return secondIndex;
	}
}
