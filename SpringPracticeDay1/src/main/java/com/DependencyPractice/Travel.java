package com.DependencyPractice;

public class Travel {

    Vehicle v;// dependency

    int numberOfPerson;

    public void setNumberOfPerson(int numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }

    //    public Travel (Vehicle v)
//    {
//        this.v = v;
//    }

    public void setV(Vehicle v) {
        this.v = v;
    }

    public void journey() {

        v.go();

        System.out.println("Journey Started.....");

        System.out.println("Number Of Person : " + numberOfPerson);



    }



}
