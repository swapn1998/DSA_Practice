package com.SpringAnnotations.Miscellaneous.Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {


    public static void main(String[] args) {

        ApplicationContext apx = new AnnotationConfigApplicationContext(AppConfig_Bean.class);

        C1 obj1 = apx.getBean("c1", C1.class);
        obj1.funA1();









    }


}
