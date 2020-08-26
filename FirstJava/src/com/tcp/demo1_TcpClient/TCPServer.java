package com.tcp.demo1_TcpClient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ChristineHu
 * @date 2020-08-26 8:43
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("服务器收到！".getBytes());
        socket.close();
        serverSocket.close();
    }
}
