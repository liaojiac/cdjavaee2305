package day06;
import java.util.Scanner;
public class WangNian {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入范围");
		int a = sc.nextInt();
		int b = sc.nextInt();
		fanWei(a,b);
		
	}
	public static boolean panDuan(int nian) {
		return (nian%4==0&&nian%100!=0||nian%400==0);
    }
	public static void fanWei(int a ,int b) {
		for(int i =a;i<=b;i++) {
			if(panDuan(i)) {
				System.out.println(i+"是闰年");
			}
		}
			
		}
	}
	

