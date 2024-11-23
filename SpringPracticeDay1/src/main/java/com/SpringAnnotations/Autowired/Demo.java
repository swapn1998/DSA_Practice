package com.SpringAnnotations.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    public static void main(String[] args) {

        ApplicationContext apx = new ClassPathXmlApplicationContext("applicationContext4.xml");

        A a1 = apx.getBean("a",A.class);

        a1.funA();

    }


}
