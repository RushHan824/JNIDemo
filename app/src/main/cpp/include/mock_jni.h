#ifndef MOCK_JNI_H
#define MOCK_JNI_H

// JNI宏定义
#define JNIEXPORT __attribute__((visibility("default")))
#define JNICALL

// 模拟JNI类型定义
typedef void* jobject;
typedef void* jclass;
typedef void* jmethodID;
typedef void* jstring;

// 模拟JNI环境结构
struct JNIEnv {
    jstring (*NewStringUTF)(const char* str);
    jclass (*GetObjectClass)(jobject obj);
    jmethodID (*GetMethodID)(jclass clazz, const char* name, const char* sig);
    jstring (*CallObjectMethod)(jobject obj, jmethodID methodID);
    const char* (*GetStringUTFChars)(jstring str, void* isCopy);
    void (*ReleaseStringUTFChars)(jstring str, const char* chars);
};

#endif // MOCK_JNI_H