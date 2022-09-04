package com.google.android.gms.internal;

import java.io.IOException;
/* renamed from: com.google.android.gms.internal.oj */
/* loaded from: classes2.dex */
public abstract class AbstractC7488oj<T> {
    /* renamed from: a */
    public final AbstractC7471nx m14336a(T t) {
        try {
            C7546pg c7546pg = new C7546pg();
            mo14173a(c7546pg, t);
            return c7546pg.m14255a();
        } catch (IOException e) {
            throw new C7472ny(e);
        }
    }

    /* renamed from: a */
    public abstract void mo14173a(C7602ps c7602ps, T t);

    /* renamed from: b */
    public abstract T mo14172b(C7598pp c7598pp);
}
