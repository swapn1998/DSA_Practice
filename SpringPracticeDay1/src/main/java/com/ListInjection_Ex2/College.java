package com.ListInjection_Ex2;

import java.util.List;

public class College {

    List<Student>students;

    String collegeName;


    public College(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollageName() {
        return collegeName;
    }


    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }





}
