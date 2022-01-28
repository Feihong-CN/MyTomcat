package com.whf;

import java.util.HashMap;

public class MyMapping {
    public static HashMap<String,String> hashMap=new HashMap<String,String>();

    static {
        hashMap.put("/mytomcat","com.whf.MyServlet");
    }

    public static HashMap<String, String> getHashMap() {
        return hashMap;
    }
}
