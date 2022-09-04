package com.google.firebase.appindexing;

import com.google.android.gms.p239g.AbstractC5285f;
import com.google.firebase.C9751b;
import com.google.firebase.appindexing.internal.C9687c;
import java.lang.ref.WeakReference;
/* renamed from: com.google.firebase.appindexing.b */
/* loaded from: classes2.dex */
public abstract class AbstractC9675b {

    /* renamed from: a */
    public static final String f30272a = "com.google.firebase.appindexing.UPDATE_INDEX";

    /* renamed from: b */
    public static final String f30273b = "FirebaseAppIndex";

    /* renamed from: c */
    private static WeakReference<AbstractC9675b> f30274c;

    /* renamed from: a */
    public static synchronized AbstractC9675b m7473a() {
        AbstractC9675b abstractC9675b;
        synchronized (AbstractC9675b.class) {
            abstractC9675b = f30274c == null ? null : f30274c.get();
            if (abstractC9675b == null) {
                abstractC9675b = new C9687c(C9751b.m7205d().m7224a());
                f30274c = new WeakReference<>(abstractC9675b);
            }
        }
        return abstractC9675b;
    }

    /* renamed from: a */
    public abstract AbstractC5285f<Void> mo7437a(AbstractC9680g... abstractC9680gArr);

    /* renamed from: a */
    public abstract AbstractC5285f<Void> mo7436a(String... strArr);

    /* renamed from: b */
    public abstract AbstractC5285f<Void> mo7435b();
}
