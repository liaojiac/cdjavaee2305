package day23.work;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Register {
public static void main(String[] args) throws Exception {
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("e:/user.txt",true)));
	Scanner input = new Scanner(System.in);
	while(true) {
		//录入信息
		String line ="{";
		System.out.println("请输入用户名");
		String name = input.next();
		line+="username:"+name+",";
		System.out.println("请输入密码");
		String password = input.next();
		line+="password:"+password+"}";
		bw.write(line);
		bw.newLine();
		bw.flush();
		System.out.println("是否继续？y/n");
		if(input.next().charAt(0)=='n') {
			break;
		}
	}
	bw.close();
	
}
}
