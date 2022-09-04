package com.baidu.tts.aop.tts;

import com.baidu.tts.aop.AInterceptor;
import com.baidu.tts.aop.AInterceptorHandler;
import com.baidu.tts.aop.ttslistener.TtsListener;
import com.baidu.tts.aop.ttslistener.TtsListenerFactory;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class CallbackInterceptor extends AInterceptor {
    @Override // com.baidu.tts.aop.AInterceptor
    /* renamed from: a */
    protected Object mo36797a(Object obj, Method method, Object[] objArr) {
        LoggerProxy.m36554d("CallbackInterceptor", "method=" + method.getName());
        objArr[0] = new TtsListenerFactory((TtsListener) objArr[0]).makeProxy();
        return AInterceptorHandler.DEFAULT;
    }

    @Override // com.baidu.tts.aop.AInterceptor
    /* renamed from: a */
    protected void mo36798a() {
        this.f2446a.add("setTtsListener");
    }
}
