package com.InbuiltProperties;

import java.util.Properties;

public class A {


    private Properties theProperties;

    public void setTheProperties(Properties theProperties) {
        this.theProperties = theProperties;
    }


    public void show(){

        System.out.println("Inside C1");

        System.out.println(theProperties);
    }
}
