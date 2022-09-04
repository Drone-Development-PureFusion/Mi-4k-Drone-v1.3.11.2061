package com.google.android.gms.internal;

import com.google.android.gms.internal.C7553pj;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.pm */
/* loaded from: classes2.dex */
public final class C7561pm<T> extends AbstractC7488oj<T> {

    /* renamed from: a */
    private final C7459nr f25095a;

    /* renamed from: b */
    private final AbstractC7488oj<T> f25096b;

    /* renamed from: c */
    private final Type f25097c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7561pm(C7459nr c7459nr, AbstractC7488oj<T> abstractC7488oj, Type type) {
        this.f25095a = c7459nr;
        this.f25096b = abstractC7488oj;
        this.f25097c = type;
    }

    /* renamed from: a */
    private Type m14232a(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    @Override // com.google.android.gms.internal.AbstractC7488oj
    /* renamed from: a */
    public void mo14173a(C7602ps c7602ps, T t) {
        AbstractC7488oj<T> abstractC7488oj = this.f25096b;
        Type m14232a = m14232a(this.f25097c, t);
        if (m14232a != this.f25097c) {
            abstractC7488oj = this.f25095a.m14403a((C7597po) C7597po.m14169a(m14232a));
            if ((abstractC7488oj instanceof C7553pj.C7555a) && !(this.f25096b instanceof C7553pj.C7555a)) {
                abstractC7488oj = this.f25096b;
            }
        }
        abstractC7488oj.mo14173a(c7602ps, t);
    }

    @Override // com.google.android.gms.internal.AbstractC7488oj
    /* renamed from: b */
    public T mo14172b(C7598pp c7598pp) {
        return this.f25096b.mo14172b(c7598pp);
    }
}
