package com.BeanDisposing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    public static void main(String[] args) {


        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        A a1 = ctx.getBean("disposing",A.class);

        a1.funA();

        ClassPathXmlApplicationContext ctx2 = (ClassPathXmlApplicationContext) ctx;

        ctx2.close();


    }


}
