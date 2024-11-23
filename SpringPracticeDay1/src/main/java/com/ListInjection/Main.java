package com.ListInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {


        ApplicationContext apx =new ClassPathXmlApplicationContext("applicationContext.xml");

        ListInjection list = apx.getBean("list",ListInjection.class);

        list.Show();

    }




}
