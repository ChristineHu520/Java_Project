package com.tcp.demo2_FileUpload;

import java.io.*;
import java.net.Socket;

/**
 * @author ChristineHu
 * @date 2020-08-27 8:50
 */
public class FileClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("\\src\\com\\tcp\\demo2_FileUpload\\file");
        Socket socket = new Socket("127.0.0.1",8888);
        OutputStream outputStream = socket.getOutputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fileInputStream.read(bytes))!= -1){
            outputStream.write(bytes);
        }
        InputStream inputStream = socket.getInputStream();
        while ((len = inputStream.read(bytes))!= -1){
            System.out.println(new String(bytes,0,len));
        }
        fileInputStream.close();
        socket.close();
    }
}
