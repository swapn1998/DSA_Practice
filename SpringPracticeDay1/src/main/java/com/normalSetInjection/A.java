package com.normalSetInjection;

import java.util.Set;

public class A {

    private Set<String> set;

    public void setSet(Set<String> set) {
        this.set = set;
    }


    public void show(){

        System.out.println("Inside Show method");

        System.out.println(set);
    }


}
