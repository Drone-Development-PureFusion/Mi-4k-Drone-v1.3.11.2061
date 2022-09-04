package com.mining.app.zxing.p257a;

import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: com.mining.app.zxing.a.d */
/* loaded from: classes2.dex */
public final class C10033d {

    /* renamed from: a */
    private static final String f30958a = C10033d.class.getSimpleName();

    /* renamed from: b */
    private static final Object f30959b = m6395c();

    /* renamed from: c */
    private static final Method f30960c = m6400a(f30959b);

    static {
        if (f30959b == null) {
            Log.v(f30958a, "This device does supports control of a flashlight");
        } else {
            Log.v(f30958a, "This device does not support control of a flashlight");
        }
    }

    private C10033d() {
    }

    /* renamed from: a */
    private static Class<?> m6399a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            return null;
        } catch (RuntimeException e2) {
            Log.w(f30958a, "Unexpected error while finding class " + str, e2);
            return null;
        }
    }

    /* renamed from: a */
    private static Object m6398a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            Log.w(f30958a, "Unexpected error while invoking " + method, e);
            return null;
        } catch (RuntimeException e2) {
            Log.w(f30958a, "Unexpected error while invoking " + method, e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.w(f30958a, "Unexpected error while invoking " + method, e3.getCause());
            return null;
        }
    }

    /* renamed from: a */
    private static Method m6401a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            return null;
        } catch (RuntimeException e2) {
            Log.w(f30958a, "Unexpected error while finding method " + str, e2);
            return null;
        }
    }

    /* renamed from: a */
    private static Method m6400a(Object obj) {
        if (obj == null) {
            return null;
        }
        return m6401a(obj.getClass(), "setFlashlightEnabled", Boolean.TYPE);
    }

    /* renamed from: a */
    public static void m6402a() {
        m6397a(true);
    }

    /* renamed from: a */
    private static void m6397a(boolean z) {
        if (f30959b != null) {
            m6398a(f30960c, f30959b, Boolean.valueOf(z));
        }
    }

    /* renamed from: b */
    public static void m6396b() {
        m6397a(false);
    }

    /* renamed from: c */
    private static Object m6395c() {
        Method m6401a;
        Object m6398a;
        Class<?> m6399a;
        Method m6401a2;
        Class<?> m6399a2 = m6399a("android.os.ServiceManager");
        if (m6399a2 == null || (m6401a = m6401a(m6399a2, "getService", String.class)) == null || (m6398a = m6398a(m6401a, (Object) null, "hardware")) == null || (m6399a = m6399a("android.os.IHardwareService$Stub")) == null || (m6401a2 = m6401a(m6399a, "asInterface", IBinder.class)) == null) {
            return null;
        }
        return m6398a(m6401a2, (Object) null, m6398a);
    }
}
