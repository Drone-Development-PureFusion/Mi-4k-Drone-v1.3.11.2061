package org.p286a.p287a.p306i.p308b;

import com.google.android.gms.appinvite.PreviewActivity;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.apache.http.HttpResponse;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p290c.p293c.AbstractC11038b;
import org.p286a.p287a.p320o.C11357d;
@AbstractC11009c
/* renamed from: org.a.a.i.b.i */
/* loaded from: classes2.dex */
class C11187i implements InvocationHandler {

    /* renamed from: a */
    private final HttpResponse f35994a;

    C11187i(HttpResponse httpResponse) {
        this.f35994a = httpResponse;
    }

    /* renamed from: a */
    public static AbstractC11038b m1764a(HttpResponse httpResponse) {
        return (AbstractC11038b) Proxy.newProxyInstance(C11187i.class.getClassLoader(), new Class[]{AbstractC11038b.class}, new C11187i(httpResponse));
    }

    /* renamed from: a */
    public void m1765a() {
        C11357d.m1303b(this.f35994a.getEntity());
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        if (method.getName().equals(PreviewActivity.f15314o)) {
            m1765a();
            return null;
        }
        try {
            return method.invoke(this.f35994a, objArr);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            throw cause;
        }
    }
}
