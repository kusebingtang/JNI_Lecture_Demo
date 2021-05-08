package com.jni.calljava;

public class Student {


    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Java setName name:" + name);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Java setAge age:" + age);
        this.age = age;
    }

    public static void showInfo(String info) {
        System.out.println("showInfo info:" + info);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}