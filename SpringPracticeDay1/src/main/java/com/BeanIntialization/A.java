package com.BeanIntialization;

public class A {


    private String message;

    public void setMessage(String message) {
        this.message = message;
    }


    public void mySetUp(){
        System.out.println("Inside MysetUp method");

        System.out.println("message : "+ message);

    }

    public void funA(){

        System.out.println("Inside funA of C1");
    }



}
