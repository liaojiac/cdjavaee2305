package day14.cgame;
import java.util.Scanner;
public class People {
	private String name;
	private int score;
	
	Scanner input = new Scanner(System.in);
	
	public int renFist() {
		System.out.println("请输出你的选择1,石头 2，剪刀  3，布");
		int fist = input.nextInt();
		return fist;
		
	}
	public People(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
