package com.tcp.demo2_FileUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * @author ChristineHu
 * @date 2020-08-28 8:20
 */
public class FileServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        //让服务器一直处于监听状态
        while (true){
            Socket socket = serverSocket.accept();
            /*
                开启多线程，有一个客户端发送请求就开启一个线程
             */
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream inputStream = socket.getInputStream();
                        File file = new File("E:\\Users\\husj27225\\JavaProjects\\FirstJava\\src\\com\\tcp\\demo2_FileUpload\\upload");
                        if(!file.exists())
                            file.mkdirs();
                        //自定义文件名称，域名+毫秒值
                        String fileName = "itcast" + System.currentTimeMillis() + new Random().nextInt(999999) + ".txt";
                        FileOutputStream fileOutputStream = new FileOutputStream(file + "\\" + fileName);
                        byte[] bytes = new byte[1024];
                        int len = 0;
                        while ((len = inputStream.read(bytes))!=-1){
                            fileOutputStream.write(bytes,0,len);
                        }
                        OutputStream outputStream = socket.getOutputStream();
                        outputStream.write("上传成功".getBytes());
                        fileOutputStream.close();
                    }catch (IOException e){
                        System.out.println(e);
                    }finally {
                        try {
                            socket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
            //serverSocket.close();
        }
    }
}
