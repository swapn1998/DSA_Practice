package com.SpringAnnotaions;

import org.springframework.stereotype.Component;

@Component(value = "a1")
public class A {

    public void funA() {
        System.out.println("inside funA of A");
    }

}
