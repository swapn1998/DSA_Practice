package com.MapInjection;

public class Student {

    private int roll;
    private String names;

    private int marks;

    public Student(int roll, String names, int marks) {
        this.roll = roll;
        this.names = names;
        this.marks = marks;
    }

    public void display(){

        System.out.println("Roll is :"+roll);
        System.out.println("Name is :"+names);
        System.out.println("Marks is :"+marks);

    }

    @Override
    public boolean equals(Object obj) {


        Student s1 = this;
        Student s2 = (Student) obj;

        if(s1.roll==s2.roll && s1.names==s2.names && s1.marks==s2.marks)
        {
            return true;
        }

        else
            return false;

    }


    @Override
    public int hashCode() {

        return this.roll;
    }


}
