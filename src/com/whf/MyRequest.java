package com.whf;

import java.io.IOException;
import java.io.InputStream;

public class MyRequest {
    private String requestMethod;
    private String requestUrl;

    public MyRequest(InputStream inputStream) throws IOException {
        byte[] bytes = new byte[1024];
        String s=null;
        if (inputStream.read(bytes)>0)
            s = new String(bytes);

        String s1 = s.split("\n")[0];
        String[] s2 = s1.split(" ");
        this.requestMethod=s2[0];
        this.requestUrl=s2[1];
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }
}
