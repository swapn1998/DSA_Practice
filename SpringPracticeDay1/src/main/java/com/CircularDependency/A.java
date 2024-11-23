package com.CircularDependency;

public class A {

    private B b1;

    public void setB1(B b1) {
        this.b1 = b1;
    }

    public void showA(){

    System.out.println("Inside Class C1.....");

    System.out.println(b1);


}




}
