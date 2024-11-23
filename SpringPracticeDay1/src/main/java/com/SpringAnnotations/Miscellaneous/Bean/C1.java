package com.SpringAnnotations.Miscellaneous.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class C1 {


    @Autowired
    private List<String> city;


    public void funA1() {


        System.out.println("Inside C1 class");

        System.out.println(city);


    }



}
