//
// Created by jiangbin on 2021/4/28.
//
#include "jni.h"
#include "com_jni_test_Demo1.h"

JNIEXPORT jstring JNICALL Java_com_jni_test_Demo1_getStringPwd
        (JNIEnv * , jobject) {

}

JNIEXPORT jstring JNICALL Java_com_jni_test_Demo1_getStringPwd2
        (JNIEnv * , jclass) {}

JNIEXPORT void JNICALL Java_com_jni_test_Demo1_changeName
        (JNIEnv * env, jobject thiz) {
    // 获取class
    jclass j_cls = env->GetObjectClass(thiz);

    // 获取属性  L对象类型 都需要L
    // jfieldID GetFieldID(MainActivity.class, 属性名, 属性的签名)
    jfieldID j_fid = env->GetFieldID(j_cls, "name", "Ljava/lang/String;");

    // 转换工作
    jstring j_str = static_cast<jstring>(env->GetObjectField(thiz, j_fid));

    // 打印字符串  目标
    char *c_str = const_cast<char *>(env->GetStringUTFChars(j_str, nullptr));
    printf("native : %s\n", c_str);
    printf("native : %s\n", c_str);
    printf("native : %s\n", c_str);

    // 修改成 Beyond
    jstring jName = env->NewStringUTF("Beyond");
    env->
    SetObjectField(thiz, j_fid, jName
);

// printf()  C
// cout << << endl; // C++
}

extern "C"
JNIEXPORT void JNICALL
        Java_com_jni_test_Demo1_changeAge(JNIEnv * env, jclass jClass) {

    jfieldID j_fide = env->GetStaticFieldID(jClass,"age","I");
    jint age = env->GetStaticIntField(jClass,j_fide);
    age+=10;
    env->SetStaticIntField(jClass,j_fide,age);

}


JNIEXPORT void JNICALL Java_com_jni_test_Demo1_callAddMethod (JNIEnv *env,
                                                              jobject job) {
        //class
        jclass  mainClass = env->GetObjectClass(job);
        // GetMethodID(MainActivity.class, 方法名, 方法的签名)
        jmethodID j_mid = env->GetMethodID(mainClass, "add", "(II)I");

        // 调用 Java的方法
        jint sum = env->CallIntMethod(job, j_mid, 3, 3);
        printf("sum result:%d", sum);

}