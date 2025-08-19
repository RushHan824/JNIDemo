#include <iostream>
#include "../include/mock_jni.h"

// 声明外部函数（这些函数在native-lib.cpp中定义）
extern "C" {
    JNIEXPORT jstring JNICALL
    Java_com_example_jnidemo_animals_Cat_nativeEat(JNIEnv *env, jobject thiz);

    JNIEXPORT jstring JNICALL
    Java_com_example_jnidemo_animals_Cat_nativeMakeSound(JNIEnv *env, jobject thiz);
}

int main() {
    std::cout << "JNI测试开始..." << std::endl;

    // 简单测试：检查函数是否存在
    std::cout << "nativeEat函数地址: " << (void*)Java_com_example_jnidemo_animals_Cat_nativeEat << std::endl;
    std::cout << "nativeMakeSound函数地址: " << (void*)Java_com_example_jnidemo_animals_Cat_nativeMakeSound << std::endl;

    std::cout << "测试完成！" << std::endl;
    return 0;
}