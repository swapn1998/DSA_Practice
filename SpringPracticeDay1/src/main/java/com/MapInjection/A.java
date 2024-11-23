package com.MapInjection;


import java.util.Map;

public class A {

    private Map<Student,String> map;

    public void setMap(Map<Student, String> map) {
        this.map = map;
    }

    public void show() {
        System.out.println("inside showA of C1 ");
        System.out.println(map);
    }


}
