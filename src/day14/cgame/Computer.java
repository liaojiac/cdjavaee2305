package day14.cgame;
import java.util.Random;
public class Computer {
	private String name;
	private int score;
	
	public int showFist() {
		
		return new Random().nextInt(3)+1;//返回电脑的随机选择1-3；
		
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

	public Computer(String name) {
		super();
		this.name = name;
	}
	
	
}
