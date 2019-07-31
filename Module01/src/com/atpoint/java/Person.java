package com.atpoint.java;

/**
 * @author hfm
 * @create 2019-07-29 上午 9:34
 */
public class Person {
    private int age=20;
    private String name="张飞";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String eat(){
        String str="吃饭";
        return str;
    }

    public String run(){
        String str="跑步";
        return str;
    }
}
