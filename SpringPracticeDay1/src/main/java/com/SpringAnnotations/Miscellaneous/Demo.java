package com.SpringAnnotations.Miscellaneous;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {


    public static void main(String[] args) {


        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        A obj = ctx.getBean("a",A.class);

        obj.funA();

    }


}
