package day10.game;
import java.util.*;
public class GameTest {
	public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.println("请创建人物一");
	String name1 =input.next();
	System.out.println("请创建人物二");
	String name2 =input.next();
	Role r1 =new Role(name1,100,"男");
	Role r2 =new Role(name2,100,"男");
	//展示角色信息
	r1.showRoleInfo();
	r2.showRoleInfo();
	while(true) {
		//r1开始攻击r2;
		r1.attack(r2);
		//判断r2的剩余血量
		if(r2.getBlood()==0) {
			System.out.println(r1.getName()+"击败了"+r2.getName());
			break;
		}
		r2.attack(r1);
		if(r1.getBlood()==0) {
			System.out.println(r2.getName()+"击败了"+r1.getName());
			break;
		}
	}
}
}
