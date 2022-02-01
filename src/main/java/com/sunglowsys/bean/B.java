package com.sunglowsys.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
    private A a;

    @Autowired
    public A getA(){
        return a;
    }

    public void setA(){
        this.a = a;
    }

    public void getFromB(){
        System.out.println("from b");
        System.out.println(a);
    }

}
