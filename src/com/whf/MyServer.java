package com.whf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void startServer(int port) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        ServerSocket serverSocket = new ServerSocket(port);
        Socket socket=null;
        while (true){
            socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            MyRequest myRequest = new MyRequest(inputStream);
            MyResponse myResponse = new MyResponse(outputStream);

            String s = new MyMapping().getHashMap().get(myRequest.getRequestUrl());
            if (s!=null){
                Class<MyServlet> myServletClass=(Class<MyServlet>) Class.forName(s);
                MyServlet myServlet = myServletClass.newInstance();
                myServlet.service(myRequest,myResponse);
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        startServer(10086);
    }
}
