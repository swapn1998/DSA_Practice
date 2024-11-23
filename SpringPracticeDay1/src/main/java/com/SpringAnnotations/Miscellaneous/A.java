package com.SpringAnnotations.Miscellaneous;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {


    @Autowired
    private B b1;


    //main business logic
    public void funA() {
        System.out.println("inside funA of C1");
        System.out.println(b1);
    }


}
