#include <jni.h>
#include <cstring>
#include <string>

jstring stoJstring( JNIEnv* env, const char* pat )
{
//����java String�� strClass
jclass strClass = (env)->FindClass("Ljava/lang/String;");
//��ȡjava String�෽��String(byte[],String)�Ĺ�����,���ڽ�����byte[]����ת��Ϊһ����String
jmethodID ctorID = (env)->GetMethodID(strClass, "<init>", "([BLjava/lang/String;)V");

jbyteArray bytes = (env)->NewByteArray(strlen(pat));//����byte����
(env)->SetByteArrayRegion(bytes, 0, strlen(pat), (jbyte*)pat);//��char* ת��Ϊbyte����

jstring encoding = (env)->NewStringUTF("GB2312"); // ����String, ������������,����byte����ת����Stringʱ�Ĳ���
return (jstring)(env)->NewObject(strClass, ctorID, bytes, encoding);//��byte����ת��Ϊjava String,�����
}

std::string   jstringTostring(JNIEnv*   env,   jstring   jstr)  
{  
   char*   rtn   =   NULL;  
   jclass   clsstring   =   env->FindClass("java/lang/String");   
   jstring   strencode   =   env->NewStringUTF("GB2312");  
   jmethodID   mid   =   env->GetMethodID(clsstring,   "getBytes",   "(Ljava/lang/String;)[B");   
   jbyteArray   barr=   (jbyteArray)env->CallObjectMethod(jstr,mid,strencode);  
   jsize   alen   =   env->GetArrayLength(barr);  
   jbyte*   ba   =   env->GetByteArrayElements(barr,JNI_FALSE);  
   if(alen   >   0)  
   {  
    rtn   =   (char*)malloc(alen+1);         //new   char[alen+1];  
    memcpy(rtn,ba,alen);  
    rtn[alen]=0;  
   }  
   env->ReleaseByteArrayElements(barr,ba,0);  
   std::string stemp(rtn);
   free(rtn);
   return   stemp;  
}  