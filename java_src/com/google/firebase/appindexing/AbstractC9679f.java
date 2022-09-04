package com.google.firebase.appindexing;

import com.google.android.gms.p239g.AbstractC5285f;
import com.google.firebase.C9751b;
import com.google.firebase.appindexing.internal.C9699e;
import java.lang.ref.WeakReference;
/* renamed from: com.google.firebase.appindexing.f */
/* loaded from: classes2.dex */
public abstract class AbstractC9679f {

    /* renamed from: a */
    public static final String f30275a = "FirebaseUserActions";

    /* renamed from: b */
    private static WeakReference<AbstractC9679f> f30276b;

    /* renamed from: a */
    public static synchronized AbstractC9679f m7472a() {
        AbstractC9679f abstractC9679f;
        synchronized (AbstractC9679f.class) {
            abstractC9679f = f30276b == null ? null : f30276b.get();
            if (abstractC9679f == null) {
                abstractC9679f = new C9699e(C9751b.m7205d().m7224a());
                f30276b = new WeakReference<>(abstractC9679f);
            }
        }
        return abstractC9679f;
    }

    /* renamed from: a */
    public abstract AbstractC5285f<Void> mo7419a(AbstractC9658a abstractC9658a);

    /* renamed from: b */
    public abstract AbstractC5285f<Void> mo7418b(AbstractC9658a abstractC9658a);
}
