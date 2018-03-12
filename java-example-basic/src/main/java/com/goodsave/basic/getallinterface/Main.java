package com.goodsave.basic.getallinterface;

import java.util.List;

/**
 * Main
 * Created by Joker on 2017/7/27.
 */
public class Main {

    public static void main(String args[]) throws Exception{

        List<Class<?>> allInterface =  ClassUtil.getAllSubClassByParentClass(AAA.class);
        allInterface.forEach(current->System.out.println(current.getName()));

    }





}
