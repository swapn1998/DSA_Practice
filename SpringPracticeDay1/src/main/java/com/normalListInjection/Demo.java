package com.normalListInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    public static void main(String[] args) {

        ApplicationContext apx = new ClassPathXmlApplicationContext("applicationContext2.xml");


        list l1= apx.getBean("name",list.class);

        l1.show();


    }


}
