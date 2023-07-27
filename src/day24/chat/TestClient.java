package day24.chat;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TestClient {
public static void main(String[] args) throws Exception {
	Socket socket = new Socket("localHost",9999);
//	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//	bw.write("我是丁真");
//	bw.newLine();
//	bw.flush();
	//客户端接收一个信息
	BufferedInputStream bis=new BufferedInputStream(socket.getInputStream());
	BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:/AA.jpg"));
	byte[] buffer = new byte[4096];
	int bytesRead;
	while ((bytesRead = bis.read(buffer)) != -1) {
	    bos.write(buffer, 0, bytesRead);
	}
	bos.flush();
	System.out.println("传输完成");
//	BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//	String msg = br.readLine();//读取下一行数据
//	System.out.println(msg);
//	bw.close();
	bos.close();
	bis.close();
	
	socket.close();
}
}
