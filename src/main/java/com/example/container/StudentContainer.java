package com.example.container;

import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@ManagedBean
@SessionScoped
public class StudentContainer implements Serializable {
    private String name;
    private int age;
    private String major;

    public StudentContainer(){
    }

    public StudentContainer(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }
}
