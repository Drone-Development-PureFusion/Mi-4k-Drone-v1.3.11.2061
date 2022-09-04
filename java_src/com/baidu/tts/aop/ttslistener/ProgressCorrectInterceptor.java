package com.baidu.tts.aop.ttslistener;

import android.text.TextUtils;
import com.baidu.tts.aop.AInterceptor;
import com.baidu.tts.aop.AInterceptorHandler;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.p114m.C1237h;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class ProgressCorrectInterceptor extends AInterceptor {
    @Override // com.baidu.tts.aop.AInterceptor
    /* renamed from: a */
    protected Object mo36797a(Object obj, Method method, Object[] objArr) {
        C1237h c1237h = (C1237h) objArr[0];
        if (c1237h != null) {
            String m36137b = c1237h.m36143e().m36137b();
            if (!TextUtils.isEmpty(m36137b)) {
                int length = m36137b.length();
                int m36147c = c1237h.m36147c();
                int i = m36147c > length ? m36147c - length : 0;
                LoggerProxy.m36554d("ProgressCorrectInterceptor", "prefixLength=" + length + "--progress=" + m36147c);
                C1237h A = c1237h.A();
                A.m36146c(i);
                objArr[0] = A;
            }
        }
        return AInterceptorHandler.DEFAULT;
    }

    @Override // com.baidu.tts.aop.AInterceptor
    /* renamed from: a */
    protected void mo36798a() {
        this.f2446a.add("onSynthesizeDataArrived");
        this.f2446a.add("onPlayProgressUpdate");
    }
}
