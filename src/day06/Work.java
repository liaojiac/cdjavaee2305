package day06;
import java.util.Scanner;
public class Work {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入a的值");
		int a = sc.nextInt();
		
		chengFa(a);
	}
	public static void chengFa(int a) {
		for(int i=1;i<=a;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
			System.out.println();
		}
	}
}
