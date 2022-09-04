package com.baidu.tts.aop.tts;

import com.baidu.tts.aop.AInterceptor;
import com.baidu.tts.aop.AInterceptorHandler;
import com.baidu.tts.aop.ttslistener.TtsListener;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.p102f.EnumC1182n;
import com.baidu.tts.p105h.p106a.C1191c;
import com.baidu.tts.p114m.C1237h;
import com.baidu.tts.p114m.C1238i;
import com.baidu.tts.p116o.p117a.C1245c;
import com.baidu.tts.tools.ResourceTools;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class ArgsCheckInterceptor extends AInterceptor {
    /* renamed from: a */
    private Object m36801a(Object obj, C1238i c1238i, EnumC1182n enumC1182n) {
        C1237h m36148b = C1237h.m36148b(c1238i);
        m36148b.m36158a(C1191c.m36299a().m36292b(enumC1182n));
        m36802a(obj, m36148b);
        return AInterceptorHandler.END;
    }

    /* renamed from: a */
    private void m36802a(Object obj, C1237h c1237h) {
        TtsListener ttsListener = ((C1245c) obj).getTtsListener();
        if (ttsListener != null) {
            ttsListener.onError(c1237h);
        }
    }

    @Override // com.baidu.tts.aop.AInterceptor
    /* renamed from: a */
    protected Object mo36797a(Object obj, Method method, Object[] objArr) {
        C1238i c1238i = (C1238i) objArr[0];
        String m36135c = c1238i.m36135c();
        LoggerProxy.m36554d("ArgsCheckInterceptor", "text=" + m36135c);
        return ResourceTools.isTextValid(m36135c) == null ? AInterceptorHandler.DEFAULT : m36801a(obj, c1238i, EnumC1182n.TEXT_IS_TOO_LONG);
    }

    @Override // com.baidu.tts.aop.AInterceptor
    /* renamed from: a */
    protected void mo36798a() {
        this.f2446a.add("speak");
        this.f2446a.add("synthesize");
    }
}
