package day23.work;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Login{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        boolean isLogin = false;

        // 输入用户名和密码
        System.out.println("请输入用户名：");
        String username = input.next();
        System.out.println("请输入密码：");
        String password = input.next();

        // 读取用户信息文件
        BufferedReader br = new BufferedReader(new FileReader("e:/user.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            // 检查用户名和密码
            if (line.contains("username:" + username) && line.contains("password:" + password)) {
                isLogin = true;
                break;
            }
        }
        br.close();

        // 输出登录结果
        if (isLogin) {
            System.out.println("登录成功！");
        } else {
            System.out.println("用户名或密码错误！");
        }
    }
}
