package com.BeanIntialization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    public static void main(String[] args) {


        ApplicationContext apx = new ClassPathXmlApplicationContext("applicationContext.xml");

        A a1 = apx.getBean("initialzie", A.class);

        a1.funA();



    }


}
