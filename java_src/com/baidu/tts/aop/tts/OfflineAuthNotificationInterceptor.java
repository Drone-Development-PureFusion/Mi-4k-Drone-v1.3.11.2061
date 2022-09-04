package com.baidu.tts.aop.tts;

import com.baidu.tts.aop.AInterceptor;
import com.baidu.tts.aop.AInterceptorHandler;
import com.baidu.tts.auth.C1062a;
import com.baidu.tts.auth.C1068b;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.p102f.EnumC1181m;
import com.baidu.tts.p114m.C1238i;
import com.baidu.tts.p114m.C1239j;
import com.baidu.tts.p116o.p117a.C1245c;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class OfflineAuthNotificationInterceptor extends AInterceptor {

    /* renamed from: b */
    private AtomicInteger f2450b = new AtomicInteger(-1);

    /* renamed from: a */
    private Object m36799a(C1245c c1245c, C1239j c1239j, C1238i c1238i) {
        m36800a(C1062a.m36796a().m36794a(c1239j.m36123d()), c1238i);
        return AInterceptorHandler.DEFAULT;
    }

    /* renamed from: a */
    private void m36800a(C1068b.C1069a c1069a, C1238i c1238i) {
        if (c1069a.m36769d()) {
            c1238i.m36138a(String.format(Locale.US, "百度语音试用服务%d天后到期，", Integer.valueOf(c1069a.m36776a())));
        }
        if (c1069a.m36767f()) {
            c1238i.m36138a("百度语音试用服务已经到期，请及时更新授权，");
        }
        c1238i.m36140a();
    }

    @Override // com.baidu.tts.aop.AInterceptor
    /* renamed from: a */
    protected Object mo36797a(Object obj, Method method, Object[] objArr) {
        C1245c c1245c = (C1245c) obj;
        if (!c1245c.m36092q()) {
            c1245c.m36093p();
            return AInterceptorHandler.END;
        }
        EnumC1181m mode = c1245c.getMode();
        if (mode == null) {
            c1245c.m36093p();
            return AInterceptorHandler.END;
        }
        switch (mode) {
            case MIX:
            case OFFLINE:
                int incrementAndGet = this.f2450b.incrementAndGet();
                LoggerProxy.m36554d("OfflineAuthNotificationInterceptor", "currentCount=" + incrementAndGet);
                if (incrementAndGet % 20 == 0) {
                    C1238i c1238i = (C1238i) objArr[0];
                    C1239j ttsParams = c1245c.getTtsParams();
                    if (ttsParams != null) {
                        return m36799a(c1245c, ttsParams, c1238i);
                    }
                    c1245c.m36093p();
                    return AInterceptorHandler.END;
                }
                break;
        }
        return AInterceptorHandler.DEFAULT;
    }

    @Override // com.baidu.tts.aop.AInterceptor
    /* renamed from: a */
    protected void mo36798a() {
        this.f2446a.add("speak");
    }
}
