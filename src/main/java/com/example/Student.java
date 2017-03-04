package com.example;

import java.util.Date;

/**
 * Created by manitkant on 08/12/16.
 */
public class Student {

    private long id;
    private String name;

    public Student(){

    }

    public Student(String name, String subject){
        this.id = (new Date()).getTime();
        this.name = name;
        this.subject = subject;
    }

    private String subject;

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    @Override
    public String toString(){
        return "Student{"+"id="+id+",name='"+name+'\''+",subject='"+subject+'\''+'}';
    }
}
