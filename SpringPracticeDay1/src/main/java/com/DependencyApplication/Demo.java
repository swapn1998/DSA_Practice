package com.DependencyApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    public static void main(String[] args) {


        ApplicationContext apx = new ClassPathXmlApplicationContext("applicationContext.xml");

        PresentationBean presentationBean =apx.getBean("presentation",PresentationBean.class);

        presentationBean.present();
    }


}
