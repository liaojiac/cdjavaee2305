package day06;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(judgment(a)) {
			System.out.println("是素数");
		}else {
			System.out.println("不是素数");
		}
		
		for(int n=100;n<=200;n++) {
			if(judgment(n)) {
				System.out.println(n);
			}
		}
	}
	public static boolean judgment(int i) {
		for(int j=2;j<i;j++) {	
			if(i%j==0) {
				return false;	
			}
			}
			return true;
	}
}
