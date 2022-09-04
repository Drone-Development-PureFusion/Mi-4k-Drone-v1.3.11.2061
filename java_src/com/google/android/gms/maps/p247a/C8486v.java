package com.google.android.gms.maps.p247a;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C4516c;
import com.google.android.gms.common.C4536e;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.maps.model.C8618j;
import com.google.android.gms.maps.p247a.AbstractC8490x;
import com.google.android.gms.p232c.BinderC4173f;
/* renamed from: com.google.android.gms.maps.a.v */
/* loaded from: classes2.dex */
public class C8486v {

    /* renamed from: a */
    private static Context f27350a;

    /* renamed from: b */
    private static AbstractC8490x f27351b;

    /* renamed from: a */
    public static AbstractC8490x m11645a(Context context) {
        C4588d.m23627a(context);
        if (f27351b != null) {
            return f27351b;
        }
        m11641b(context);
        f27351b = m11640c(context);
        try {
            f27351b.mo11634a(BinderC4173f.m25293a(m11639d(context).getResources()), C4536e.f16917b);
            return f27351b;
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    private static <T> T m11644a(Class<?> cls) {
        try {
            return (T) cls.newInstance();
        } catch (IllegalAccessException e) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf.length() != 0 ? "Unable to call the default constructor of ".concat(valueOf) : new String("Unable to call the default constructor of "));
        } catch (InstantiationException e2) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf2.length() != 0 ? "Unable to instantiate the dynamic class ".concat(valueOf2) : new String("Unable to instantiate the dynamic class "));
        }
    }

    /* renamed from: a */
    private static <T> T m11643a(ClassLoader classLoader, String str) {
        try {
            return (T) m11644a(((ClassLoader) C4588d.m23627a(classLoader)).loadClass(str));
        } catch (ClassNotFoundException e) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Unable to find dynamic class ".concat(valueOf) : new String("Unable to find dynamic class "));
        }
    }

    /* renamed from: a */
    public static boolean m11646a() {
        return false;
    }

    /* renamed from: b */
    private static Class<?> m11642b() {
        try {
            return Class.forName("com.google.android.gms.maps.internal.CreatorImpl");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static void m11641b(Context context) {
        int m23815a = C4536e.m23815a(context);
        switch (m23815a) {
            case 0:
                return;
            default:
                throw new C4516c(m23815a);
        }
    }

    /* renamed from: c */
    private static AbstractC8490x m11640c(Context context) {
        if (m11646a()) {
            Log.i(C8486v.class.getSimpleName(), "Making Creator statically");
            return (AbstractC8490x) m11644a(m11642b());
        }
        Log.i(C8486v.class.getSimpleName(), "Making Creator dynamically");
        return AbstractC8490x.AbstractBinderC8491a.m11637a((IBinder) m11643a(m11639d(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
    }

    /* renamed from: d */
    private static Context m11639d(Context context) {
        if (f27350a == null) {
            if (m11646a()) {
                f27350a = context.getApplicationContext();
            } else {
                f27350a = C4536e.m23804d(context);
            }
        }
        return f27350a;
    }
}
