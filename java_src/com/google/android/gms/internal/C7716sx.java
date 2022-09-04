package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.Looper;
import java.util.HashMap;
/* renamed from: com.google.android.gms.internal.sx */
/* loaded from: classes2.dex */
public class C7716sx<L, W extends IInterface> {

    /* renamed from: a */
    private final Looper f25568a;

    /* renamed from: b */
    private final AbstractC7717a<L, W> f25569b;

    /* renamed from: c */
    private final HashMap<L, W> f25570c = new HashMap<>();

    /* renamed from: com.google.android.gms.internal.sx$a */
    /* loaded from: classes2.dex */
    public interface AbstractC7717a<L, W extends IInterface> {
        /* renamed from: a */
        W mo13660a(L l, Looper looper);
    }

    public C7716sx(Looper looper, AbstractC7717a<L, W> abstractC7717a) {
        this.f25568a = looper;
        this.f25569b = abstractC7717a;
    }

    /* renamed from: a */
    public W m13661a(L l) {
        W w = this.f25570c.get(l);
        if (w == null) {
            W mo13660a = this.f25569b.mo13660a(l, this.f25568a);
            this.f25570c.put(l, mo13660a);
            return mo13660a;
        }
        return w;
    }
}
