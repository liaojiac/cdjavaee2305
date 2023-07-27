package day24.work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    private static Socket socket;

    public static void main(String[] args) {
        try {
            socket = new Socket("127.0.0.1", 7);
            Scanner input = new Scanner(System.in);

            // 开启一个线程来接收服务端的消息
            new Thread(() -> {
                try {
                    BufferedReader bis = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    String message;
                    while ((message = bis.readLine()) != null) {
                        System.out.println(message);
                    }
                } catch (IOException e) {
                    if (!socket.isClosed()) {
                        e.printStackTrace();
                        closeClient();
                    }
                }
            }).start();

            // 发送用户名
            System.out.println("请输入用户名");
            String username = input.nextLine();
            send(username);

            // 发送消息
            while (true) {
                System.out.println("请输入消息");
                String message = input.nextLine();
                send(message);
                if (message.equals("bye")) {
                    closeClient();
                    break;
                }
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void send(String data) {
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write(data);
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
            closeClient();
        }
    }

    private static void closeClient() {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}