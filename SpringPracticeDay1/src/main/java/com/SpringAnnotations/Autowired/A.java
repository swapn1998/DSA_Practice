package com.SpringAnnotations.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class A {

    @Autowired
    @Qualifier("b2")
    private B b1;

    public void funA(){

        System.out.println("Inside function C1");
        System.out.println(b1);
    }






}
