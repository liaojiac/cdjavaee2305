package day11.pet;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		Master m = new Master();
		System.out.println("请选择宠物:1,狗  2,企鹅");
		int index =input.nextInt();
		Pet pet =m.getPet(index);
		pet.show();
		while(true) {
			System.out.println("请选择:1,玩 2，喂 3，打");
			int choice  = input.nextInt();
			switch(choice){
			case 1:m.play(pet);
			break;
			case 2:m.feed(pet);
			break;
			case 3:m.hit(pet);
			break;
			default :System.out.println("无此选项，请重新选择");
			}
		}
				
	}
	
}
