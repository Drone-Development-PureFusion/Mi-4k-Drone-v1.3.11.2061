package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.internal.aak;
import java.util.WeakHashMap;
@aaa
/* loaded from: classes.dex */
public final class aal {

    /* renamed from: a */
    private WeakHashMap<Context, C6116a> f20802a = new WeakHashMap<>();

    /* renamed from: com.google.android.gms.internal.aal$a */
    /* loaded from: classes2.dex */
    private class C6116a {

        /* renamed from: a */
        public final long f20803a = C3779u.m26884k().mo16434a();

        /* renamed from: b */
        public final aak f20804b;

        public C6116a(aak aakVar) {
            this.f20804b = aakVar;
        }

        /* renamed from: a */
        public boolean m18600a() {
            return C7788uf.f25753aK.m13486c().longValue() + this.f20803a < C3779u.m26884k().mo16434a();
        }
    }

    /* renamed from: a */
    public aak m18601a(Context context) {
        C6116a c6116a = this.f20802a.get(context);
        aak m18608a = (c6116a == null || c6116a.m18600a() || !C7788uf.f25752aJ.m13486c().booleanValue()) ? new aak.C6115a(context).m18608a() : new aak.C6115a(context, c6116a.f20804b).m18608a();
        this.f20802a.put(context, new C6116a(m18608a));
        return m18608a;
    }
}
