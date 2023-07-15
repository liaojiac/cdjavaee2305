package day14.test;
import java.util.Arrays;
//从控制台录入一个字符串，判断字符'a'在该字符串中出现的次数还要记录位置
import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符串");
        String sr = input.nextLine();
        
        int count = 0;
        /*while (true) {
            index = sr.indexOf("a", index + 1);
            if (index != -1) {
                count++;
                System.out.println("字符 'a' 在位置：" + index);
            } else {
                break;
            }
        }
        System.out.println("字符 'a' 出现的次数：" + count);*/
        int[] indexs =getPosition(sr,"ab");//定义一个数组存储ab出现的位置
        System.out.println("字符ab,出现在"+Arrays.toString(indexs));
        
    }

	private static int[] getPosition(String sr, String sub) {
		int index = -1;
		int[] indexs = {};
		while((index=sr.indexOf(sub,index+1))!=-1) {
			indexs= Arrays.copyOf(indexs, indexs.length+1);//找到一次，就把数组的长度+1;
			indexs[indexs.length-1]=index;
		}
		return indexs;
	}
}
