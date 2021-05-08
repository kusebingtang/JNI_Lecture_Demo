package com.jni.calljava;

/**
 * 作者： jiangbin
 * 主页： Github: https://github.com/kusebingtang
 * 日期： 2021年05月08日 10:11 上午
 * 签名： 求之于势，不责于人！
 * _              _           _     _   ____  _             _ _
 * / \   _ __   __| |_ __ ___ (_) __| | / ___|| |_ _   _  __| (_) ___
 * / _ \ | '_ \ / _` | '__/ _ \| |/ _` | \___ \| __| | | |/ _` | |/ _ \
 * / ___ \| | | | (_| | | | (_) | | (_| |  ___) | |_| |_| | (_| | | (_) |
 * /_/   \_\_| |_|\__,_|_|  \___/|_|\__,_| |____/ \__|\__,_|\__,_|_|\___/
 * <p>
 * ----------------------------------------------------------------
 */
public class TestCallJavaObject {

    static {
        System.load("/Volumes/CodeApp/SourceWork/CPlus_workspace/JNI-Demo-Lib/cmake-build-debug/calljava/libcalljava-lib.dylib");
    }

    public native void putString(String hello); // 传递String对象

    public native void putObject(Student student); // 传递引用类型，传递对象

    public native void insertObject(); // 凭空创建Java对象

    public native void testQuote(); // 测试引用
    public native void delQuote(); // 释放全局引用


    public static void main(String[] args) {

        TestCallJavaObject testCallJavaObject = new TestCallJavaObject();
//        Student student = new Student();
//
//        testCallJavaObject.putObject(student);

        testCallJavaObject.testQuote();
        testCallJavaObject.delQuote();

    }
}
