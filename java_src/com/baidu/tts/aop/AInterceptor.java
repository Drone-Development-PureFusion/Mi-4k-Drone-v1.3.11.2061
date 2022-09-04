package com.baidu.tts.aop;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class AInterceptor implements IInterceptor {

    /* renamed from: a */
    protected List<String> f2446a = new ArrayList();

    public AInterceptor() {
        mo36798a();
    }

    /* renamed from: a */
    private boolean m36805a(String str) {
        return this.f2446a.contains(str);
    }

    /* renamed from: a */
    protected abstract Object mo36797a(Object obj, Method method, Object[] objArr);

    /* renamed from: a */
    protected abstract void mo36798a();

    @Override // com.baidu.tts.aop.IInterceptor
    public Object after(Object obj, Method method, Object[] objArr, Object obj2) {
        return AInterceptorHandler.DEFAULT;
    }

    @Override // com.baidu.tts.aop.IInterceptor
    public Object before(Object obj, Method method, Object[] objArr) {
        return m36805a(method.getName()) ? mo36797a(obj, method, objArr) : AInterceptorHandler.DEFAULT;
    }
}
