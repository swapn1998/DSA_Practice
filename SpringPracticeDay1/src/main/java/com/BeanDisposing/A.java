package com.BeanDisposing;

public class A {


    public String message;

    public void setMessage(String msg){

        this.message = msg;

    }


    public void Destroy()
    {

        System.out.println("Bean distruction is started now.......");

    }


    public void mySetUp(){

        System.out.println("message: "+message);
        System.out.println("Inside my Set up method.........");

    }


    public void funA(){

        System.out.println("Inside funA");

    }



}
