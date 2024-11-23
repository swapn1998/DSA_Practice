package com.ListInjection_Ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Demo {

    public static void main(String[] args) {

        ApplicationContext apx = new ClassPathXmlApplicationContext("applicationContext2.xml");

        College clg = apx.getBean("clg",College.class);

        List<Student> students= clg.getStudents();

        System.out.println("College Name: "+clg.getCollageName());

        System.out.println("---------------------------------------------");

        students.forEach(student -> {
            student.displayDetails();
            System.out.println("==================");
        });



    }


}
