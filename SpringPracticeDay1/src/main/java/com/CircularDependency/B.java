package com.CircularDependency;

public class B {

    private A a1;

    public B(A a1){

        this.a1=a1;

    }

    public void ShowB(){

        System.out.println("Inside class of B");

        System.out.println(a1);

    }

}
