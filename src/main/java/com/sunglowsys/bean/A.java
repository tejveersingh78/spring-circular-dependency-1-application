package com.sunglowsys.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
    private B b;

    @Autowired
    public A(B b){
        this.b = b;
    }

    public void getFromA(){
        System.out.println("from A");
        System.out.println(b);
    }

}
