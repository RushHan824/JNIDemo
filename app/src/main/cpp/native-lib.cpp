#include <jni.h>
#include <string>


extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_jnidemo_animals_Cat_nativeEat(JNIEnv *env, jobject thiz) {
    std::string res = "Cats eat fish";
    return env ->NewStringUTF(res.c_str());
}
extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_jnidemo_animals_Cat_nativeMakeSound(JNIEnv *env, jobject thiz) {
    jclass clazz = env ->GetObjectClass(thiz);
    jmethodID methodID = env ->GetMethodID(clazz,"calledByNative","()Ljava/lang/String;");
    jstring javaResult =(jstring)env ->CallObjectMethod(thiz,methodID);
    const char *result = env ->GetStringUTFChars(javaResult,NULL);//get之后就要注意避免内存泄漏 所以要 release
    std::string res = result;
    env ->ReleaseStringUTFChars(javaResult,result);
    return env ->NewStringUTF(res.c_str());
    //1.获取类
    //2.获取方法
    //3.调用方法 储存结果

}