package com.goodsave.basic.other;

import java.net.InetAddress;

/**
 * HostAddress
 * Created by Joker on 2017/7/20.
 */
public class HostAddress {

    public static void main(String args[]) throws  Exception{
        System.out.println(InetAddress.getLocalHost().getHostAddress());
    }
}
