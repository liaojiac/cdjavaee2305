package day08.work;

import java.util.Arrays;

public class Matrix {
	public static void main(String[] args) {
		int[][] arr = {{1,3,2},
					   {4,0,1}};
		int[][]brr = {{1,3},
					  {0,1},
					  {5,2}};
		int[][] crr=matrixMultiplication(arr,brr);
		for (int i = 0; i < crr.length; i++) {
			for (int j = 0; j < crr.length; j++) {
				System.out.print(crr[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static int[][] matrixMultiplication(int[][] arr,int[][] brr) {
		int[][] crr=new int[arr.length][brr[0].length];
		for (int i = 0; i < arr.length; i++) {//遍历arr的行数
			for (int j = 0; j < brr[0].length; j++) {//遍历brr的列数
				for (int k = 0; k < arr[0].length; k++) {//a数组的列数和b数组的行数
					crr[i][j] += arr[i][k]*brr[k][j];//c数组的行数是a的行数，列数是b的列数
				}
			}
		}
		return crr;
	}
}
