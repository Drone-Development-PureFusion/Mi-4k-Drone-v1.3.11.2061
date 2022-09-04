package com.android.volley;

import com.android.volley.AbstractC0900b;
/* renamed from: com.android.volley.p */
/* loaded from: classes.dex */
public class C0924p<T> {

    /* renamed from: a */
    public final T f2067a;

    /* renamed from: b */
    public final AbstractC0900b.C0901a f2068b;

    /* renamed from: c */
    public final C0967u f2069c;

    /* renamed from: d */
    public boolean f2070d;

    /* renamed from: com.android.volley.p$a */
    /* loaded from: classes.dex */
    public interface AbstractC0925a {
        /* renamed from: a */
        void mo29150a(C0967u c0967u);
    }

    /* renamed from: com.android.volley.p$b */
    /* loaded from: classes.dex */
    public interface AbstractC0926b<T> {
        /* renamed from: a */
        void mo34899a(T t);
    }

    private C0924p(C0967u c0967u) {
        this.f2070d = false;
        this.f2067a = null;
        this.f2068b = null;
        this.f2069c = c0967u;
    }

    private C0924p(T t, AbstractC0900b.C0901a c0901a) {
        this.f2070d = false;
        this.f2067a = t;
        this.f2068b = c0901a;
        this.f2069c = null;
    }

    /* renamed from: a */
    public static <T> C0924p<T> m37383a(C0967u c0967u) {
        return new C0924p<>(c0967u);
    }

    /* renamed from: a */
    public static <T> C0924p<T> m37382a(T t, AbstractC0900b.C0901a c0901a) {
        return new C0924p<>(t, c0901a);
    }

    /* renamed from: a */
    public boolean m37384a() {
        return this.f2069c == null;
    }
}
