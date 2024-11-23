package com.CircularDependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

    public static void main(String[] args) {

        ApplicationContext apc =new ClassPathXmlApplicationContext("applicationContext.xml");

        A a = apc.getBean("a1",A.class);
        a.showA();

    }


}
