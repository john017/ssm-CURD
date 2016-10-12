package com.model;

public class T2Entity {
    private Integer id;

    private String string;

    public T2Entity(){}
    public T2Entity(String s){
    	this.string=s;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}