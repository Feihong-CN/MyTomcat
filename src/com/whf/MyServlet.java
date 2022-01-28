package com.whf;

import java.io.IOException;

public class MyServlet extends MyHttpServlet{
    @Override
    public void doGet(MyRequest myRequest, MyResponse myResponse) throws IOException {
        myResponse.write("nihao");
    }

    @Override
    public void doPost(MyRequest myRequest, MyResponse myResponse) throws IOException {
        myResponse.write("nihao");
    }
}
