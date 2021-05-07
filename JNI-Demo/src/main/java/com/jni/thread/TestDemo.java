package com.jni.thread;

import java.util.concurrent.TimeUnit;

/**
 * 作者： jiangbin
 * 主页： Github: https://github.com/kusebingtang
 * 日期： 2021年05月07日 11:50 上午
 * 签名： 求之于势，不责于人！
 * _              _           _     _   ____  _             _ _
 * / \   _ __   __| |_ __ ___ (_) __| | / ___|| |_ _   _  __| (_) ___
 * / _ \ | '_ \ / _` | '__/ _ \| |/ _` | \___ \| __| | | |/ _` | |/ _ \
 * / ___ \| | | | (_| | | | (_) | | (_| |  ___) | |_| |_| | (_| | | (_) |
 * /_/   \_\_| |_|\__,_|_|  \___/|_|\__,_| |____/ \__|\__,_|\__,_|_|\___/
 * <p>
 * ----------------------------------------------------------------
 */
public class TestDemo {

    static {
        System.load("/Volumes/CodeApp/SourceWork/CPlus_workspace/JNI-Demo-Lib/cmake-build-debug/thread/libnative-lib.dylib");
    }

    public native void naitveThread(); // Java层 调用 Native层 的函数，完成JNI线程

    public native void closeThread(); // 释放全局引用


    public native void nativeFun1();

    public native void nativeFun2(); // 2

    public static native void staticFun3(); // 3

    public static native void staticFun4();

    public void updateActivityUI() {
        System.out.println("print thread name current thread name is " + Thread.currentThread().getName());
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        TestDemo testDemo = new TestDemo();


        System.out.println("-----------------------");
        testDemo.nativeFun1(); // main线程调用的
        testDemo.nativeFun2(); // main线程调用的
        staticFun3(); // main线程调用的

        // 第四个  new Thread 调用  ThreadClass == clasz 当前函数clazz地址
        new Thread() {
            @Override
            public void run() {
                super.run();
                staticFun4(); // Java的子线程调用
            }
        }.start();

    }

}
