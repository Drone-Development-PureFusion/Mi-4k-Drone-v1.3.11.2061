package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.location.internal.C8179d;
import com.google.android.gms.location.internal.C8193f;
import com.google.android.gms.location.internal.C8215l;
import com.google.android.gms.location.internal.C8223q;
/* renamed from: com.google.android.gms.location.n */
/* loaded from: classes2.dex */
public class C8229n {

    /* renamed from: e */
    private static final C4467a.C4478g<C8215l> f26833e = new C4467a.C4478g<>();

    /* renamed from: f */
    private static final C4467a.AbstractC4473b<C8215l, C4467a.AbstractC4468a.C4470b> f26834f = new C4467a.AbstractC4473b<C8215l, C4467a.AbstractC4468a.C4470b>() { // from class: com.google.android.gms.location.n.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public C8215l mo7438a(Context context, Looper looper, C4626s c4626s, C4467a.AbstractC4468a.C4470b c4470b, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new C8215l(context, looper, abstractC4491b, abstractC4492c, "locationServices", c4626s);
        }
    };

    /* renamed from: a */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f26829a = new C4467a<>("LocationServices.API", f26834f, f26833e);

    /* renamed from: b */
    public static final AbstractC8166e f26830b = new C8179d();

    /* renamed from: c */
    public static final AbstractC8170h f26831c = new C8193f();

    /* renamed from: d */
    public static final AbstractC8335q f26832d = new C8223q();

    /* renamed from: com.google.android.gms.location.n$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC8231a<R extends AbstractC4502m> extends ahl.AbstractC6343a<R, C8215l> {
        public AbstractC8231a(AbstractC4489g abstractC4489g) {
            super(C8229n.f26829a, abstractC4489g);
        }
    }

    private C8229n() {
    }

    /* renamed from: a */
    public static C8215l m12372a(AbstractC4489g abstractC4489g) {
        boolean z = true;
        C4588d.m23618b(abstractC4489g != null, "GoogleApiClient parameter is required.");
        C8215l c8215l = (C8215l) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) f26833e);
        if (c8215l == null) {
            z = false;
        }
        C4588d.m23622a(z, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return c8215l;
    }
}
