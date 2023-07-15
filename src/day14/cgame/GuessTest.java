package day14.cgame;
import java.util.Scanner;
public class GuessTest {
	People p = new People("张三");
	Computer c = new Computer("IBM5100");
	public void start() {
		System.out.println(p.getName()+"VS!!!!"+c.getName());
		play();
	}
	private void play() {
		int totalGames = 0;
	     int draws=0;
	    Scanner input = new Scanner(System.in);
	    String[] str = {"石头","剪刀","布"};
		while(true) {
			 
			 //获取用户和电脑的选择
			 int userchoice = p.renFist();
			 int comchoice =c.showFist();
			 
			 System.out.println(p.getName()+"的选择是:"+str[userchoice-1]+"\t"+c.getName()+"的选择是:"+str[comchoice-1]);
		if(userchoice==comchoice) {
			System.out.println("平局");
			draws++;
		}else if(userchoice==1&&comchoice==2||userchoice==2&&comchoice==3
				||userchoice==3&&comchoice==1) {
			System.out.println("恭喜"+p.getName()+"获得了胜利！");
			p.setScore(p.getScore()+1);
		}else if(userchoice==1&&comchoice==3||userchoice==2&&comchoice==1
				||userchoice==3&&comchoice==2) {
			System.out.println(p.getName()+"失败！"+","+c.getName()+"获胜");
			c.setScore(c.getScore()+1);
		}
		totalGames++;
		System.out.println("是否继续游戏:Y/N");
		String playAgain = input.next();
		if(!playAgain.equals("Y")) {
			break;
		}
		System.out.println("游戏继续");
		}
	System.out.println(p.getName()+"一共玩了"+totalGames+"局");
	System.out.println("赢了"+p.getScore()+"局");
	System.out.println("输了"+c.getScore()+"局");
	System.out.println("平了"+draws+"局");
		
		
	}
	public static void main(String[] args) {
		
		new GuessTest().start();
		
		
	}
	
}
