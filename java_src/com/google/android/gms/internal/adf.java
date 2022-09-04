package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7674ru;
/* loaded from: classes2.dex */
public class adf<T> {

    /* renamed from: a */
    public final T f21265a;

    /* renamed from: b */
    public final AbstractC7674ru.C7675a f21266b;

    /* renamed from: c */
    public final aii f21267c;

    /* renamed from: d */
    public boolean f21268d;

    /* renamed from: com.google.android.gms.internal.adf$a */
    /* loaded from: classes2.dex */
    public interface AbstractC6208a {
        /* renamed from: a */
        void mo18045a(aii aiiVar);
    }

    /* renamed from: com.google.android.gms.internal.adf$b */
    /* loaded from: classes2.dex */
    public interface AbstractC6209b<T> {
        /* renamed from: a */
        void mo18044a(T t);
    }

    private adf(aii aiiVar) {
        this.f21268d = false;
        this.f21265a = null;
        this.f21266b = null;
        this.f21267c = aiiVar;
    }

    private adf(T t, AbstractC7674ru.C7675a c7675a) {
        this.f21268d = false;
        this.f21265a = t;
        this.f21266b = c7675a;
        this.f21267c = null;
    }

    /* renamed from: a */
    public static <T> adf<T> m18047a(aii aiiVar) {
        return new adf<>(aiiVar);
    }

    /* renamed from: a */
    public static <T> adf<T> m18046a(T t, AbstractC7674ru.C7675a c7675a) {
        return new adf<>(t, c7675a);
    }

    /* renamed from: a */
    public boolean m18048a() {
        return this.f21267c == null;
    }
}
