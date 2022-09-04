package com.google.android.gms.contextmanager;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.awareness.AbstractC4092d;
import com.google.android.gms.awareness.AbstractC4093e;
import com.google.android.gms.awareness.C4090b;
import com.google.android.gms.awareness.snapshot.internal.C4120j;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.contextmanager.fence.internal.C4734c;
import com.google.android.gms.contextmanager.internal.C4764d;
/* renamed from: com.google.android.gms.contextmanager.c */
/* loaded from: classes2.dex */
public final class C4727c {

    /* renamed from: a */
    public static final C4467a.C4478g<C4764d> f17353a = new C4467a.C4478g<>();

    /* renamed from: b */
    public static final AbstractC4092d f17354b = new C4734c();

    /* renamed from: c */
    public static final AbstractC4093e f17355c = new C4120j();

    /* renamed from: e */
    private static final C4467a.AbstractC4473b<C4764d, C4090b> f17357e = new C4467a.AbstractC4473b<C4764d, C4090b>() { // from class: com.google.android.gms.contextmanager.c.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public C4764d mo7438a(Context context, Looper looper, C4626s c4626s, C4090b c4090b, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new C4764d(context, looper, c4626s, c4090b, abstractC4491b, abstractC4492c);
        }
    };

    /* renamed from: d */
    public static final C4467a<C4090b> f17356d = new C4467a<>("ContextManager.API", f17357e, f17353a);
}
