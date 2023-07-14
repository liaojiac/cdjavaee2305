package day14.cgame;
import java.util.Random;
import java.util.Scanner;
public class GuessBox{

	
	public void guess() {
		Scanner input = new Scanner(System.in);
	System.out.println("请选择:1，石头;2,剪刀;3,布");
	 int totalGames = 0;
     int wins = 0;
     int losses = 0;
     int draws = 0;
	while(true) {
		 int userchoice = input.nextInt();
		 int competer =(int)((Math.random()*3)+1);
		 //获取用户和电脑的选择
		 String userText =getChoiceText(userchoice);
		 String competerText =getChoiceText(competer);
		 System.out.println("你的选择是:"+userText+"电脑的选择是:"+competerText);
	if(userchoice==competer) {
		System.out.println("平局");
		draws++;
	}else if(userchoice==1&&competer==2||userchoice==2&&competer==3
			||userchoice==3&&competer==1) {
		System.out.println("恭喜你获得了胜利！");
		wins++;
	}else if(userchoice==1&&competer==3||userchoice==2&&competer==1
			||userchoice==3&&competer==2) {
		System.out.println("失败！");
		losses++;
	}
	totalGames++;
	System.out.println("是否继续游戏:Y/N");
	String playAgain = input.next();
	if(!playAgain.equals("Y")) {
		break;
	}
	System.out.println("游戏继续");
	}
System.out.println("一共玩了"+totalGames+"局");
System.out.println("赢了"+wins+"局");
System.out.println("输了"+losses+"局");
System.out.println("平了"+draws+"局");
	
	}
	 // 辅助方法，将数字选择转换为文本描述
    private static String getChoiceText(int choice) {
        switch (choice) {
            case 1:
                return "石头";
            case 2:
                return "剪刀";
            case 3:
                return "布";
            default:
                return "";
        }
    }
}

