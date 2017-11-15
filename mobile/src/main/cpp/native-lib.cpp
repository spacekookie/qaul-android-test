#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring

JNICALL
Java_net_qaul_qaulnet_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "C++ doesn't like emoji :(";
    return env->NewStringUTF(hello.c_str());
}
