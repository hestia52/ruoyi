package com.ruoyi.web.controller.system;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class UrlTest {
    InetAddress myIPAddress = null;
    InetAddress myServer = null;

    public static void main(String [] args){
        UrlTest search = new UrlTest();
        System.out.println("本机地址:"+search.myIp());
        System.out.println("服务器地址:"+search.serviceIp());

    }
    public InetAddress myIp(){
        try {
            myIPAddress = InetAddress.getLocalHost();
        }catch (UnknownHostException e){

        }
        return myIPAddress;
    }

    public  InetAddress serviceIp(){
        try {
            myServer = InetAddress.getByName("www.baidu.com");

        }catch (UnknownHostException e){

        }
        return myServer;
    }


}
