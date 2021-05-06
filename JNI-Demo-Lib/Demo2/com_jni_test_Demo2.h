/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_jni_test_Demo2 */

#ifndef _Included_com_jni_test_Demo2
#define _Included_com_jni_test_Demo2
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_jni_test_Demo2
 * Method:    stringFromJNI
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_jni_test_Demo2_stringFromJNI
  (JNIEnv *, jobject);

/*
 * Class:     com_jni_test_Demo2
 * Method:    testArrayAction
 * Signature: (ILjava/lang/String;[I[Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_com_jni_test_Demo2_testArrayAction
  (JNIEnv *, jobject, jint, jstring, jintArray, jobjectArray);

/*
 * Class:     com_jni_test_Demo2
 * Method:    putObject
 * Signature: (Lcom/jni/test/Student;Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_com_jni_test_Demo2_putObject
  (JNIEnv *, jobject, jobject, jstring);

/*
 * Class:     com_jni_test_Demo2
 * Method:    insertObject
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_jni_test_Demo2_insertObject
  (JNIEnv *, jobject);

/*
 * Class:     com_jni_test_Demo2
 * Method:    testQuote
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_jni_test_Demo2_testQuote
  (JNIEnv *, jobject);

/*
 * Class:     com_jni_test_Demo2
 * Method:    delQuote
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_jni_test_Demo2_delQuote
  (JNIEnv *, jobject);

#ifdef __cplusplus
}
#endif
#endif
