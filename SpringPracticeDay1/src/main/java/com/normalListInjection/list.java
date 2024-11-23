package com.normalListInjection;

import java.util.List;

public class list {

    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void show() {

        System.out.println("inside showA of C1 ");

        System.out.println(list);
    }

    public static void main(String[] args) {

    }

}
