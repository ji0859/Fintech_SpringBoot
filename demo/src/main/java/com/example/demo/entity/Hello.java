package com.example.demo.entity;

import lombok.Data;
import lombok.NonNull;


public class Hello {
    String name;
    public Hello(){

    }
    public Hello(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public boolean equals(Object o){

    }
}
