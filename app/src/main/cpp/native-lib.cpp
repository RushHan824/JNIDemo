#include "include/mock_jni.h"
#include <string>

extern "C" {
    JNIEXPORT jstring JNICALL
    Java_com_example_jnidemo_animals_Cat_nativeEat(JNIEnv *env, jobject thiz) {
        std::string res = "Cats eat fish";
        return env->NewStringUTF(res.c_str());
    }

    JNIEXPORT jstring JNICALL
    Java_com_example_jnidemo_animals_Cat_nativeMakeSound(JNIEnv *env, jobject thiz) {
        jclass clazz = env->GetObjectClass(thiz);
        jmethodID methodID = env->GetMethodID(clazz,"calledByNative","()Ljava/lang/String;");
        jstring javaResult = (jstring)env->CallObjectMethod(thiz,methodID);
        const char *result = env->GetStringUTFChars(javaResult,NULL);
        std::string res = result;
        env->ReleaseStringUTFChars(javaResult,result);
        return env->NewStringUTF(res.c_str());
    }
}