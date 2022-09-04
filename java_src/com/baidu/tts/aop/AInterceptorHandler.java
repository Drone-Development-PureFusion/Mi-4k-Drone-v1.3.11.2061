package com.baidu.tts.aop;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class AInterceptorHandler implements IInterceptorHandler {
    public static final Object DEFAULT = 0;
    public static final Object END = 1;

    /* renamed from: a */
    protected List<IInterceptor> f2447a;

    /* renamed from: b */
    protected Object f2448b;

    /* renamed from: c */
    protected List<String> f2449c = new ArrayList();

    /* renamed from: a */
    protected Object m36804a(Object obj, Method method, Object[] objArr) {
        Object obj2 = DEFAULT;
        int size = this.f2447a.size();
        Object obj3 = obj2;
        for (int i = 0; i < size; i++) {
            obj3 = this.f2447a.get(i).before(obj, method, objArr);
            if (obj3.equals(END)) {
                break;
            }
        }
        return obj3;
    }

    /* renamed from: a */
    protected Object m36803a(Object obj, Method method, Object[] objArr, Object obj2) {
        Object obj3 = DEFAULT;
        int size = this.f2447a.size() - 1;
        while (size >= 0) {
            Object after = this.f2447a.get(size).after(obj, method, objArr, obj2);
            size--;
            obj3 = after;
        }
        return obj3;
    }

    @Override // com.baidu.tts.aop.IInterceptorHandler
    public Object bind(Object obj, List<IInterceptor> list) {
        this.f2448b = obj;
        this.f2447a = list;
        Class<?> cls = this.f2448b.getClass();
        Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
        LoggerProxy.m36554d("AInterceptorHandler", "proxy=" + newProxyInstance);
        return newProxyInstance;
    }

    @Override // com.baidu.tts.aop.IInterceptorHandler
    public boolean canIntercept(String str) {
        return this.f2449c.contains(str);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        if (canIntercept(method.getName())) {
            if (m36804a(this.f2448b, method, objArr).equals(END)) {
                return null;
            }
            Object invoke = method.invoke(this.f2448b, objArr);
            LoggerProxy.m36554d("AInterceptorHandler", "afterResult=" + m36803a(this.f2448b, method, objArr, invoke));
            return invoke;
        }
        return method.invoke(this.f2448b, objArr);
    }

    @Override // com.baidu.tts.aop.IInterceptorHandler
    public void registerMethod(String str) {
        if (str != null) {
            this.f2449c.add(str);
        }
    }

    @Override // com.baidu.tts.aop.IInterceptorHandler
    public void unregisterMethod(String str) {
        if (str != null) {
            this.f2449c.remove(str);
        }
    }
}
