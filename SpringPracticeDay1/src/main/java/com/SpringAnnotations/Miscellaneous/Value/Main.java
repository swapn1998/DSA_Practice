package com.SpringAnnotations.Miscellaneous.Value;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


    public static void main(String[] args) {


        ApplicationContext apx = new AnnotationConfigApplicationContext(AppConfig.class);
        D d1=apx.getBean("d",D.class);
        d1.funD();
    }
}
