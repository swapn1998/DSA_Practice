package com.SpringAnnotations.Miscellaneous.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.SpringAnnotations.Miscellaneous")
public class AppConfig_Bean {


    @Bean("cityList")
    public List<String> getCity(){

        List<String> list = new ArrayList<>();
        list.add("Punjab");
        list.add("Beed");
        list.add("Pune");

        return list;
    }


}
