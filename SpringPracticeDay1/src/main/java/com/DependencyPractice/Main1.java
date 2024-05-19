package com.DependencyPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {

    public static void main(String[] args) {

        ApplicationContext btx =new ClassPathXmlApplicationContext("applcationContext.xml");

        Travel tr = btx.getBean(Travel.class,"travel");

        tr.journey();


    }

}
