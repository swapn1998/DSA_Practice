package com.normalSetInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    public static void main(String[] args) {

        ApplicationContext apx = new ClassPathXmlApplicationContext("applicationContext2.xml");

        A a1= apx.getBean("set1",A.class);

        a1.show();

    }


}
