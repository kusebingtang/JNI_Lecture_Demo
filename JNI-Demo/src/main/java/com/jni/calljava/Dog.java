package com.jni.calljava;

public class Dog { // NewObject 调用我们的构造函数

    public Dog() { // <init>
        System.out.println("Dog init...");
    }

    public Dog(int n1) { // <init>
        System.out.println("Dog init... n1:" + n1);
    }

    public Dog(int n1, int n2) { // <init>
        System.out.println("Dog init... n1:" + n1 + " n2:" + n2);
    }

    public Dog(int n1, int n2, int n3) { // <init>
        System.out.println("Dog init... n1:" + n1 + " n2:" + n2 + " n3:" + n3);
    }

}
