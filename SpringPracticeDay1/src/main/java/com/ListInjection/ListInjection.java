package com.ListInjection;

import java.util.List;

public class ListInjection {

private List<String> names;

public void setNames(List<String> names)
{
    this.names=names;
}

public void Show()
{

    System.out.println("inside showA of List Injection");

    System.out.println(names);
}


    public static void main(String[] args) {



    }



}
