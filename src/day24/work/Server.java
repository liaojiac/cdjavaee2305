package day24.work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

public class Server {


    private List<ThreadSocket> clients = new ArrayList<>();

    public void start() {
        try {
            ServerSocket server = new ServerSocket(7);
            System.out.println("服务器启动!");
            while (true) {
                Socket socket = server.accept();
                System.out.println(socket.getInetAddress().getHostAddress() + "连接了服务器");
                ThreadSocket client = new ThreadSocket(socket);
                clients.add(client);
                new Thread(client).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class ThreadSocket implements Runnable {
        private Socket socket;
        private String name;

        public ThreadSocket(Socket socket) {
            this.socket = socket;
            this.name = read() + "[" + socket.getInetAddress().getHostAddress() + "]";
        }

        public void run() {
            send("欢迎" + name + "进入聊天室");
            try {
                while (true) {
                    String msg = read();
                    if (msg == null) {
                    	 closeClient();
                        // 处理客户端连接突然关闭的情况
                        break;
                    }
                    send(name + ":" + msg);
                    if (msg.equals("bye")) {
                        closeClient();
                        break;
                    }
                }
            } catch (Exception e) {
                // 处理客户端连接突然关闭的异常
                closeClient();
            }
        }

        public String read() {
            try {
                BufferedReader bis = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                return bis.readLine();
            } catch (Exception e) {
               System.out.println(this.name+"异常退出");
               clients.remove(this);
               
            }
            return null;
        }

        public void send(String msg) {
            for (ThreadSocket ts : clients) {
                try {
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(ts.socket.getOutputStream()));
                    bw.write(msg);
                    bw.newLine();
                    bw.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        public void closeClient() {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            clients.remove(this);
        }
    }
    public static void main(String[] args) {
        new Server().start();
    }
}