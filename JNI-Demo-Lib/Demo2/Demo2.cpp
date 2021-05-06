//
// Created by jiangbin on 2021/4/28.
//
#include <iostream>
#include "com_jni_test_Demo2.h"

using namespace std;

JNIEXPORT void JNICALL Java_com_jni_test_Demo2_testArrayAction
        (JNIEnv *env, jobject thiz,
         jint count,
         jstring text_info,
         jintArray ints,
         jobjectArray strs) {
    // ① 基本数据类型  jint count， jstring text_info， 最简单的
    int countInt = count; // jint本质是int，所以可以用int接收

    cout << "参数一 countInt:" << countInt << endl;

    // const char* GetStringUTFChars(jstring string, jboolean* isCopy)
    const char *textInfo = env->GetStringUTFChars(text_info, NULL);
    cout << "参数二 textInfo:" << textInfo << endl;
    // 释放jstring
    env->ReleaseStringUTFChars(text_info, textInfo);

    // ② 把int[] 转成 int*
    // jint* GetIntArrayElements(jintArray array, jboolean* isCopy)
    int *jintArray = env->GetIntArrayElements(ints, NULL);

    // Java层数组的长度
    // jsize GetArrayLength(jarray array) // jintArray ints 可以放入到 jarray的参数中去
    jsize size = env->GetArrayLength(ints);

    for (int i = 0; i < size; ++i) {
        *(jintArray + i) += 100; // C++的修改，影响不了Java层
        cout << "参数三 int[]:" << *(jintArray + i) << endl;
    }
    // 目前无法控制Java的数组 变化 +100
    // 操作杆 ----> JMV
    // env->

    /**
     * 0:           刷新Java数组，并 释放C++层数组
     * JNI_COMMIT:  只提交 只刷新Java数组，不释放C++层数组
     * JNI_ABORT:   只释放C++层数组
     */
    env->ReleaseIntArrayElements(ints, jintArray, 0);

    // ③：jobjectArray 代表是Java的引用类型数组，不一样
    jsize strssize = env->GetArrayLength(strs);
    for (int i = 0; i < strssize; ++i) {

        jstring jobj = static_cast<jstring>(env->GetObjectArrayElement(strs, i));

        // 模糊：isCopy内部启动的机制
        // const char* GetStringUTFChars(jstring string, jboolean* isCopy)
        const char *jobjCharp = env->GetStringUTFChars(jobj, NULL);

        cout << "参数四 引用类型String 具体的：" << jobjCharp<<endl;

        // 释放jstring
        env->ReleaseStringUTFChars(jobj, jobjCharp);
    }


}