package com.study.entity;

/**
 * This code is generated by FreeMarker
 * @author lvzb.software@qq.com
 *
 */
public class User
{
    /********** attribute ***********/
    private String name;
    
    private int age;
    
    /********** constructors ***********/
    public User() {
    
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /********** get/set ***********/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
