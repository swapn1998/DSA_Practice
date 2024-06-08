package com.SpringAnnotaions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    public static void main(String[] args) {


        ApplicationContext apx = new ClassPathXmlApplicationContext("applicationContext4.xml");

        A a = apx.getBean("a1",A.class);
        a.funA();

    }


}
