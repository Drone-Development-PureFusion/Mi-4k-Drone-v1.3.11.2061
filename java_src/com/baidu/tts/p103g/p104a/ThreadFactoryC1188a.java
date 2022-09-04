package com.baidu.tts.p103g.p104a;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import java.util.concurrent.ThreadFactory;
/* renamed from: com.baidu.tts.g.a.a */
/* loaded from: classes.dex */
public class ThreadFactoryC1188a implements ThreadFactory {

    /* renamed from: a */
    private String f3008a;

    /* renamed from: b */
    private int f3009b;

    public ThreadFactoryC1188a(String str) {
        this.f3008a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        this.f3009b++;
        String str = this.f3008a + "(" + this.f3009b + ")";
        thread.setName(str);
        LoggerProxy.m36554d("NameThreadFactory", "threadName=" + str);
        return thread;
    }
}
