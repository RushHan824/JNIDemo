cmake_minimum_required(VERSION 3.22.1)
project("jnidemo")

#创建测试可执行文件
add_executable(jnidemo_test
    tests/test_main.cpp
        native-lib.cpp
)

# 启用测试
enable_testing()
add_test(NAME JNITest COMMAND jnidemo_test)