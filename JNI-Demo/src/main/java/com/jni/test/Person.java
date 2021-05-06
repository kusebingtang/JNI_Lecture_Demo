package com.jni.test;

public class Person {

    private static final String TAG = Person.class.getSimpleName();

    public Student student;

    public void setStudent(Student student) {
        System.out.println("call setStudent student:" + student.toString());
        this.student = student;
    }

    public static void putStudent(Student student) {
        System.out.println("call static putStudent student:" + student.toString());
    }
}
