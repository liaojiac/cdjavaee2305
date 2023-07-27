package day24.conection;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
public static void main(String[] args) throws Exception {
	System.out.println("客户端");
	Socket socket = new Socket("127.0.0.1",666);
	
}
}
