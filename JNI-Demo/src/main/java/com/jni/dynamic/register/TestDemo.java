package com.jni.dynamic.register;

/**
 * 作者： jiangbin
 * 主页： Github: https://github.com/kusebingtang
 * 日期： 2021年05月06日 10:13 上午
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
        System.load("/Volumes/CodeApp/SourceWork/CPlus_workspace/JNI-Demo-Lib/cmake-build-debug/dynamic_register/libdynamicRegister.dylib");
    }

    public native String stringFromJNI(); // 静态注册

    public native void staticRegister(); // 静态注册

    public native void dynamicJavaMethod01(); // 动态注册1

    public native int dynamicJavaMethod02(String valueStr); // 动态注册2

    public static void main(String[] args) {

        System.out.println("-------------------start main-------------------");

        TestDemo demo = new TestDemo();

        demo.dynamicJavaMethod01();

        System.out.println("-------------------华丽的分割线-------------------");

        demo.dynamicJavaMethod02("hello 2222");

    }


}
