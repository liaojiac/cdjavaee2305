package day24.chat;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(9999);
        System.out.println("创建服务器，启动监听");
        Socket socket = server.accept(); // 启动监听，accept() 方法会阻塞当前线程，直到接受到客户端的连接请求

         //读取客户端发送的欢迎信息
//        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//        String clientMsg = br.readLine();
//        System.out.println("客户端消息: " + clientMsg);

        // 发送文件给客户端
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\11.jpeg"));
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        byte[] buffer = new byte[4096];
        int bytesRead;
        while ((bytesRead = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, bytesRead);
        }
        bos.flush();
        System.out.println("文件发送完成");

        // 向客户端发送欢迎消息
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//        bw.write("欢迎你：" + socket.getInetAddress().getHostAddress());
//        bw.newLine(); // 协议
//        bw.flush();

        // 关闭流和连接
     //   br.close();
        bis.close();
        bos.close();
        socket.close();
        server.close();
    }
}