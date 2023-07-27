package day24.conection;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
public static void main(String[] args) throws Exception {
	ServerSocket server= new ServerSocket(666);
	System.out.println("创建服务器，启动监听");
	while(true) {
		Socket socket = server.accept();//启动监听
		InetAddress ia = socket.getInetAddress();
		System.out.println(ia.getAddress()+"连上了服务器");
	}
}
}
