package com.jni.test;

/**
 * 作者： jiangbin
 * 主页： Github: https://github.com/kusebingtang
 * 日期： 2021年04月28日 4:39 下午
 * 签名： 求之于势，不责于人！
 * _              _           _     _   ____  _             _ _
 * / \   _ __   __| |_ __ ___ (_) __| | / ___|| |_ _   _  __| (_) ___
 * / _ \ | '_ \ / _` | '__/ _ \| |/ _` | \___ \| __| | | |/ _` | |/ _ \
 * / ___ \| | | | (_| | | | (_) | | (_| |  ___) | |_| |_| | (_| | | (_) |
 * /_/   \_\_| |_|\__,_|_|  \___/|_|\__,_| |____/ \__|\__,_|\__,_|_|\___/
 * <p>
 * ----------------------------------------------------------------
 */
public class Demo2 {

    static {
        System.load("/Volumes/CodeApp/SourceWork/CPlus_workspace/JNI-Demo-Lib/cmake-build-debug/Demo2/libDemo2.dylib");
    }

    /**
     * 下面是 native 区域
     */

    public native String stringFromJNI();

    public native void testArrayAction(int count, String textInfo, int[] ints, String[] strs); // String引用类型，玩数组

    public native void putObject(Student student, String str); // 传递引用类型，传递对象

    public native void insertObject(); // 凭空创建Java对象

    public native void testQuote(); // 测试引用

    public native void delQuote(); // 释放全局引用


    public static void main(String[] args) {

        Demo2 demo2 = new Demo2();

        demo2.test01();

    }

    public void test01() {
        int[] ints = new int[]{1, 2, 3, 4, 5, 6}; // 基本类型的数组

        String[] strs = new String[]{"李小龙", "李连杰", "李元霸"}; // 对象类型的数组

        testArrayAction(99, "你好", ints, strs);

        for (int anInt : ints) {
            System.out.println("Java test01: anInt:" + anInt);
        }
    }


}
