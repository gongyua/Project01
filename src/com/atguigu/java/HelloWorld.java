package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.net.HttpRetryException;
import java.util.ArrayList;
import java.util.Arrays;

//tyuikl;
public class HelloWorld {

    //prsf alt+entermodule模块依赖添加
//    private static final Customer CUST = new Customer;
    //psf
    public static final int NUM = 1;
    //psfs
    public static final String NOI = "no";
    /**
     * @param args
     * @anchor
     * @version
     * @date
     */

    //psvm
    public static void main(String[] args) {
        System.out.println("helloWorld");

        method01();
    }

    /**
     * 方法1 模板测试
     */
    public static void method01() {
        //soutm
        System.out.println("HelloWorld.method01");

        String str = "123";

        //str.soutv
        System.out.println("str = " + str);

        String[] names = new String[]{"jack", "pony"};

        //fori
        for (int i = 0; i < names.length; i++) {
            //names[i].soutv
            System.out.println("names[i] = " + names[i]);
        }

        //iter
        for (String name : names) {
            System.out.println("name = " + name);
        }

        //itar
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.println("name = " + name);
        }

        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");

        //list.for
        for (Object o : list) {

        }

        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }

        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        //ifn
        if (str == null) {

        }
        //inn
        if (list != null) {

        }

        //xx.nn
        if (list != null) {

        }

        //list.null
        if (list == null) {

        }
    }
    
    //test
    public void testfa (){
        
    }

    //pric
    /**
    * 客户id
    */
    private int id = 12;

    /**
    * 大师傅
    */
    private String adadf = "adfaf";

    public void test(){

    }

}
