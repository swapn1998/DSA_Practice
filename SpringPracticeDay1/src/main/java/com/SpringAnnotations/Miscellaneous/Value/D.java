package com.SpringAnnotations.Miscellaneous.Value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class D {


    @Value("${db.driverName}")
    private String dname;
    @Value("${db.url}")
    private String url;
    @Value("${db.username}")
    private String uname;
    @Value("${db.password}")
    private String pass;
    public void funD() {
        System.out.println("inside funA of D");
        System.out.println("Driver name is "+dname);
        System.out.println("Connection URL is "+url);
        System.out.println("Username is "+uname);
        System.out.println("Password is "+pass);
    }




}
