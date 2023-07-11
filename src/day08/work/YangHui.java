package day08.work;

import java.util.Scanner;

public class YangHui {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入需要的行数");
        int l = input.nextInt();

        int[][] arr = new int[l][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
        }
        yangHuiTriangle(arr);
        printYangHuiTriangle(arr);
    }

    private static void printYangHuiTriangle(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
        	System.out.println();
        	for (int k =arr.length-1-i; k>0; k--) {
        		System.out.print(" ");//打印数字前面的空格
			}
            for (int j = 0; j < arr[i].length; j++) {//杨辉三角的行数和列数相等
            	
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private static int[][] yangHuiTriangle(int[][] arr) {
        arr[0][0] = 1;
        if (arr.length > 1) {
            arr[1][0] = 1;
            arr[1][1] = 1;
        }
        for (int i = 2; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            arr[i][0] = 1;
            arr[i][i] = 1;
            for (int j = 1; j < i; j++) {//将杨辉三角的值赋给数组
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        return arr;
    }
}

