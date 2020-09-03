package com.tcp.demo3_BSTCP;

import javax.xml.soap.SOAPConnection;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ChristineHu
 * @date 2020-09-03 8:25
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        //获取网络自己输入流
        InputStream inputStream = socket.getInputStream();
        //把网络字节输入流对象转换成字符缓冲输入流对象
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        //读取第一行
        String line = bufferedReader.readLine();
        //去掉路径前面的空格
        String[] array = line.split(" ");
        //去掉路径前面的/
        String htmlpath = array[1].substring(1);
        FileInputStream fileInputStream = new FileInputStream(htmlpath);
        OutputStream outputStream = socket.getOutputStream();
        //http响应头的固定写法
        outputStream.write("HTTP/1.1 200 OK\r\n".getBytes());
        outputStream.write("Content-type:text/html\r\n".getBytes());
        //必须写入空行，否则不解析
        outputStream.write("\r\n".getBytes());

        //一读一些复制文件
        int len ;
        byte[] bytes = new byte[1024];
        while ((len = fileInputStream.read(bytes)) != -1){
            outputStream.write(bytes,0,len);
        }
        fileInputStream.close();
        socket.close();
        serverSocket.close();
    }
}
