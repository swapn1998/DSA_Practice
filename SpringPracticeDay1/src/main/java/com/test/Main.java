package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        MyBuisnessClass bb = ctx.getBean(MyBuisnessClass.class,"test");

        bb.fun1();

    }


}
