package day09.antforaging;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入食物尺寸");
		int s = input.nextInt();
		Ant a = new Ant("子弹蚁",20);
		Food f =new Food("蛋糕",s);
		a.findfood(f);

		a.summon(f);
	}

	
}
