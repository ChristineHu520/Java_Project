package com.tcp.demo2_FileUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ChristineHu
 * @date 2020-08-28 8:20
 */
public class FileServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        File file = new File("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\tcp\\demo2_FileUpload\\upload");
        if(!file.exists())
            file.mkdirs();
        FileOutputStream fileOutputStream = new FileOutputStream(file + "\\file.txt");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = inputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,len);
        }
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("上传成功".getBytes());
        fileOutputStream.close();
        socket.close();
        serverSocket.close();
    }
}
