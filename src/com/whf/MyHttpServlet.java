package com.whf;

import java.io.IOException;

public abstract class MyHttpServlet {
    public static final String METHOD_GET="GET";
    public static final String METHOD_POST="POST";

    public abstract void doGet(MyRequest myRequest,MyResponse myResponse) throws IOException;
    public abstract void doPost(MyRequest myRequest,MyResponse myResponse) throws IOException;

    public void service(MyRequest myRequest,MyResponse myResponse) throws IOException {
        if (myRequest.getRequestMethod().equals(METHOD_GET))
            doGet(myRequest,myResponse);
        else if(myRequest.getRequestMethod().equals(METHOD_POST))
            doPost(myRequest,myResponse);
    }
}
