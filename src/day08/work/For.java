package day08.work;
import java.util.Scanner;
public class For {
	public static void main(String[] args) {
		int[][] arr =new int[3][3];
		Scanner input = new Scanner(System.in);		
		for (int i = 0;  i< arr.length; i++) {
			System.out.println("请输入成绩");
			for (int j = 0; j < arr[i].length; j++) {
				if(i==1) {
					arr[i][j]=input.nextInt()+5;
				}else {
				arr[i][j]=input.nextInt();}
			
			}
			
		}
		for (int[] is : arr) {
			for (int is2 : is) {
				System.out.print(is2+" ");
			}
			System.out.println();
		}
}

	
}
